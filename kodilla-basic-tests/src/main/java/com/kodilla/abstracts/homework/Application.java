package com.kodilla.abstracts.homework;
public class Application {
    public static void main(String[] args) {

        SmallCircle smallCircle = new SmallCircle();
        double result = smallCircle.circleArea();
        System.out.println(result);
        double result2 = smallCircle.circlePerimeter();
        System.out.println(result2);

        MediumCircle mediumCircle = new MediumCircle();
        double result3 = mediumCircle.circleArea();
        System.out.println(result3);
        double result4 = mediumCircle.circlePerimeter();
        System.out.println(result4);

        HugeCircle hugeCircle = new HugeCircle();
        double result5 = hugeCircle.circleArea();
        System.out.println(result5);
        double result6 = hugeCircle.circlePerimeter();
        System.out.println(result6);
    }
}
