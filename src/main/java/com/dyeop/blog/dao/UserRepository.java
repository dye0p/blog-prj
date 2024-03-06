package com.dyeop.blog.dao;

import com.dyeop.blog.damain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
