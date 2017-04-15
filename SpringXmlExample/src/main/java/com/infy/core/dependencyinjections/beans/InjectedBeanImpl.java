package com.infy.core.dependencyinjections.beans;

public class InjectedBeanImpl implements InjectedBean {

	public void doSomething() {
		System.out.println("InjectedBean was correctly injected!");
	}
}
