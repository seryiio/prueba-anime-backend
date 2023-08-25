package com.myanimes.MyAnimes.controller;

import com.myanimes.MyAnimes.entity.Anime;
import com.myanimes.MyAnimes.entity.Genre;
import com.myanimes.MyAnimes.repository.GenreRepository;
import com.myanimes.MyAnimes.service.AnimeService;
import com.myanimes.MyAnimes.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/genres")
    public List<Genre> listGenresAll(){
        return genreRepository.findAll();
    }
}
