package com.example.springBootpratice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // db가 해당 객체를 인식 ㅏㄱ능
public class Article {
    @Id  // 대표값을 지정
    @GeneratedValue  //1..2..3.. 자동 생성 어노테이션
    private  Long id; // 대표값
    @Column
    private String title;
    @Column
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
