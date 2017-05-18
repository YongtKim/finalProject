package com.finalProject.mappin.message.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.message.model.dao.MessageDao;
import com.finalProject.mappin.message.model.dao.MsgListDao;
import com.finalProject.mappin.message.model.vo.Message;
import com.finalProject.mappin.message.model.vo.MsgList;

@Service("messageService")
@Transactional
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageDao messageDao;
	
	@Override
	public MsgList selectList(String member_id) {
		return  messageDao.selectList(member_id);
	}

	@Override
	public int insert(int msglist_id, Message message) {
		return messageDao.insert(msglist_id, message);
	}

	@Override
	public List<Message> detail(int msgList_id) {
		return messageDao.detail(msgList_id);
	}

}
