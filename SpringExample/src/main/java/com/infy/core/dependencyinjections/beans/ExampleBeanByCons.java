package com.infy.core.dependencyinjections.beans;

public class ExampleBeanByCons {

	private InjectedBean injectedBean;

	// Constructor injection
	public ExampleBeanByCons(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
		System.out.println("InjectedBean was injected in constructor.");
	}
	public void callExampleMethod() {
		injectedBean.doSomething();
	}

}
