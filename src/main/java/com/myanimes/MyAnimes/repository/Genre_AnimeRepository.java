package com.myanimes.MyAnimes.repository;

import com.myanimes.MyAnimes.entity.Genre;
import com.myanimes.MyAnimes.entity.Genre_Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface Genre_AnimeRepository extends JpaRepository<Genre_Anime, Integer> {
    List<Genre_Anime> findByGenre(Optional<Genre> genre);
}
