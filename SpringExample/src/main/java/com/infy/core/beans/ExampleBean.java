package com.infy.core.beans;

public class ExampleBean {

	private InjectedBean injectedBean;
	public void callExampleMethod() {
		//best practice, we should null check before calling method on reference
		if(injectedBean!=null)
		injectedBean.doSomething();
		else{
			System.out.println("Failed to process, because value of injectedBean is :"+ injectedBean);
		}
	}

	// Constructor injection
/*	public ExampleBeanByCons(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
		System.out.println("InjectedBean was injected in constructor.");
	}*/

	// Property setter injection
/*	public void setInjectedBean(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
		System.out.println("InjectedBean was injected in property setter.");
	}*/

}
