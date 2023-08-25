package com.myanimes.MyAnimes.controller;

import com.myanimes.MyAnimes.entity.Anime;
import com.myanimes.MyAnimes.service.AnimeService;
import com.myanimes.MyAnimes.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://seryiio.github.io/anime-frontend/")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @Autowired
    private SeasonService seasonService;

    @GetMapping("/animes")
    public List<Anime> getAllAnimes() {
        return animeService.listAnimes();
    }

    @GetMapping("/animes/{id}")
    public Optional<Anime> getAnimeById(@PathVariable("id") Integer id) {
        return animeService.findAnime(id);
    }
    @GetMapping("/animes/active")
    public List<Anime> getActiveAnimes() {
        return animeService.getActiveAnimes();
    }

}
