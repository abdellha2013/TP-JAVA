package Exercice5;

import java.util.Scanner;

public class mention {
    public static void main(String Args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("programme capable de afficher la mention d'une note .");
            System.out.print("vesuillez entrer vottre note : ");
            float note = input.nextFloat();
            // [0,6[−𝑀é𝑑𝑖𝑜𝑐𝑟𝑒, [6,10[−𝐹𝑎𝑖𝑏𝑙𝑒,
            // [10,12[−𝑃𝑎𝑠𝑠𝑎𝑏𝑙𝑒, [12,14[−𝐴𝑠𝑠𝑒𝑧 𝑏𝑖𝑒𝑛, [14,16[−𝐵𝑖𝑒𝑛,
            // [16,20] − 𝑇𝑟è𝑠 𝑏𝑖𝑒𝑛,
            // ] − ∞, 0[ ∪]20, +∞[−𝐸𝑟𝑟𝑒𝑢𝑟.
            String mention = (note <= 20)
                    ? ((note < 16)
                            ? ((note < 14)
                                    ? ((note < 12)
                                            ? ((note < 10)
                                                    ? ((note < 6)
                                                            ? (((note < 0) ? ("𝐸𝑟𝑟𝑒𝑢𝑟.") : ("𝑀é𝑑𝑖𝑜𝑐𝑟𝑒")))
                                                            : ("𝐹𝑎𝑖𝑏𝑙𝑒"))
                                                    : ("𝑃𝑎𝑠𝑠𝑎𝑏𝑙𝑒"))
                                            : ("𝐴𝑠𝑠𝑒𝑧 𝑏𝑖𝑒𝑛"))
                                    : ("𝐵𝑖𝑒𝑛"))
                            : ("𝑇𝑟è𝑠 𝑏𝑖𝑒𝑛"))
                    : ("𝐸𝑟𝑟𝑒𝑢𝑟");
            System.out.println("la mention est : " + mention);
        }

    }
}
