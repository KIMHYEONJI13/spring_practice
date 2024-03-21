package com.ohgiraffers.common;

import com.ohgiraffers.practice01.field.MemberController;

public class MemberDTO {

    private Long id;
    private String name;

    public MemberDTO() {}

    public MemberDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MemberDTP{id=" + id + ", name=" + name + "}";
    }

}
