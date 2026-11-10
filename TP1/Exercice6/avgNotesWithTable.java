package Exercice6;

import java.util.Scanner;

// Réécrire ce programme en utilisant un tableau, mais cette fois-ci le nombre de notes est
// connu au départ. En plus, le programme affichera aussi l’ordre de la meilleure et la
// faible note.
public class avgNotesWithTable {
    public static void main(String Args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("un programme capable de calculer la moyenne des nottes : ");

            short nbrNotes;
            do {
                System.out.print("veuillez entrer le nombre des notes : ");
                nbrNotes = input.nextShort();
            } while (nbrNotes <= 0);

            float[] Notes = new float[nbrNotes];

            for (int i = 0; i < nbrNotes; i++) {
                do {
                    System.out.print("veuillez entrer la note [0,20] : ");
                    Notes[i] = input.nextFloat();
                } while ((Notes[i] < 0 || Notes[i] > 20));

            }
            double sumNotes = 0;
            float faibleNote = Notes[0];
            float meilleureNote = Notes[0];
            int ordreMeilleure = 1;
            int ordreFaible = 1;

            for (int i = 0; i < nbrNotes; i++) {
                sumNotes += Notes[i];
                if (Notes[i] > meilleureNote) {
                    meilleureNote = Notes[i];
                    ordreMeilleure = i + 1;
                }
                if (Notes[i] < faibleNote) {
                    faibleNote = Notes[i];
                    ordreFaible = i + 1;
                }
            }
        
            double avgNotes = sumNotes / nbrNotes;
            System.out.println("le nombres des notes sesires est : " + nbrNotes);
            System.out.println("la moyenne des notes : " + avgNotes);
            System.out.println("Meilleure note : " + meilleureNote + " (ordre : " + ordreMeilleure + ")");
            System.out.println("Plus faible note : " + faibleNote + " (ordre : " + ordreFaible + ")");
            
        }
    }
}