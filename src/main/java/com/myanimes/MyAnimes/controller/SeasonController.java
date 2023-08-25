package com.myanimes.MyAnimes.controller;

import com.myanimes.MyAnimes.entity.Season;
import com.myanimes.MyAnimes.repository.SeasonRepository;
import com.myanimes.MyAnimes.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://myanime-frontend.netlify.app/")
public class SeasonController {
    @Autowired
    private SeasonService seasonService;

    @GetMapping("/seasons")
    public List<Season> getAllSeasons() {
        return seasonService.getAllSeasons();
    }
    @GetMapping("/seasons/active")
    public List<Season> getActiveAnimes() {
        return seasonService.getActiveSeasons();
    }
}
