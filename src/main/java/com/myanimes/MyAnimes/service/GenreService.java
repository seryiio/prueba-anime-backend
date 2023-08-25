package com.myanimes.MyAnimes.service;

import com.myanimes.MyAnimes.entity.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService{
    public List<Genre> listGenres();
    public Optional<Genre> findGenre(Integer id);
}
