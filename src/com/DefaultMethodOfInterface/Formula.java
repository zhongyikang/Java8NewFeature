package com.DefaultMethodOfInterface;

interface Formula {
    double calculate(int a);

    //通过使用default， 添加一个非abstract的方法，带方法体
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}