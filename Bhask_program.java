package projetos.bhask_in_java;

import java.util.Scanner;

public class Bhask_program{
    public static void main(String[] args){
        System.out.println("Please check the README.md before use.");

        float a,b,c,delta,root1,root2;

        Scanner entrance = new Scanner(System.in);

        System.out.print("\nThe value of 'a': ");
        a = entrance.nextFloat();
        System.out.print("\nThe value of 'b': ");
        b = entrance.nextFloat();
        System.out.print("\nThe value of 'c': ");
        c = entrance.nextFloat();

        entrance.close(); //closing the scanner

        delta = uses.roots(a,b,c); 

        root1 = (-b + (float)Math.sqrt(delta))/(2*a);
        root2 = (-b - (float)Math.sqrt(delta))/(2*a);

        System.out.printf("\nThe first root is %.1f and the second root is %.1f.",root1,root2);
    }
}
class uses{
    public static float roots(float n1, float n2, float n3){  //n1 =a  n2=b  n3=c

        float delta = (float)(Math.pow(n2,2)) -4*n1*n3;

        return delta;
    }
}