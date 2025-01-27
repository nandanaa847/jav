package com.xworkz.validate.dto;

import java.util.Objects;

public class DigiLockerDto {
	
	
		
		private int lockerID;
		private String lockername;
		private int userID;
		private String username;
		private String password;
		private int passwordcapacity;
		private String lockerstatus;
		private String doctype;
		private String docname;
		private int docID;
		
		public DigiLockerDto() {
			
			
		}

		public DigiLockerDto(int lockerID, String lockername, int userID, String username, String password,
				int passwordcapacity, String lockerstatus, String doctype, String docname, int docID) {
			
			this.lockerID = lockerID;
			this.lockername = lockername;
			this.userID = userID;
			this.username = username;
			this.password = password;
			this.passwordcapacity = passwordcapacity;
			this.lockerstatus = lockerstatus;
			this.doctype = doctype;
			this.docname = docname;
			this.docID = docID;
		}

		public int getLockerID() {
			return lockerID;
		}

		public void setLockerID(int lockerID) {
			this.lockerID = lockerID;
		}

		public String getLockername() {
			return lockername;
		}

		public void setLockername(String lockername) {
			this.lockername = lockername;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getPasswordcapacity() {
			return passwordcapacity;
		}

		public void setPasswordcapacity(int passwordcapacity) {
			this.passwordcapacity = passwordcapacity;
		}

		public String getLockerstatus() {
			return lockerstatus;
		}

		public void setLockerstatus(String lockerstatus) {
			this.lockerstatus = lockerstatus;
		}

		public String getDoctype() {
			return doctype;
		}

		public void setDoctype(String doctype) {
			this.doctype = doctype;
		}

		public String getDocname() {
			return docname;
		}

		public void setDocname(String docname) {
			this.docname = docname;
		}

		public int getDocID() {
			return docID;
		}

		public void setDocID(int docID) {
			this.docID = docID;
		}

		@Override
		public String toString() {
			return "DigitLockerDto [lockerID=" + lockerID + ", lockername=" + lockername + ", userID=" + userID
					+ ", username=" + username + ", password=" + password + ", passwordcapacity=" + passwordcapacity
					+ ", lockerstatus=" + lockerstatus + ", doctype=" + doctype + ", docname=" + docname + ", docID="
					+ docID + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(docID, docname, doctype, lockerID, lockername, lockerstatus, password, passwordcapacity,
					userID, username);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DigiLockerDto other = (DigiLockerDto) obj;
			return docID == other.docID && Objects.equals(docname, other.docname)
					&& Objects.equals(doctype, other.doctype) && lockerID == other.lockerID
					&& Objects.equals(lockername, other.lockername) && Objects.equals(lockerstatus, other.lockerstatus)
					&& Objects.equals(password, other.password) && passwordcapacity == other.passwordcapacity
					&& userID == other.userID && Objects.equals(username, other.username);
		}

}