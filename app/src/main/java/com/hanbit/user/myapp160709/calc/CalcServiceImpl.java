package com.hanbit.user.myapp160709.calc;

/**
 * Created by 1027 on 2016-07-09.
 */

/* 클래스에 implements에 인터페이스를 붙이고 generate(alt+insert) */
public class CalcServiceImpl implements CalcService{

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int devide(int num1, int num2) {
        return num1 / num2;
    }

    @Override
    public int remainder(int num1, int num2) {
        return num1 % num2;
    }
}
