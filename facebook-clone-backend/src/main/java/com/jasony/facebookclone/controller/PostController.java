/**
 * This class defines the REST endpoints for posts in the FacebookClone application.
 * It uses Spring annotations to map HTTP requests to Java methods, and delegates to the
 * PostService to handle the actual logic of adding and retrieving posts.
 */
package com.jasony.facebookclone.controller;

import com.jasony.facebookclone.model.Post;
import com.jasony.facebookclone.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post addPost(@RequestParam Map<String,String> requestParams
    ) throws Exception {
        String strPost = requestParams.get("post");
        String email = requestParams.get("email");
        String name = requestParams.get("name");
        String file = requestParams.get("file");
        String profilePic = requestParams.get("profilePic");

        Post post = Post.builder()
                .file(file)
                .name(name)
                .email(email)
                .post(strPost)
                .profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();
        post = postService.addPost(post);
        return post;
    }

    @GetMapping
    public List<Post> getPost() {
        return postService.getPost();
    }
}