package com.myanimes.MyAnimes.repository;

import com.myanimes.MyAnimes.entity.MyList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MyListRepository extends JpaRepository<MyList, Integer> {
}
