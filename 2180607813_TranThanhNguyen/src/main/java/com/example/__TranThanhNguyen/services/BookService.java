package com.example.__TranThanhNguyen.services;

import com.example.__TranThanhNguyen.entity.Book;
import com.example.__TranThanhNguyen.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private IBookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}

