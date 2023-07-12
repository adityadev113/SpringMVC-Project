package com.entities;

import java.util.Date;

public class Todo {
	private String todoTitle;
	private String todoContent;
	private Date tododate;
	public Todo(String todoTitle, String todoContent, Date tododate) {
		super();
		this.todoTitle = todoTitle;
		this.todoContent = todoContent;
		this.tododate = tododate;
	}
	public String getTodoTitle() {
		return todoTitle;
	}
	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}
	public String getTodoContent() {
		return todoContent;
	}
	public void setTodoContent(String todoContent) {
		this.todoContent = todoContent;
	}
	public Date getTododate() {
		return tododate;
	}
	public void setTododate(Date tododate) {
		this.tododate = tododate;  
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTodoTitle()+" : "+this.todoContent;
	}
	
	

}
