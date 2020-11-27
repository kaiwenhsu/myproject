package com.kaiwen;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new Person().hello();
        Person p=new Person();
        p.hello();
        //基本資料型態(小寫)
        int age = 19; //32 bits
        //Wrapper class包裝類別
        Integer age2 = 19;
        //Method
        age2.byteValue();

        short s = 1;//16 bits
        long l = 2 ;//64 bits
        char c ='A'; //16 bits
        Character c2 = 'A';
        byte b =  120 ;//8 bits
        float weight = 66.5f; //32 bits
        double height = 1.7; //64 bits
        boolean adult = true;
        boolean enroll = false;
        //Reference data type參照資料型態(大寫)
        String name = "Tom";


    }

}
