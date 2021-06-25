package com.example.forumbackend.services;

import com.example.forumbackend.domain.Post;
import com.example.forumbackend.domain.Theme;
import com.example.forumbackend.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class InitService {

    private final ThemeService themeService;
    private final UserService userService;
    private final PostService postService;

    @PostConstruct
    private void init() {
        for (int i = 0; i < 5; i++) {

            Theme theme = new Theme();
            theme.setId(i);
            theme.setTitle("Important" + i);
            themeService.addTheme(theme);

            User user = new User();
            user.setId(i);
            user.setName("User" + i);
            userService.addUser(user);
        }

        for (int i = 0; i < 1000; i++) {
            Post post = new Post();
            post.setId(i);
            post.setContent("Content" + i);
            post.setTheme(themeService.getThemeById(new Random().nextInt(5)));
            post.setAuthor(userService.getUserById(new Random().nextInt(5)));
            postService.addPost(post);
        }
    }

}
