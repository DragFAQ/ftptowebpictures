package com.drag.ftptowebpictures.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drag.ftptowebpictures.FileRepository.FileRepository;

@RestController
public class FileController {
	
	@Autowired
	private FileRepository fileRepository;
	
	@GetMapping("/")
	public String home() {
		return "Some";
	}
	
	
}
