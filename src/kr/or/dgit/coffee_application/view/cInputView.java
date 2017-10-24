package kr.or.dgit.coffee_application.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import kr.or.dgit.coffee_application.content.AbstractContent;
import kr.or.dgit.coffee_application.content.MenuContent;
import kr.or.dgit.coffee_application.content.cInputContent;
import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.dto.cInput;
import kr.or.dgit.coffee_application.list.AbstractList;
import kr.or.dgit.coffee_application.list.cInputList;
import kr.or.dgit.coffee_application.list.cOutputList;
import kr.or.dgit.coffee_application.service.cInputService;

public class cInputView extends AbstractView {

	private cInputService service;
	
	public cInputView(String title) {
		super(title);
	}

	@Override
	protected void createService() {
		service = new cInputService();
	}

	@Override
	protected AbstractList createList() {
		pList = new cInputList(service);
		pList.loadData();
		return pList;
	}

	

	@Override
	protected void insertContent(Object content) {
		service.insertcInput((cInput)content);
	}

	@Override
	protected void deleteContent(Object item) {
		service.deletecInput((cInput)item);
	}

	@Override
	protected void setContent(Object content) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected AbstractContent<cInput> createContent() {
		pContent = new cInputContent();
		return (AbstractContent<cInput>) pContent;
	}

}
