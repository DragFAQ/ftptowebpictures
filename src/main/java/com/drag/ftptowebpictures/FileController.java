package com.drag.ftptowebpictures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/files")
@EnableAutoConfiguration
public class FileController {
/*
    private FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }
*/
    @GetMapping(value = {"", "/"})
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(FileController.class, args);
    }
}
