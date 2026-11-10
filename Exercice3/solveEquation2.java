package Exercice3;
import java.util.Scanner;
public class solveEquation2 {
    public static void main(String Args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Programme capable de resoudre une equation du 2 eme degree .");
        System.out.println("L'equation ecrit sous la formme de a*x^2 + bx + c = 0");
        System.out.print("veuillez entrer la valeur de a : ");
        double a=input.nextDouble();
        System.out.print("veuillez entrer la valeur de b : ");
        double b=input.nextDouble();
        System.out.print("veuillez entrer la valeur de c : ");
        double c=input.nextDouble();
        solve(a,b,c);
        input.close();
        
    }
    public static void solve(double a,double b,double c){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("l'equation "+equationToString(a,b,c)+" admet une infinite de solution sur R .");
                }else{
                    System.out.println("pas de solution pour l'equation "+equationToString(a,b,c)+" sur R .");
                }
            }else{
                double x= (c==0?0:(-c/b));
                System.out.println("-- l'equation "+equationToString(a,b,c)+" admet une seul solution ( "+x+" , "+equation(a, b, c, x)+" )");
            }

        }else{
            double deltat = Math.pow(b,2)-4*a*c;
            if(deltat<0){
                System.out.println("pas de solution pour l'equation "+equationToString(a,b,c)+" sur R .");

            }else if (deltat==0){
                System.out.println("l'equation "+equationToString(a,b,c)+" admet une seul solution ( "+(-b/(2*a))+" , "+equation(a, b, c, -b/(2*a))+" )");
            }else{
                double x1 = (-b-Math.sqrt(deltat))/(2*a);
                double x2 = (-b+Math.sqrt(deltat))/(2*a);
                System.out.println("l'equation "+equationToString(a,b,c)+" admet deux solutions x1 ( "+x1+" , "+equation(a, b, c, x1)+
                " )"+" x2 ( "+x2+" , "+equation(a, b, c, x2)+" )");
            }

        }
    }
    public static String equationToString(double a,double b,double c){
        return a+" * x^2 + "+b+" * x + "+c+" = 0";
    }
    public  static  double equation(double a,double b,double c,double x){
        return a*Math.pow(x,2)+b*x+c;
    }
}
