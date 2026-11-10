package Exercice1;

public class BaseLangegeJava {
    public static void main(String args[]) {
        // the question 1
        byte b = 23;
        short s = 336;
        int i = 28397;
        long l = 83789739;
        float f = 763.4F;
        double d = 273564.455;
        char c = 'A';
        final int MAX = 100;
        // b=i; invalide instruction
        // s=b+b;invalide instruction
        // l=f;invalide instruction
        // f=3.4;invalide instruction
        d = b * i;
        b = MAX + 10;
        // b=MAX+40;invalide instruction
        s = 10 * MAX - 5;

        // the question 2
        b++;
        b += i;
        // s=s+b;invalide instruction
        c += 3;

        // the question3
        byte b1 = 5, b2 = 15;
        s = 100;
        i = 200;
        l = 1000;
        f = 2.0f;
        d = 3.5;
        System.out.println("the value of b1+b2 is " + (b1 + b2) + " the type is : int ");
        System.out.println("the value of s+b1-i is " + (s + b1 - i) + " the type is : int ");
        System.out.println("the value of l/s*b1 is " + (l / s * b1) + " the type is : long ");
        System.out.println("the value of f*i+l is " + (f * i + l) + " the type is : float ");
        System.out.println("the value of b1*l/f is " + (b1 * l / f) + " the type is : float ");
        System.out.println("the value of (i+f)*d is " + ((i + f) * d) + " the type is : float ");
        System.out.println(
                "the value of (douoble)i/b2 is " + String.format("%.2f", (double) i / b2) + " the type is : double ");
        System.out.println("the value of (douoble)(i/b2) is " + ((double) (i / b2)) + " the type is : double ");

        // question 4
        i = 5;
        int j = 10, k = 3;
        System.out.println("i = " + i + " j = " + j + " k = " + k);
        i++;
        System.out.println("i = " + i + " j = " + j + " k = " + k);
        j = i++ + k;
        System.out.println("i = " + i + " j = " + j + " k = " + k);
        k = ++i + j--;
        System.out.println("i = " + i + " j = " + j + " k = " + k);
        i += j + k;
        System.out.println("i = " + i + " j = " + j + " k = " + k);
        j *= 2;
        System.out.println("i = " + i + " j = " + j + " k = " + k);
        k %= 2;
        System.out.println("i = " + i + " j = " + j + " k = " + k);


    }

}
