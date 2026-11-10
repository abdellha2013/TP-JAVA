package Exercice8;
import java.util.Scanner;
// Tirer au hasard un nombre entre 0 et 10.
// 2. Lire un nombre (entré par l’utilisateur).
// 3. Tant que le nombre lu est différent du nombre tiré au hasard :
// a. Lire un nombre
// b. Compter le nombre de boucles
// 4. Afficher un message de réussite ainsi que le nombre de boucles.
// NB. Pour tirer un nombre au hasard entre 0 et 10, l’instruction s’écrit :
// i = (int) (10*Math.random()) ;
// où i est une variable entière qui reçoit la valeur tirée au hasard.
public class Devinette {
    public static void main(String Args[]){
        try(Scanner input = new Scanner(System.in)){
            int nombre,cmpt=0,i=(int)(Math.random()*11);
            do{
                //la sesire d'un entier entre 0 et 10 
                System.out.print("veuillez entrer un entier entre 0 et 10 : ");
                nombre = input.nextInt();
                cmpt++;
            }while(i != nombre);
            System.out.println("Bravo tu est réussite , avec un nombre de repetition : "+cmpt);

        }

    }
    
}
