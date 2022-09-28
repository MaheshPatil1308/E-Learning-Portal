package com.app.SMGSystemBackendSpringBoot.pojo;

import java.time.LocalDate;  

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;

	@Column(name="course_name" ,length = 20)
	private String courseName;

	@Column(name="start_date")
	private LocalDate startDate;

	@Column(name="end_date")
	private LocalDate endDate;
//	
//	@Column(name="video_link")
//	private String videoLink;

//	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
//	private List<Notes> notesList=new ArrayList<>();
//	
	@OneToMany(mappedBy = "assignedStudentCourse",cascade = CascadeType.ALL ,orphanRemoval = true)
	@JsonIgnoreProperties("assignedStudentCourse")
	@JsonIgnore 
	private List<Student> studentsList = new ArrayList<>();

	@OneToMany(mappedBy = "assignedMentorCourseId",cascade = CascadeType.ALL ,orphanRemoval = true)
	@JsonIgnoreProperties("assignedMentorCourseId")
	@JsonIgnore
	private List<Mentor> mentorsList = new ArrayList<>();
	


	public Course() {
		System.out.println("In Course's para-less Constructor!");
	}	




//	public String getVideoLink() {
//		return videoLink;
//	}
//
//
//
//
//	public void setVideoLink(String videoLink) {
//		this.videoLink = videoLink;
//	}



//
//	public List<Notes> getNotesList() {
//		return notesList;
//	}




//	public void setNotesList(List<Notes> notesList) {
//		this.notesList = notesList;
//	}




	public Course(int courseId, String courseName, LocalDate startDate, LocalDate endDate, String videoLink,
			 List<Student> studentsList, List<Mentor> mentorsList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
		//this.videoLink = videoLink;
	//	this.notesList = notesList;
		this.studentsList = studentsList;
		this.mentorsList = mentorsList;
	}




	public int getCourseId() { return courseId; }

	public void setCourseId(int courseId) { this.courseId = courseId; }

	public String getCourseName() { return courseName; }

	public void setCourseName(String courseName) { this.courseName = courseName; }

	public LocalDate getStartDate() { return startDate; }

	public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

	public LocalDate getEndDate() { return endDate; }

	public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

	public List<Student> getStudentsList() {
		return studentsList;
	}


	public void setStudentsList(List<Student> studentsList) { this.studentsList =
			studentsList; }

	public List<Mentor> getMentorsList() { return mentorsList; }

	public void setMentorsList(List<Mentor> mentorsList) { this.mentorsList =
			mentorsList; }


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}


}
