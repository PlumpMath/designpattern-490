package com.amos.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestEvent {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.addListener(new MyListener1());
		btn.addListener(new MyListener2());
		btn.buttonClicked();
	}
}

class Button {
	private List<ActionListener> listeners = new ArrayList<ActionListener>();
	void addListener(ActionListener event) {
		listeners.add(event);
	}
	
	void buttonClicked(){
		for (ActionListener eventListener : listeners) {
			eventListener.actionPerformed(new ActionEvent(new Date(), "btn1"));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class ActionEvent {
	private Date date;
	private Object source;

	public ActionEvent(Date date, Object source) {
		super();
		this.date = date;
		this.source = source;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "ActionEvent [date=" + date + ", source=" + source + "]";
	}
	
}

interface  ActionListener {
	void actionPerformed(ActionEvent e);
}

class MyListener1 implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		System.out.println("点击了一下！");
		System.out.println(e.toString());
	}
}

class MyListener2 implements ActionListener{
	
	public void actionPerformed(ActionEvent e){
		System.out.println("点击了2下！");
		System.out.println(e.toString());
	}
}
