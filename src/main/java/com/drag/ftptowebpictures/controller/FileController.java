package com.drag.ftptowebpictures.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
	
	@GetMapping("/")
	public String home() {
		return "Some";
	}
	
	
}
