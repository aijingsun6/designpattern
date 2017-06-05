package com.alking.java.designpattern.command.eg;

import java.util.ArrayList;

/**
 * 功能键设置窗口类
 */
public class FBSettingWindow<T> {

    private String title;

    private ArrayList<FunctionButton<T>> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void addFunctionButton(FunctionButton<T> fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton<T> fb) {
        functionButtons.remove(fb);
    }

    //显示窗口及功能键
    public void display() {
        System.out.println("show window:" + this.title);
        System.out.println("show function btn:");
        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("------------------------------");
    }
}
