package com.dyeop.blog.service;

import com.dyeop.blog.damain.Posts;
import com.dyeop.blog.dao.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostsService {

    private final PostsRepository postsRepository;

    //저장
    public void post(Posts posts) {
        postsRepository.save(posts);
    }

    //전체 조회
    public List<Posts> postsList() {
        return postsRepository.findAll();
    }

    public Posts findOne(Long id) {
        return postsRepository.findById(id).get();
    }
}
