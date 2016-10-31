package com.hu.behavior.iterator.demo2;

public abstract class Aggregate {

	/**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();

}
