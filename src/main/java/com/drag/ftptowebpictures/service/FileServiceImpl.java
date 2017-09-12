package com.drag.ftptowebpictures.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drag.ftptowebpictures.model.File;
import com.drag.ftptowebpictures.repository.FileRepository;

@Service("fileService")
public class FileServiceImpl implements FileService {
	
	@Autowired
	FileRepository fileRepository;

	@Override
	public File findById(int id) {
		return fileRepository.findOne(id);
	}

}
