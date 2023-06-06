/**

 This class represents the implementation of the PostService interface.
 It communicates with the PostRepository to perform CRUD operations on the PostEntity model.
 It also handles converting PostEntity to Post and vice versa.
 */
package com.jasony.facebookclone.service;

import com.jasony.facebookclone.entity.PostEntity;
import com.jasony.facebookclone.model.Post;
import com.jasony.facebookclone.repository.PostRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postEntityRepository) {
        this.postRepository = postEntityRepository;
    }

    @Override
    public Post addPost(Post post) throws Exception {
        try {

            PostEntity postEntity = new PostEntity();
            BeanUtils.copyProperties(post, postEntity);
            if (post.getFile() != null && !post.getFile().equalsIgnoreCase("null"))
                postEntity.setImage(post.getFile());
            else
                postEntity.setImage(null);

            postEntity = postRepository.save(postEntity);

            post.setId(postEntity.getId());
            post.setFile(null);
            post.setImage(postEntity.getImage());

        } catch (Exception e) {
            throw new Exception("Could not save Post: " + e);
        }
        return post;
    }

    @Override
    public List<Post> getPost() {
        List<PostEntity> postEntities
                = postRepository.findAll();

        List<Post> posts = new ArrayList<>();
        posts = postEntities.stream()
                .map((postEntity) ->
                        Post.builder()
                                .id(postEntity.getId())
                                .timeStamp(postEntity.getTimeStamp())
                                .email(postEntity.getEmail())
                                .name(postEntity.getName())
                                .post(postEntity.getPost())
                                .image(postEntity.getImage())
                                .profilePic(postEntity.getProfilePic())
                                .build()
                ).collect(Collectors.toList());
        return posts;
    }
}