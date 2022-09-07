package Sem2;

import java.util.Scanner;

/*Написать программу вычисления n-ого треугольного числа.
 * Викепедия говорит нам, что Треугольное число — один из классов фигурных многоугольных чисел, 
 * определяемый как число точек, которые могут быть расставлены в форме правильного треугольника.
 * и вычисляется оно по формуле Tn = (n*(n+1))/2
 */

public class T3 {
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();
        int t =  (n*(n+1))/2;

        System.out.printf("Треугольное число от %d  равно %d", n, t);

        in.close();
    }
    
}

// И всё?