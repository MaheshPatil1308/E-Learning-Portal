package com.app.SMGSystemBackendSpringBoot.service;

import org.springframework.web.multipart.MultipartFile;

import com.app.SMGSystemBackendSpringBoot.pojo.Notes;

public interface INotesService {
	public Notes getNotesById(String id);
//	public Notes uploadNotes(MultipartFile notes );
}
