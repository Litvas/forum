package com.example.forumbackend.services;

import com.example.forumbackend.domain.Post;
import com.example.forumbackend.domain.Theme;
import com.example.forumbackend.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@Slf4j
public class ThemeService {

    private List<Theme> themes = new ArrayList();

    public List getAllThemes() {
        log.info("Getting of all themes");
        return themes;
    }

    public void addTheme(Theme theme) {
        if (theme.getId() == null) theme.setId(new Random().nextInt());
        themes.add(theme);
    }

    public Theme getThemeById(Integer id) {
        return themes.stream()
                .filter(entry -> entry.getId().equals(id))
                .findFirst()
                .orElse(new Theme());
    }
}
