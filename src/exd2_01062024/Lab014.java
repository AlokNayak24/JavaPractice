package exd2_01062024;

public class Lab014 {
    public static void main(String[] args) {
        // Formatting
        int age = 98;
        System.out.println("You age is -> " + age);
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        System.out.printf("You age is -> %d",age);

        int n = 9;
        System.out.printf("%d",n);


        int a = 10;
//        int b= 34;
//        System.out.println(a+b);
//
//        String s1 = "PRamod";
//        String s2 = "Dutta";
//        System.out.println(s1+s2);

        String s3 = "Amit";
        int x = 99;
        int y = 100;

//        System.out.println(x+y+s3);
//        System.out.println(s3+x+y);
//        System.out.println(x+s3+y);


        System.out.println(x+y+s3+y+s3+x+y);

    }
}
