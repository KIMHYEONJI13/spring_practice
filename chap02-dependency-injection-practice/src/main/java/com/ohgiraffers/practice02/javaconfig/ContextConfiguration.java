package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO memberGenerator() {

        MemberDTO member = new MemberDTO();
        member.setId(1L);
        member.setNickname("ididid");

        return member;
    }

    @Bean
    public BoardDTO boardGenerator() {

        BoardDTO board = new BoardDTO();

        board.setId(2L);
        board.setTitle("ㅃㅃㅃ");
        board.setContent("도서도서도서");
        board.setWriter(new MemberDTO(3L,"출팜출팜"));

        return board;
    }


}
