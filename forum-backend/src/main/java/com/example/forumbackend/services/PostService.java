package com.example.forumbackend.services;

import com.example.forumbackend.domain.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PostService {

    List<Post> posts = new ArrayList<>();

    public List<Post> getAllPosts(Integer page, Integer pageSize) {
        if (page != null & pageSize != null) {
            return posts.subList(page * pageSize, page * pageSize + pageSize);
        } else return posts;
    }

    public List<Post> getAllPostsByTheme(String theme, Integer page, Integer pageSize) {
        log.info("Getting of all themes by theme '{}'", theme);
        if (page != null & pageSize != null) {
            return posts.stream().filter(entry -> entry.getTheme().getTitle().equals(theme)).collect(Collectors.toList())
                    .subList(page * pageSize, page * pageSize + pageSize);
        } else return posts.stream().filter(entry -> entry.getTheme().getTitle().equals(theme)).collect(Collectors.toList());
    }

    public void addPost(Post post) {
        if (post.getId() == null) post.setId(new Random().nextInt());
        posts.add(post);
    }

    public Post getPostById(Integer id) {
        return posts.stream()
                .filter(entry -> entry.getId().equals(id))
                .findFirst()
                .orElse(new Post());
    }

}
