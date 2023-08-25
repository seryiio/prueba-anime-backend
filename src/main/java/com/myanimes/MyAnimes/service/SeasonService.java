package com.myanimes.MyAnimes.service;

import com.myanimes.MyAnimes.entity.Season;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeasonService {
    List<Season> getAllSeasons();
    List<Season> getActiveSeasons();

    List<Season> getSeasonsforAnimes(Integer id);
}
