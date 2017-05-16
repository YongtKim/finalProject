package com.finalProject.mappin.message.model.service;

import java.util.List;

import com.finalProject.mappin.message.model.vo.Message;
import com.finalProject.mappin.message.model.vo.MsgList;

public interface MessageService {

	MsgList selectList(String member_id);

	int insert(int msglist_id, Message message);

	List<Message> detail(int msgList_id);

}
