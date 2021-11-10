package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("HOLIS DESDE MI IMPLEMENTACIÓN PROPIA DEL BEAN");
    }
}
