package com.github.jamonedero92.bookshelf_manager.model;

public class Book {
   private Integer ID;
   private String Title;
   private String author;
   private String genre;
   private int year;
   private CompletionStatus status;

   public Book() {
   }

   public Book(Integer ID, String title, String author, String genre, int year, CompletionStatus status) {
      this.ID = ID;
      Title = title;
      this.author = author;
      this.genre = genre;
      this.year = year;
      this.status = status;
   }

   public Integer getID() {
      return ID;
   }

   public void setID(Integer ID) {
      this.ID = ID;
   }

   public String getTitle() {
      return Title;
   }

   public void setTitle(String title) {
      Title = title;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public CompletionStatus getStatus() {
      return status;
   }

   public void setStatus(CompletionStatus status) {
      this.status = status;
   }
}
