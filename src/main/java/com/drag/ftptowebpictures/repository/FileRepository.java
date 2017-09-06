package com.drag.ftptowebpictures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.drag.ftptowebpictures.model.File;

@RepositoryRestResource
public interface FileRepository extends JpaRepository<File, Long> {

}
