package com.github.jamonedero92.bookshelf_manager.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findAllByUsername(String username);
}
