package de.solutiontogo.actions;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TutorialAction extends ActionSupport {

	public String execute() {
		System.out.println("TutorialAction - execute method");
		return SUCCESS;
	}
}
