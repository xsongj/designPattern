package com.jxs.adapterClassExample;

public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jinGong() {

        System.out.println("外国中锋 " + name + " 进攻！");
    }


    public void fangShou() {

        System.out.println("外国中锋 " + name + " 防守");
    }
}
