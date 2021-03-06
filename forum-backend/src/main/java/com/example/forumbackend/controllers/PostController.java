package com.example.forumbackend.controllers;

import com.example.forumbackend.domain.Post;
import com.example.forumbackend.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/{id}")
    public Post getOnePost(@PathVariable Integer id) {
        return postService.getPostById(id);
    }

    @GetMapping
    public List<Post> getAllPosts(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer pageSize
    ) {
        return postService.getAllPosts(page, pageSize);
    }

    @GetMapping("/themes/{theme}")
    public List<Post> getAllPostsByTheme(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer pageSize,
            @PathVariable String theme
    ) {
        return postService.getAllPostsByTheme(theme, page, pageSize);
    }
}
