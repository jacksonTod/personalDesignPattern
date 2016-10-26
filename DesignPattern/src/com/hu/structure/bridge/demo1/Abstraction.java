package com.hu.structure.bridge.demo1;

public abstract class Abstraction {

	protected Implementor impl;
    
    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    //示例方法
    public void operation(){
        
        impl.operationImpl();
    }

}
