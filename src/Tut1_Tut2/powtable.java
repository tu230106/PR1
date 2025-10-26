package Tut1_Tut2;

public class powtable {
    public static void main(String[] args) {
        System.out.println("a      b      pow(a , b)");
        int a, b, p;
        a = 1; b = 2; p = a * a;
        System.out.println(a + "      " + b + "           " + p);
        a = 2; b = 3; p = a * a * a;
        System.out.println(a + "      " + b + "           " + p);
        a = 3; b = 4; p = a * a * a * a;
        System.out.println(a + "      " + b + "          " + p);
        a = 4; b = 5; p = a * a * a * a * a;
        System.out.println(a + "      " + b + "        " + p);
        a = 5; b = 6; p = a * a * a * a * a * a;
        System.out.println(a + "      " + b + "       " + p);
    }

}
