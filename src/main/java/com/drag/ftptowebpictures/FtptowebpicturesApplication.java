package com.drag.ftptowebpictures;

import java.util.HashSet;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.drag.ftptowebpictures.model.File;

import com.drag.ftptowebpictures.repository.FileRepository;

@SpringBootApplication
public class FtptowebpicturesApplication implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(FtptowebpicturesApplication.class);
    
    @Autowired
    private FileRepository fileRepository;

	public static void main(String[] args) {
		SpringApplication.run(FtptowebpicturesApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		logger.info("Saving test data...");
		// TODO Auto-generated method stub
		final File file1 = new File("File1", "folder1", 2);
		final File file2 = new File("File2", "folder1", 7);
		final File file3 = new File("File3", "folder2", 1);
		final File file4 = new File("File4", "folder2", 5);
		
		fileRepository.save(new HashSet<File>() {
			private static final long serialVersionUID = 1L;

		{
			add(file1);
			add(file2);
			add(file3);
			add(file4);
		}});
		
		logger.info("OK!");
	}
}
