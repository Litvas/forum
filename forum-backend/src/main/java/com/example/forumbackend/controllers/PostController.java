package com.example.forumbackend.controllers;

import com.example.forumbackend.domain.Post;
import com.example.forumbackend.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/{id}")
    public Post getOnePost(@PathVariable Integer id) {
        return postService.getPostById(id);
    }
}
