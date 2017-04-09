package com.infy.core.beans;

public class ExampleBean {

	private InjectedBean injectedBean;
	
	// Constructor injection
	public ExampleBean(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
		System.out.println("InjectedBean was injected in constructor.");
	}
	
	// Property setter injection
/*	public void setInjectedBean(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
		System.out.println("InjectedBean was injected in property setter.");
	}*/

	public void callExampleMethod() {
		injectedBean.doSomething();
	}

}
