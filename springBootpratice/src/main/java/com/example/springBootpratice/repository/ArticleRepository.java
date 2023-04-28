package com.example.springBootpratice.repository;

import com.example.springBootpratice.Entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article,Long> {
    //꺽쇠 안에는 관리 대상 엔티티와 관리대상 엔티티에서 대표값의 타입을 넣어줘야한다.
}
