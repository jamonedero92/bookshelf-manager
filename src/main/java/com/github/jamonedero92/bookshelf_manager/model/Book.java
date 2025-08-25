package com.github.jamonedero92.bookshelf_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;


@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer ID;
    private String username;

    @NotBlank
    @Size(max=100)
    private String title;

    @NotBlank
    @Size(max=100)
    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\\s]+$")
    private String author;

    @NotBlank
    @Size(max=50)
    @Pattern(regexp = "^[a-zA-ZÀ-ÿ\\s]+$")
    private String genre;

    @Min(1000)
    @Max(2100)
    private int year;

    @NotNull
    private CompletionStatus status;

    public Book() {
    }

    public Book(Integer ID, String username, String title, String author, String genre, int year, CompletionStatus status) {
        this.ID = ID;
        this.username = username;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
