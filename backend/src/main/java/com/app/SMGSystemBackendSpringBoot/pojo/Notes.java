package com.app.SMGSystemBackendSpringBoot.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Notes {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int notes_id;
		private String notesName;
		private String notesType;
		@Lob
		private byte[] notesData;
//		public Notes( String name, String type, byte[] data) {
//			super();
//			this.notesName = notesName;
//			this.notesType = notesType;
//			this.notesData = notesData;
//		}
//		public Notes() {}
//		public String getNotesId() {
//			return notesId;
//		}
//		public void setNotesId(String notesId) {
//			this.notesId = notesId;
//		}
//		public String getNotesName() {
//			return notesName;
//		}
//		public void setNotesName(String notesName) {
//			this.notesName = notesName;
//		}
//		public String getNotesType() {
//			return notesType;
//		}
//		public void setNotesType(String notesType) {
//			this.notesType = notesType;
//		}
//		public byte[] getNotesData() {
//			return notesData;
//		}
//		public void setNotesData(byte[] notesData) {
//			this.notesData = notesData;
//		}
//		
		
}
