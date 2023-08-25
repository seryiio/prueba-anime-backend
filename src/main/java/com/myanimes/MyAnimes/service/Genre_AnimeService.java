package com.myanimes.MyAnimes.service;

import com.myanimes.MyAnimes.entity.Genre;
import com.myanimes.MyAnimes.entity.Genre_Anime;

import java.util.List;
import java.util.Optional;

public interface Genre_AnimeService {
    List<Genre_Anime> getAnimesByGenre(Optional<Genre> genre);
}
