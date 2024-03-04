package org.Lab.three;

public class Area {

    public Area(){

    }

    public void GenericArea(){

    }



    public       static double Calculate(int _height, int _base){

        return (_height + _base) / 2;
    }
    public static double Calculate(float _height, int _breadth){

        return (_height + _breadth);
    }
    public static double Calculate(int _radius){

        return (_radius * _radius * Math.PI);
    }

    public static void main(String[] args) {

    }
}
