package Exercice2;

import java.util.Scanner;

public class intersectPoint {
    /**
     * Ecrire un programme java permettant d’afficher le point d’intersection de
     * deux droites
     * données par leurs équations réduites.
     */

    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programme capable de resudre f1(x)=f2(x) ou f est une fonction affine .");
        System.out.println("entrer les valeur de f1(x)=a1*x + b1");
        System.out.print("veuillez entrer la valeur de a1 : ");
        double a1 = scanner.nextDouble();
        System.out.print("veuillez entrer la valeur de b1 : ");
        double b1 = scanner.nextDouble();

        System.out.println("entrer les valeur de f2(x)=a2*x + b2");
        System.out.print("veuillez entrer la valeur de a2 : ");
        double a2 = scanner.nextDouble();
        System.out.print("veuillez entrer la valeur de b2 : ");
        double b2 = scanner.nextDouble();

        if (a1 == a2) {
            if (b1 == b2) {
                System.err.println("l'equation f1 = f2 avoire une infinite de solution sur R .");
            } else {
                System.out.println("pas de solution dans R pour l'equation f1 = f2 .");
            }
        } else {
            double x, y;
            x = (b1 - b2) / (a2 - a1);
            y = a1 * x + b1;
            System.out.println("l'equation admet une seul solution sur R c'est ( " + String.format("%.2f", x)+" , "+String.format("%.2f", y)+" ) ");// custing
                                                                                                             // explicite
        }
        scanner.close();
    }

}
