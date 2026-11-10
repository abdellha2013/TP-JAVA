package Exercice4;

import java.util.Scanner;

public class operationsArethmetique {
    public static void main(String Args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Programme capale de realisre les operation arethmetique de base ");
            System.out.println("sous la formme : opt1 <Operation> opt2 avec <Operation> appartient a {+,-,*,/}");
            System.out.print("veuillez entrer la premiere valeur : ");
            double opt1 = input.nextDouble();
            System.out.print("veuillez entrer la dexieme valeur : ");
            double opt2 = input.nextDouble();
            System.out.print("veuillez entrer l'operation a etulisre (+,-,*,/): ");
            String op = input.next();
            double result;
            switch (op) {
                case "+":
                    result = opt1 + opt2;
                    System.out.println(opt1 + " " + op + " " + opt2 + " = " + result);
                    break;
                case "-":
                    result = opt1 - opt2;
                    System.out.println(opt1 + " " + op + " " + opt2 + " = " + result);
                    break;
                case "*":
                    result = opt1 * opt2;
                    System.out.println(opt1 + " " + op + " " + opt2 + " = " + result);
                    break;
                case "/":
                    if(opt2==0){
                        System.out.println("Error la devision sur zero est impossible . ");
                        break;
                    }
                    String type_dev;
                    do {
                        System.out.print("est ce que la devision est entier (Y/N) : ");
                        type_dev = input.next();
                        type_dev = type_dev.toUpperCase();
                    } while (!type_dev.equals("Y") && !type_dev.equals("N"));
                    
                    if (type_dev.equals("Y")) {
                        int r = (int)opt1 / (int)opt2;
                        int rest = (int)opt1 % (int)opt2;
                        System.out.println(opt1 + " " + op + " " + opt2 + " = " + r + " avec le rest : " + rest);
                    } else {
                        result = opt1 / opt2;
                        System.out.println(opt1 + " " + op + " " + opt2 + " = " + result);
                    }
                    break;
                default:
                    ;
                    System.out.println("the operation << " + op + " >> not supported .");
                    break;
            }

        }

    }
}
