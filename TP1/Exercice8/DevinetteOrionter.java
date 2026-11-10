package Exercice8;

import java.util.Scanner;
// Lorsque le programme fonctionne bien, modifier-le de telle façon que :
// 1. Les valeurs tirées au hasard soient comprises entre 0 et 50.
// 2. Le programme indique si la valeur saisie au clavier est plus grande ou plus
// petite que la valeur tirée au hasard.
// 3. Le programme affiche un message d’erreur une fois l’utilisateur a essayé un
// nombre de fois, déterminé au départ (par exemple 3), sans trouver le nombre
// tiré au hasard.

public class DevinetteOrionter {
    public static void main(String Args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int i = (int) (Math.random() * 51), nombre = i - 1,n;
            do{
                System.out.print("veuillez entrer le nombre des possiblite de sesire maximale (>=0) : ");
                n = input.nextInt();
            }while(n<=0);
            for (int j = 0; (j < n) && (i != nombre); j++) {
                // la sesire d'un entier entre 0 et 10
                System.out.print("veuillez entrer un entier entre 0 et 50 : ");
                nombre = input.nextInt();

                if (nombre > i) {
                    System.out.println("Trop grand ! ");
                } else if (nombre < i) {
                    System.out.println("Trop petit !");
                } else {
                    System.out.println("Bravo ! Vous avez trouvé le nombre mystère.");
                }

            }
            if (i != nombre) {
                System.out.println("Error : la valeur n'est pas trouver . ");
            }
        }

    }

}