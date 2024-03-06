package com.dyeop.blog.dao;

import com.dyeop.blog.damain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
