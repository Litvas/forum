package com.example.forumbackend.services;

import com.example.forumbackend.domain.Theme;
import com.example.forumbackend.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ThemeService {

    private List<Theme> themes = new ArrayList();

    public List getAllThemes() {
        return themes;
    }

    public void addTheme(Theme theme) {
        if (theme.getId() == null) theme.setId(new Random().nextLong());
        themes.add(theme);
    }
}
