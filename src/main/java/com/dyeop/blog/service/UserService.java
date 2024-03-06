package com.dyeop.blog.service;


import com.dyeop.blog.damain.User;
import com.dyeop.blog.dao.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    //가입
    public Long join(User user) {
        userRepository.save(user);

        return user.getId();
    }

    //id로 회원 찾기
    public User findOne(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
