import java.util.Scanner;

public class Nnumbers {

    public static void m() {
        System.out.println("m()");
    }


    public static void m(int a) {
        System.out.println("m(int a)");
    }

    public static void m(double a) {
        System.out.println("m(double a)");
    }

    public static void m(int a, int b) {
        System.out.println("m(int a, int b)");
    }

    public static void m(int... a) {
        System.out.println("m(int...a)");
  
    }
    public static void main(String[] args) {
        m();
        m(12,2);

    }

}