package com.finalProject.mappin.message.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finalProject.mappin.member.model.vo.Member;
import com.finalProject.mappin.message.model.vo.Message;
import com.finalProject.mappin.message.model.vo.MsgList;

@Repository("messageDao")
public class MessageDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public MessageDao(){}

	public MsgList selectList(String member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(int msglist_id, Message message) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Message> detail(int msgList_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
