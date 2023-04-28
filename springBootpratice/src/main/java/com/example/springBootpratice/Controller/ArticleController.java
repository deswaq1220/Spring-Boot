package com.example.springBootpratice.Controller;

import com.example.springBootpratice.DTO.ArticleForm;
import com.example.springBootpratice.Entity.Article;
import com.example.springBootpratice.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        //1. dto 변환 entity
        Article article = form.toEntity();
        System.out.println(article.toString());

        //2. repository에게 entity db 안에 저장하게 하기
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
