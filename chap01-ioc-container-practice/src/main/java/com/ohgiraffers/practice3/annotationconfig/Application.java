package com.ohgiraffers.practice3.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BoardDAO boardDAO = context.getBean("boardDAO", BoardDAO.class);

        System.out.println(boardDAO.selectBoard(1L));
        System.out.println(boardDAO.insertBoard(new BoardDTO(3L, "도서도서도", "책책책채개첵", "북부구북")));
        System.out.println(boardDAO.selectBoard(3L));



    }

}
