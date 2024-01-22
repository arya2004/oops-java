package org.Tutorial.two;

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
}
