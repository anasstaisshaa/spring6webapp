package com.anastasiia.spring6webapp.services;

import com.anastasiia.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
