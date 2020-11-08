package com.StaticFinalClass;

public class StaticProg {
    public static void main(String args[]){

        StaticClass staticClass1 = new StaticClass();
        System.out.println(StaticClass.getCounter());

        StaticClass staticClass2 = new StaticClass();
        System.out.println(staticClass2.getCounter());

        StaticClass staticClass3 = new StaticClass();
        System.out.println(staticClass3.getCounter());

        CiaoMondoClass.CiaoMondo();

    }

    public static class CiaoMondoClass{
        public static void CiaoMondo(){
            System.out.println("Ciao Mondo");
        }
    }



}
