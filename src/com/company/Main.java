/* Даниил Лазарев
Домашняя работа к 1 занятию.
 */

package com.company;

public class Main {
    public static void main(String[] args) {
	doTwo();
	System.out.println(doThree(1,2,3,4));
	System.out.println(doFour(5,7));
	doFive(7);
	System.out.println(doSix(-6));
	doSeven("Alexcander");
	doEight(2020);
    }

    //Задание №1-2
    static void doTwo(){
        byte b = 120;
        System.out.println(b);
        short val = 17_000;
        System.out.println(val);
        int i = 2000000;
        System.out.println(i);
        long l = 150_000_000_000L;
        System.out.println(l);
        float pi = 3.14_15F;
        System.out.println(pi);
        double d1 = 32.123;
        System.out.println(d1);
        char c ='Q';
        System.out.println(c);
        boolean isActive = true;
        System.out.println(isActive);
        String name = "Max";
        System.out.println(name);

    }
    //Задание №3
    static int doThree(int a, int b, int c, int d){
        System.out.println("\n");
        return a * (b +(c / d));
    }

    //Задание №4
    static boolean doFour(int a, int b){
        System.out.println('\n');
        int c = a + b;
        if (c > 10 && c > 20) return true;
        else return false;

    }

    //Задание №5
    static void doFive(int a){
        System.out.println("\n");
        if(a>=0) System.out.println("Numb" + a + "positive");
        else System.out.println("Numb" + a + "negative");

    }

    //Задание №6
    static boolean doSix(int a){
        System.out.println("\n");
        if (a<0) return true;
        else return false;
    }

    //Задание №7
    static void doSeven(String name){
        System.out.println("\n");
        System.out.println("Hello" + name + "!");
    }

    //Задание №8
    static void doEight(int year){
        System.out.println("\n");
        if (!(year % 4 == 0) || (year % 100 == 0) && !(year % 400 == 0)) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }





}
