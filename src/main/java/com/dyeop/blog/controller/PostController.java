package com.dyeop.blog.controller;

import com.dyeop.blog.damain.Posts;
import com.dyeop.blog.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostsService postsService;

    //모든 게시글 조회
    @GetMapping("/post")
    public List<Posts> show() {
        return postsService.postsList();
    }

    //게시글 등록
    @PostMapping("/post")
    public void savePost(@RequestBody Posts posts) {
        postsService.post(posts);
    }

    //수정
    @PutMapping("/post/{postid}/edit")
    public void update(@PathVariable Long postid, @RequestBody Posts posts) {
        Posts findPost = postsService.findOne(postid);

        findPost.setTitle(posts.getTitle());
        findPost.setContent(posts.getContent());
        findPost.setView(posts.getView());

        postsService.post(findPost);
    }


}
