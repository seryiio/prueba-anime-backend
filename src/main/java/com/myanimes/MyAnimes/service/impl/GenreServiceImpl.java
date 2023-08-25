package com.myanimes.MyAnimes.service.impl;

import com.myanimes.MyAnimes.entity.Genre;
import com.myanimes.MyAnimes.repository.GenreRepository;
import com.myanimes.MyAnimes.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<Genre> listGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Optional<Genre> findGenre(Integer id) {
        return genreRepository.findById(id);
    }
}
