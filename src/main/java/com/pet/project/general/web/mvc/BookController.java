package com.pet.project.general.web.mvc;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private Map<Long, Book> books = new HashMap<>();
    private long idCounter = 1;

    @GetMapping
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return books.get(id);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        book.setId(idCounter++);
        books.put(book.getId(), book);
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id);
        books.put(id, book);
        return book;
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        books.remove(id);
    }
}
