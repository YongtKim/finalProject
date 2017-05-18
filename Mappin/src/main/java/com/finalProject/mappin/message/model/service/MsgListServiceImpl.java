package com.finalProject.mappin.message.model.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finalProject.mappin.message.model.dao.MsgListDao;
import com.finalProject.mappin.message.model.vo.MsgList;

@Service("msgListService")
@Transactional
public class MsgListServiceImpl implements MsgListService{

	
	private MsgListDao msgListDao;
	@Override
	public MsgList select(String first_id, String second_id) {

		return msgListDao.select(first_id, second_id);
	}

	@Override
	public int insert(String first_id, String second_id) {

		return msgListDao.insert(first_id, second_id);
	}

	@Override
	public int delete(int msgList_id) {

		return msgListDao.delete(msgList_id);
	}



}
