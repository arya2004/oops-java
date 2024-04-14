package org.Tutorial.eight;

abstract class Marks {
    abstract float getPercentage();
}

class A extends Marks {
    private int sub1, sub2, sub3;

    A(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    float getPercentage() {
        return (float) ((sub1 + sub2 + sub3) / 3.0);
    }
}

class B extends Marks {
    private int sub1, sub2, sub3, sub4;

    B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    float getPercentage() {
        return (float) ((sub1 + sub2 + sub3 + sub4) / 4.0);
    }
}

public class MarksTest {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 80);
        B studentB = new B(75, 80, 85, 90);

        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage());
    }
}
