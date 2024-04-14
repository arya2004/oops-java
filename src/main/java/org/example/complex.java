package org.example;

public class complex {
    int re;
    int im;
    public complex(int re, int im){
        this.re = re;
        this.im = im;

    }

    public complex(complex c){
        System.out.println("Copy called");
        this.im = c.im;
        this.re = c.re;

    }

    public String toString(){
        return im + " " + re;
    }

    public static void main(String[] args) {
        complex x = new complex(3,4);
        complex x2 = new complex(x);
        System.out.println(x2);
    }
}
