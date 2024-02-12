package org.Tutorial;


class B{
    public void A(){
        System.out.println("HEllo");
    }
}

class D extends B{
    public  void A(){
        System.out.println("HI");
    }
}

public class Main {





    public static void main(String[] args) {

        B b = new B();
        D d = new D();
        B b1 = new D();
        b1.A();     
//        D.A();
//        B.A();

        System.out.println();
    }

}