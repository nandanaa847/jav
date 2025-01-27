package com.xworkz.validate.dto;

import java.util.Objects;

public class LibraryDto {
	
	private String libraryname;
	private String libraryadress;
	private int totalbooks;
	private int bookID;
	private String bookname;
	private String bookauthor;
	private String genre;
	private int bookprice;
	
	public	LibraryDto() {
		
	}

	public LibraryDto(String libraryname, String libraryadress, int totalbooks, int bookID, String bookname,
			String bookauthor, String genre, int bookprice) {
		
		this.libraryname = libraryname;
		this.libraryadress = libraryadress;
		this.totalbooks = totalbooks;
		this.bookID = bookID;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.genre = genre;
		this.bookprice = bookprice;
	}

	public String getLibraryname() {
		return libraryname;
	}

	public void setLibraryname(String libraryname) {
		this.libraryname = libraryname;
	}

	public String getLibraryadress() {
		return libraryadress;
	}

	public void setLibraryadress(String libraryadress) {
		this.libraryadress = libraryadress;
	}

	public int getTotalbooks() {
		return totalbooks;
	}

	public void setTotalbooks(int totalbooks) {
		this.totalbooks = totalbooks;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "LibraryDto [libraryname=" + libraryname + ", libraryadress=" + libraryadress + ", totalbooks="
				+ totalbooks + ", bookID=" + bookID + ", bookname=" + bookname + ", bookauthor=" + bookauthor
				+ ", genre=" + genre + ", bookprice=" + bookprice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookID, bookauthor, bookname, bookprice, genre, libraryadress, libraryname, totalbooks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibraryDto other = (LibraryDto) obj;
		return bookID == other.bookID && Objects.equals(bookauthor, other.bookauthor)
				&& Objects.equals(bookname, other.bookname) && bookprice == other.bookprice
				&& Objects.equals(genre, other.genre) && Objects.equals(libraryadress, other.libraryadress)
				&& Objects.equals(libraryname, other.libraryname) && totalbooks == other.totalbooks;
	}

	
}
