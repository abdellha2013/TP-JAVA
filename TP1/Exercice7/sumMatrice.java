package Exercice7;

import java.util.Scanner;

// Considérons deux matrices M1 et M2 de même ordre (n x p) dont les éléments sont de type
// entier. Écrire un programme Java qui calcule et affiche la matrice M3 = M1 + M2.

public class sumMatrice {
    public static  void main(String Args[]){
        try(Scanner input = new Scanner(System.in)){
            int n,p;
            System.out.println("Programme capable de calculer l'addition de deux matrix : ");
            System.out.print("veuillez entrer le nombre de lignes ");
            n = input.nextInt();
            System.out.print("veuillez entrer le nombre de colones ");
            p = input.nextInt();
            System.out.println("veuillez sesire la premier matrixe M1 : ");
            int M1[][]=new int[n][p];
            M1=inputMatrixe(n,p,input);
            System.out.println("veuillez sesire la premier matrixe M2 : ");
            int M2[][]=new int[n][p];
            M2=inputMatrixe(n,p,input);
            System.out.println("la somme du matrice M1 et M2 est : ");
            afficherMatrix(M1);
            System.out.println("+");
            afficherMatrix(M2);
            System.out.println("=");
            int[][] S=sumMatrixe(M1,M2);
            S = sumMatrixe(M1,M2);
            afficherMatrix(S);


        }

    }
    public static int[][] sumMatrixe(int[][] M1,int[][] M2){
        if((M1.length!=M2.length) || (M1[0].length!=M2[0].length)){
            throw new IllegalArgumentException("Les matrices n'ont pas le même dimention !");
        }
        int[][] S = new int[M1.length][M1[0].length];
        for(int i = 0;i<M1.length;i++){
            for(int j=0; j<M1[0].length;j++){
                S[i][j]=M1[i][j]+M2[i][j];
            }
        }
        return S;

    }
    public static int[][] inputMatrixe(int n, int p,Scanner input) {
        // try (Scanner input = new Scanner(System.in)) {
            int Matrix[][]=new int[n][p];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print("veuillez entrer la valeur M["+i+"]["+j+"] : ");
                    Matrix[i][j] = input.nextInt();
                }
            }
            return Matrix;
        // }
    }
    public static  void afficherMatrix(int[][] M){
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                System.out.print(M[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
