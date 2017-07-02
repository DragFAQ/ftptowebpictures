package com.drag.ftptowebpictures.controller;

import com.drag.ftptowebpictures.dao.FileRepository;
import com.drag.ftptowebpictures.model.File;
import com.drag.ftptowebpictures.model.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @GetMapping(value = {"", "/"})
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "homepage";
    }

    @PostMapping("/login")
    public LoginResponse login(HttpServletRequest request, HttpSession session) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        boolean isLogin = fileRepository.login(login, password);

        if(isLogin) {
            session.setAttribute("login", login);
            return LoginResponse.LOGGED_IN;
        } else
            return LoginResponse.ERROR;
    }

    @GetMapping("/all")
    public List<File> getAll() {
        return fileRepository.getAll();
    }
}
