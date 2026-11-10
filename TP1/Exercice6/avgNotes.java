package Exercice6;

import java.util.Scanner;

// On souhaite calculer la moyenne d’un nombre, inconnu au départ, de notes.
// • Saisir des notes entre 0 et 20 (une note incorrecte ne sera pas prise en compte)
// • A chaque note saisie, on demande à l’utilisateur s’il souhaite continuer (réponse
// par un caractère O ou N)
// • Afficher le nombre des notes saisies
// • Afficher la moyenne des notes saisies
// • Afficher la meilleure et la faible note saisie.
public class avgNotes {
    public static void main(String Args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("un programme capable de calculer la moyenne des nottes : ");

            short nbrNotes;
            // do {
            //     System.out.print("veuillez entrer le nombre des notes : ");
            //     nbrNotes = input.nextShort();
            // } while (nbrNotes < 0);
            int cmpt=0;
            float note;
            double sumNotes = 0;
            String tmp;
            float meilleureNote=20,faibleNote=0;
            do {
                do {
                    System.out.print("veuillez entrer la note [0,20] : ");
                    note = input.nextFloat();
                } while ((note < 0 || note > 20));
                sumNotes += note;
                if(cmpt==0){
                    meilleureNote=faibleNote=note;
                }else{
                    if(note>meilleureNote){
                        meilleureNote=note;
                    }
                    if(note<faibleNote){
                        faibleNote=note;
                    }
                }
                cmpt++;

                do {
                    System.out.print("continue le sesire : (O/N) : ");
                    tmp = input.next().toUpperCase();
                } while (!tmp.equals("O") && !tmp.equals("N"));

            }while(tmp.equals("O"));
            
            double avgNotes = sumNotes / cmpt;
            System.out.println("le nombres des notes sesires est : "+cmpt);
            System.out.println("la moyenne des notes : " + avgNotes);
            System.out.println("max(Notes) : "+meilleureNote+" min(Notes) : "+faibleNote);

        }
    }
}
