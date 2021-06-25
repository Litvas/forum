package com.example.forumbackend.services;

import com.example.forumbackend.domain.Post;
import com.example.forumbackend.domain.Theme;
import com.example.forumbackend.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Service
public class InitService {

    private final ThemeService themeService;
    private final UserService userService;
    private final PostService postService;

    @PostConstruct
    private void init() {
        Theme theme0 = new Theme();
        theme0.setId(0L);
        theme0.setTitle("Important0");
        themeService.addTheme(theme0);

        Theme theme1 = new Theme();
        theme1.setId(1L);
        theme1.setTitle("Important1");
        themeService.addTheme(theme1);

        User user0 = new User();
        user0.setId(0L);
        user0.setName("User0");
        userService.addUser(user0);

        User user1 = new User();
        user1.setId(1L);
        user1.setName("User1");
        userService.addUser(user1);

        Post post0 = new Post();
        post0.setId(0L);
        post0.setContent("Content0");
        post0.setTheme(theme0);
        post0.setAuthor(user0);
        postService.addPost(post0);

        Post post1 = new Post();
        post1.setId(1L);
        post1.setContent("Content1");
        post1.setTheme(theme0);
        post1.setAuthor(user1);
        postService.addPost(post1);
    }

}
