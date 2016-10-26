package com.hu.structure.decorator.demo1;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
        super(component);
    }
    
    @Override
    public void sampleOperation() {
    	super.sampleOperation();
        // 写相关的业务代码
    }

}
