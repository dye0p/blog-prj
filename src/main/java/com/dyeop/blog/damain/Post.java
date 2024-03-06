package com.dyeop.blog.damain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Post extends BaseEntity { //게시글 엔티티

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private int view;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
