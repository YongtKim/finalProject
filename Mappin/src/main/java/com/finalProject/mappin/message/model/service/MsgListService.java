package com.finalProject.mappin.message.model.service;

import com.finalProject.mappin.message.model.vo.MsgList;

public interface MsgListService {

	MsgList select(String first_id, String second_id);

	int insert(String first_id, String second_id);

	int delete(int msgList_id);

}
