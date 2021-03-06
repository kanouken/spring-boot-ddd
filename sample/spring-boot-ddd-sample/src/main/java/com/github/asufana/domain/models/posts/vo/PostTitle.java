package com.github.asufana.domain.models.posts.vo;

import com.github.asufana.ddd.vo.AbstractVo;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Accessors(fluent = true)
@ToString
public class PostTitle extends AbstractVo {

    @Column(name = "post_title", length = 255, nullable = false)
    private String value;

    public PostTitle(String value) {
        this.value = value;
    }

    //for hibernate
    private PostTitle(){}
}
