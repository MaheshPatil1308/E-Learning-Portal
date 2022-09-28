package com.app.SMGSystemBackendSpringBoot.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.SMGSystemBackendSpringBoot.pojo.Notes;

public interface NotesRepository extends JpaRepository<Notes, String>{

}
