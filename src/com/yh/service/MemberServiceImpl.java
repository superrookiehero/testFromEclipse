package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.bean.Member;
import com.yh.mapper.MemberMapper;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper mapper;

	@Override
	public List<Member> findAllMember() {
		// TODO Auto-generated method stub
		return mapper.findAllMember();
	}

}
