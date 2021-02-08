package ru.learning.library_again.dao;

import ru.learning.library_again.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDAO<Book>{
    List<Book> findTopBooks(int limit);
}
