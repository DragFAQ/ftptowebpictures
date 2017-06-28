package com.drag.ftptowebpictures.controller;

import com.drag.ftptowebpictures.dao.FileRepository;
import com.drag.ftptowebpictures.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    DataSource dataSource;

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = {"", "/"})
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @GetMapping("/all")
    public List<File> getAll() {
        return fileRepository.getAll();
    }
}
