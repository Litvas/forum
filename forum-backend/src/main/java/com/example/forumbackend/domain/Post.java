package com.example.forumbackend.domain;

import lombok.Data;

@Data
public class Post {

    private Long id;

    private String content;

    private User author;

    private Theme theme;

}
