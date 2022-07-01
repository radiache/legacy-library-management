package com.me.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.me.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
