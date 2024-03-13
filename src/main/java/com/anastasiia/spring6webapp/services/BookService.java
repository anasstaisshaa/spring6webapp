package com.anastasiia.spring6webapp.services;

import com.anastasiia.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
