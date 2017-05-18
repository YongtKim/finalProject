package com.finalProject.mappin.message.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.finalProject.mappin.message.model.service.MessageService;
import com.finalProject.mappin.message.model.service.MsgListService;
import com.finalProject.mappin.message.model.vo.Message;
import com.finalProject.mappin.message.model.vo.MsgList;

@Controller
public class MessageController {

	@Autowired
	private MessageService messageService;
	private MsgListService msgListService;
	
	@RequestMapping("/selectList.msg")
	public ModelAndView selectList(String member_id, List<MsgList> msgList, ModelAndView mv){
		msgList =  (List<MsgList>) messageService.selectList(member_id);
		mv.addObject("msgList",msgList);
		mv.setViewName("messageRoom");
		return mv;
	}
	
	@RequestMapping("/insert.msg")
	public ModelAndView insert(String first_id, String second_id , MsgList msgList, Message message, ModelAndView mv){
		msgList = msgListService.select(first_id, second_id);
		int result = 0;
		if(msgList == null){
			result = (int) msgListService.insert(first_id, second_id);
			if(result>0)
				msgList = msgListService.select(first_id, second_id);
		}
		result = (int) messageService.insert(msgList.getMsglist_id(), message);
		return mv;
	}
	
	@RequestMapping("/detail.msg")
	public ModelAndView detail(int msgList_id, List<Message> messageList, ModelAndView mv){
		messageList = messageService.detail(msgList_id);
		return mv;
	}
	
	@RequestMapping("/delete.msg")
	public ModelAndView delete(int msgList_id, ModelAndView mv){
		int result = msgListService.delete(msgList_id);
		return mv;
	}
}
