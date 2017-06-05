package com.alking.java.designpattern.simplefactory;

/**
 * Created by sunaijing on 2017/6/3.
 */
public class Factory {

    public static final int PRODUCT_TYPE_A = 1;

    public static final int PRODUCT_TYPE_B = 2;

    public static final int PRODUCT_TYPE_C = 3;

    public Product create(int type){

        Product p = null;

        switch (type){
            case PRODUCT_TYPE_A:
                p =  new ConcreteProductA();
                break;
            case PRODUCT_TYPE_B:
                p = new ConcreteProductB();
                break;
            case PRODUCT_TYPE_C:
                p = new ConcreteProductC();
                break;
            default:
                break;
        }

        return  p;

    }

}
