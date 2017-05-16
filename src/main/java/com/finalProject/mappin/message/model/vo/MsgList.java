package com.finalProject.mappin.message.model.vo;

import java.io.Serializable;

public class MsgList implements Serializable{
	
	private int msglist_id;
	private String first_id;
	private String second_id;

	public MsgList(){}
	
	
	public MsgList(int msglist_id, String first_id, String second_id) {
		super();
		this.msglist_id = msglist_id;
		this.first_id = first_id;
		this.second_id = second_id;
	}


	public int getMsglist_id() {
		return msglist_id;
	}
	public String getFirst_id() {
		return first_id;
	}
	public String getSecond_id() {
		return second_id;
	}
	public void setMsglist_id(int msglist_id) {
		this.msglist_id = msglist_id;
	}
	public void setFirst_id(String first_id) {
		this.first_id = first_id;
	}
	public void setSecond_id(String second_id) {
		this.second_id = second_id;
	}
	@Override
	public String toString() {
		return "MsgList [msglist_id=" + msglist_id + ", first_id=" + first_id + ", second_id=" + second_id
				+ ", getMsglist_id()=" + getMsglist_id() + ", getFirst_id()=" + getFirst_id() + ", getSecond_id()="
				+ getSecond_id();
	}
	

}
