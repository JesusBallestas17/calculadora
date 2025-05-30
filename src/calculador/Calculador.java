package calculador;

import java.util.Scanner;

public class Calculador {

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("¿Que operacion necesita realizar? ");
       System.out.println("1. Suma. ");
       System.out.println("2. Resta.");
       System.out.println("3. Multiplicacion. ");
       System.out.println("4. division. ");
       System.out.println("Ingrese un numero del (1-4): ");
       
       
       int cal;
       cal = scanner.nextInt();
       
       System.out.println("Ingrese su primer numero: ");
       double num1 = scanner.nextDouble();
       
       System.out.println("Ingrese su segundo numero: ");
       double num2 = scanner.nextDouble();
       
       
       double resultado;
       
       switch (cal){
           case 1:
               resultado = num1 + num2;
               System.out.println("El resultado de la Suma de " + num1 + " y " + num2 + " es " + resultado );
               break;
           case 2 :
               resultado = num1 - num2;
               System.out.println("El resultado de la Resta de " + num1 + " y " + num2 + " es " + resultado );
               break;
           case 3:
               resultado = num1 * num2;
               System.out.println("El resultado de la Multiplicacion de " + num1 + " y " + num2 + " es " + resultado );
               break;
           case 4:
               resultado = num1 / num2;
               System.out.println("El resultado de la Division de " + num1 + " y " + num2 + " es " + resultado );
               break;
           default :
               System.out.println("Ingrese un numero valido ");
               break;
       
       }
       
       
       
       
    }
    
}
