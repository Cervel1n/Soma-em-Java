package nikolas354;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            int num1 = Scan.nextInt();
  
            try {
                System.out.println("Digite o segundo numero: ");
                int num2 = Scan.nextInt();
                System.out.println("A sua soma é de:  " + (num1 + num2));
  
  
            } catch (Exception e) {
                System.out.println("Usuario Digitou letra");
  
            }
  
        } catch (Exception e) {
            System.out.println("Usuario Digitou letra");
        }
        
    }
}