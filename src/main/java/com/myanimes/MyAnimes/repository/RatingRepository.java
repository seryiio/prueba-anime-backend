package com.myanimes.MyAnimes.repository;

import com.myanimes.MyAnimes.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}
