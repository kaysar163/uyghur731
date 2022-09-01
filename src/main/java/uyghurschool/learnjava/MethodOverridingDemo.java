package uyghurschool.learnjava;

import java.sql.SQLOutput;

public class MethodOverridingDemo {
    public static void main(String[] args) {
        //use class a
        ClassA classA=new ClassA();
        classA.printMessage();
        System.out.println(classA.calc(10,5));

       // ClassA myClass=new ClassB();C
        System.out.println("**********************************");
        ClassB  myClass= new ClassB();
        myClass.printMessage();

        System.out.println(myClass.calc(10,5));

    }

}
