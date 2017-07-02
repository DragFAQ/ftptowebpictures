package com.drag.ftptowebpictures.controller;

import com.drag.ftptowebpictures.dao.FileRepository;
import com.drag.ftptowebpictures.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        boolean isLogin = fileRepository.login(login, password);

        if(isLogin)
            session.setAttribute("login", login);

        return "redirect:/";
    }

    @GetMapping("/all")
    public List<File> getAll() {
        return fileRepository.getAll();
    }
}
