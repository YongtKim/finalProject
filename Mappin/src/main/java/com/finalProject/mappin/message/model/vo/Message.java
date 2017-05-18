package com.finalProject.mappin.message.model.vo;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
 

	private int msglist_id;
	private String sender;
	private String receiver;
	private String msg_text;
	private Date msg_date;
	private String msg_check;
	
	public Message(){}
	
	
	public Message(int msglist_id, String sender, String receiver, String msg_text, Date msg_date, String msg_check) {
		super();
		this.msglist_id = msglist_id;
		this.sender = sender;
		this.receiver = receiver;
		this.msg_text = msg_text;
		this.msg_date = msg_date;
		this.msg_check = msg_check;
	}
	
	
	public int getMsglist_id() {
		return msglist_id;
	}
	public String getSender() {
		return sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public String getMsg_text() {
		return msg_text;
	}
	public Date getMsg_date() {
		return msg_date;
	}
	public String getMsg_check() {
		return msg_check;
	}
	public void setMsglist_id(int msglist_id) {
		this.msglist_id = msglist_id;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public void setMsg_text(String msg_text) {
		this.msg_text = msg_text;
	}
	public void setMsg_date(Date msg_date) {
		this.msg_date = msg_date;
	}
	public void setMsg_check(String msg_check) {
		this.msg_check = msg_check;
	}
	
	
	@Override
	public String toString() {
		return "Message [msglist_id=" + msglist_id + ", sender=" + sender + ", receiver=" + receiver + ", msg_text="
				+ msg_text + ", msg_date=" + msg_date + ", msg_check=" + msg_check + ", getMsglist_id()="
				+ getMsglist_id() + ", getSender()=" + getSender() + ", getReceiver()=" + getReceiver()
				+ ", getMsg_text()=" + getMsg_text() + ", getMsg_date()=" + getMsg_date() + ", getMsg_check()="
				+ getMsg_check() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
