package com.myanimes.MyAnimes.service.impl;

import com.myanimes.MyAnimes.entity.Season;
import com.myanimes.MyAnimes.repository.SeasonRepository;
import com.myanimes.MyAnimes.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonServiceImpl implements SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    @Override
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }

    @Override
    public List<Season> getActiveSeasons() {
        return seasonRepository.findActiveSeason();
    }

    @Override
    public List<Season> getSeasonsforAnimes(Integer id) {
        return seasonRepository.findByAnimeId(id);
    }


}
