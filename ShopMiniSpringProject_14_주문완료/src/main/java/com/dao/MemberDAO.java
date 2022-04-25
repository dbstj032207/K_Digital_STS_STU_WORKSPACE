package com.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.MemberDTO;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate template;	//자동주입

	public int memberAdd(MemberDTO m) {
		return template.insert("MemberMapper.memberAdd", m);
	}

	public MemberDTO login(Map<String, String> map) {
		return template.selectOne("MemberMapper.login", map);
	}

	public MemberDTO myPage(String userid) {
		return template.selectOne("MemberMapper.mypage", userid);
	}

	public int memberUpdate(MemberDTO dto) {
		return template.update("MemberMapper.memberUpdate", dto);
	}
}
