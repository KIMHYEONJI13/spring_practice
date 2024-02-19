package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationPractice02")
public class ContextConfiguration {

    @Bean(name = "boardDTO")
    public BoardDTO getBoard() {
        return new BoardDTO(3L, "도서2", "책책책책", "북북북");
    }

}
