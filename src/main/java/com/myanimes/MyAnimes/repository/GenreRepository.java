package com.myanimes.MyAnimes.repository;

import com.myanimes.MyAnimes.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
