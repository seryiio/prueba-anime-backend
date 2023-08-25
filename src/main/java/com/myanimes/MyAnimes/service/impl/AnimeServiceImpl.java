package com.myanimes.MyAnimes.service.impl;

import com.myanimes.MyAnimes.entity.Anime;
import com.myanimes.MyAnimes.entity.Season;
import com.myanimes.MyAnimes.repository.AnimeRepository;
import com.myanimes.MyAnimes.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimeServiceImpl implements AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    @Override
    public List<Anime> listAnimes() {
        return animeRepository.findAll();
    }

    @Override
    public Optional<Anime> findAnime(Integer id) {
        return animeRepository.findById(id);
    }

    @Override
    public List<Anime> getActiveAnimes() {
        return animeRepository.findActiveAnime();
    }

}
