package com.alking.java.designpattern;

import com.alking.java.designpattern.singleton.Singleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {


    private Singleton singleton;

    @Before
    public void before(){
        this.singleton = Singleton.getInstance();
    }

    @Test
    public void test(){

        for (int idx = 0 ; idx < 100;idx++){
            Singleton s = Singleton.getInstance();
            Assert.assertTrue("same",s == singleton);
        }
    }

    @Test
    public void multiThreadTest(){
        for (int idx = 0 ; idx < 100;idx++){

            Thread t = new Thread(){
                @Override
                public void run() {
                    Singleton s = Singleton.getInstance();
                    Assert.assertTrue(getName(),s == singleton);
                }
            };
            t.setName("t-"+idx);
            t.start();
        }

    }


}
