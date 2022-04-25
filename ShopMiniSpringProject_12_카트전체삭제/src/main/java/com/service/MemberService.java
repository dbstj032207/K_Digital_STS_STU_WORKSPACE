package com.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDAO;
import com.dto.MemberDTO;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;

	public int memberAdd(MemberDTO m) {
		return dao.memberAdd(m);
	}

	public MemberDTO login(Map<String, String> map) {
		return dao.login(map);
	}

	public MemberDTO myPage(String userid) {
		return dao.myPage(userid);
	}

	public int memberUpdate(MemberDTO dto) {
		return dao.memberUpdate(dto);
	}
	
}
