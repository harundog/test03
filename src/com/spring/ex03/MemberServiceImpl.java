package com.spring.ex03;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	
	@Override
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public void listMember() {
		memberDAO.listMembers();
	}
	
}
