package com.infy.core.dependencyinjections.beans;

public class ExampleBeanBySetter {

	private InjectedBean injectedBean;

	// Property setter injection
	public void setInjectedBean(InjectedBean injectedBean) {
		this.injectedBean = injectedBean;
		System.out.println("InjectedBean was injected in property setter.");
	}

	public void callExampleMethod() {
		injectedBean.doSomething();
	}

}
