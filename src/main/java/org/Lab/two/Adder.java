package org.Lab.two;

import java.util.ArrayList;

public class Adder {
    public ArrayList<Float> Array;
    public float targetSum;

    public  Adder(ArrayList<Float> _Array, float _targetSum){
        this.Array = _Array;
        this.targetSum = _targetSum;
    }

    public ArrayList<Float> Find(){
        ArrayList<Float> temp = new ArrayList<Float>();
        for (int i = 0; i < this.Array.size(); i++) {
            for (int j = i; j < this.Array.size(); j++) {
                if(this.Array.get(i) + this.Array.get(j) == this.targetSum){

                    temp.add(this.Array.get(i));

                    temp.add(this.Array.get(j));
                }
            }
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {

        ArrayList<Float> t = new ArrayList<Float>();
        t.add(3.0f);
        t.add(5.0f);
        t.add(-4.0f);
        t.add(8.0f);
        t.add(11.0f);
        t.add(-1.0f);
        t.add(1.0f);
        t.add(7.0f);
        Adder a = new Adder(t, 15);
        a.Find();
        }
}
