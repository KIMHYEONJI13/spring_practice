package com.ohgiraffers.practice01.xmlconfig;

import com.ohgiraffers.common.BoardDTO;
import com.sun.security.jgss.GSSUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("com/ohgiraffers/practice01/xmlconfig/spring-context.xml");

        /* 오류 발생 확인 필요 */
        BoardDTO boardDTO = context.getBean(BoardDTO.class);


        System.out.println(boardDTO);

    }

}