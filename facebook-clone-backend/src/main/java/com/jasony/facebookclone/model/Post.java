package com.jasony.facebookclone.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private String id;

    private String post;
    private String name;
    private String email;
    private String timeStamp;

    private String image;
    private String file;
    private String profilePic;
    private String imageName;
}