package org.Tutorial.two;

import java.io.IOException;

public class CtorTypes {
    private int number;
    private  String name;

    public CtorTypes(){
        //non paramaterized
        this.number = 57;
        this.name = "Arya";
    }



    public  CtorTypes(int _number, String _name){
            //paramaterized
        this.number = _number;
        this.name =  _name;
    }

    public  CtorTypes(CtorTypes _c)
    {
        this.number = _c.number;
        this.name = _c.name;
    }

    public void printData()
    {
        System.out.println("Roll no: "+number);
        System.out.println("Name: "+ name);
    }

    public static void main(String[] args) {

       CtorTypes c = new CtorTypes();
       c.printData();

       CtorTypes c2 = new CtorTypes(11, "Isha");
       c2.printData();

       CtorTypes c3 = new CtorTypes(c);
       c3.printData();

    }
}
