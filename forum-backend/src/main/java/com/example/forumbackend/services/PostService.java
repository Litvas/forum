package com.example.forumbackend.services;

import com.example.forumbackend.domain.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PostService {

    List<Post> posts = new ArrayList<>();

    public List<Post> getAllPosts(Integer page, Integer pageSize) {
        if (page != null & pageSize != null) {
            return posts.subList(page * pageSize, page * pageSize + pageSize);
        } else return posts;
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
