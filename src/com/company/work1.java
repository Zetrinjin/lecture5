package com.company;

/* Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
   Задать перегруженные методы возвращающие результат арифметических операций над заданными
   полями и полями типа BigDecimal*/

import java.math.BigDecimal;

public class work1 {

    int iArg1;
    int iArg2;
    double dArg1;
    double dArg2;
    BigDecimal arg1;
    BigDecimal arg2;

    public work1(int arg1, int arg2){
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
    }

    public work1(int arg1, double arg2){
        this.iArg1 = arg1;
        this.iArg2 = (int)arg2;
        this.dArg2 = arg2;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
    }

    public work1(double arg2,int arg1){
        this(arg1 , arg2);
    }
    public work1 (double arg1,double arg2){
        this.dArg1 = arg1;
        this.dArg2 = arg2;
        this.arg1 = new BigDecimal(arg1);
        this.arg2 = new BigDecimal(arg2);
    }


    public static void main(String[] args){

        System.out.println(new work1(30 , 5).addAsBigDecimal());
        System.out.println(new work1(30 , 5.0).addAsInteger());
        System.out.println(new work1(30.0 , 5).addAsNone());
        System.out.println(new work1(3.0 , 5.0).addAsDouble());
    }

    BigDecimal addAsBigDecimal(){
        return arg1.divide(arg2);
    }

    int addAsInteger(){
        return iArg1 + iArg2;
    }

    int addAsNone(){
        return iArg2 - iArg1;
    }

    double addAsDouble(){
        return dArg1*dArg2;
    }
}
