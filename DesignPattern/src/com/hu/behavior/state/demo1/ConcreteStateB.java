package com.hu.behavior.state.demo1;

public class ConcreteStateB implements State {

	@Override
    public void handle(String sampleParameter) {
        
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }

}
