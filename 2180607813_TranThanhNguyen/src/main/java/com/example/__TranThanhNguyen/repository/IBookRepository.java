package com.example.__TranThanhNguyen.repository;

import com.example.__TranThanhNguyen.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}

