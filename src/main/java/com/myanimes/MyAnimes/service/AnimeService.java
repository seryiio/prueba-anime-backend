package com.myanimes.MyAnimes.service;

import com.myanimes.MyAnimes.entity.Anime;
import com.myanimes.MyAnimes.entity.Season;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AnimeService{
    public List<Anime> listAnimes();

    public Optional<Anime> findAnime(Integer id);

    List<Anime> getActiveAnimes();

}
