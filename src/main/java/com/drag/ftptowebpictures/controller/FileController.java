package com.drag.ftptowebpictures.controller;

import com.drag.ftptowebpictures.dao.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

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

        if(isLogin) {
            session.setAttribute("login", login);
            session.setAttribute("password", password);

            return "redirect:/album";
        } else
            return "redirect:/";
    }

    @GetMapping("/album")
    public String showAlbum(HttpServletRequest request, Model model) {
        String path = request.getParameter("path");

        if(path == null)
            path = "";

        model.addAttribute("files", fileRepository.getAllByPath(path));

        return "album";
    }

    @GetMapping("getImage")
    public void getImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String imageId = request.getParameter("imageId");
        byte[] imageData = fileRepository.getImageFromDatabase(imageId);
        response.setContentType("image/jpeg");
        response.getOutputStream().write(imageData);
    }
}
