package com.drag.ftptowebpictures.controller;

import com.drag.ftptowebpictures.dao.FileRepository;
import com.drag.ftptowebpictures.model.File;
import com.drag.ftptowebpictures.model.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping(value = {"", "/"})
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @PostMapping("/login")
    public LoginResponse login(@PathVariable("login") String login, @PathVariable("password") String password) {
        return fileRepository.login(login, password) ? LoginResponse.LOGGED_IN : LoginResponse.ERROR;
    }

    @GetMapping("/all")
    public List<File> getAll() {
        return fileRepository.getAll();
    }
}
