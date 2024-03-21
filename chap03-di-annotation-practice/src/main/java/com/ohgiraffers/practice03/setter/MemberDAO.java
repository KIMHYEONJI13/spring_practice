package com.ohgiraffers.practice03.setter;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO {

    private final Map<Long, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();
        memberMap.put(1L, new MemberDTO(1L, "김현지"));
        memberMap.put(2L, new MemberDTO(2L, "이수민"));
    }

    public Map<Long, MemberDTO> selectMember() {
        return memberMap;
    }

}
