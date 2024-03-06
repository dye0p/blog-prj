package com.dyeop.blog.damain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Coment extends BaseEntity { //댓글 엔티티

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

}
