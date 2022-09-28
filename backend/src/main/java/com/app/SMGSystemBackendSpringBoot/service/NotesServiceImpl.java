package com.app.SMGSystemBackendSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.app.SMGSystemBackendSpringBoot.pojo.Notes;
import com.app.SMGSystemBackendSpringBoot.respository.NotesRepository;

public class NotesServiceImpl implements INotesService {
	@Autowired
	private NotesRepository notesRepo;
	@Override
	public Notes getNotesById(String id) {
		// TODO Auto-generated method stub
		return notesRepo.findById(id).orElseThrow(null);
	}
//	@Override
//	public Notes uploadNotes(MultipartFile notes) {
//		String notesName=notes.getOriginalFilename();
//		Notes notesDoc=new Notes(notesName,((Notes) notes).getNotesType(),((Notes) notes).getNotesData());
//		return notesRepo.save(notesDoc);
//	}



}
