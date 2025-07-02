package exd2_01062024;

public class Lab023 {
    public static void main(String[] args) {

        int age = 65; // unary plus
        int num = -1; // unary minus -
        System.out.println(age+num);

        // Compound Assignment Operators
        int a = 10;
        // += , -=, /=, *= . %=
        // += ->
        a+=10; // a = a+10
        a-=10; // a = a-10
        a/=10; // a = a/10
        a*=10; // a = a*10

        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int a1 = 10;
        int b = 20;
        int sum = a1+b; // operand a, b , operator =, +

        int age_mamitha = 34;
        int age_pramod = 34;
//        boolean result = age_pramod > age_mamitha;
//        boolean result = age_pramod < age_mamitha;
        boolean result2 = age_pramod >= age_mamitha; // OR gate
        System.out.println(result2);

    }
}
