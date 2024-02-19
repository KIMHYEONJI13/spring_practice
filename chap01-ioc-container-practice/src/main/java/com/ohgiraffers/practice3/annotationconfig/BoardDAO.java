package com.ohgiraffers.practice3.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BoardDAO {

    private final Map<Long, BoardDTO> boardMap;

    public BoardDAO() {
        boardMap = new HashMap<>();

        boardMap.put(1L, new BoardDTO(1L, "도서도", "책책책책", "도도도"));
        boardMap.put(2L, new BoardDTO(2L, "도서도서", "책책책책책", "도도도도"));
    }

    public BoardDTO selectBoard(Long id) {
        return boardMap.get(id);
    }

    public boolean insertBoard(BoardDTO newBoard) {
        int before = boardMap.size();

        boardMap.put(newBoard.getId(), newBoard);

        int after = boardMap.size();

        return after > before? true : false;
    }

}
