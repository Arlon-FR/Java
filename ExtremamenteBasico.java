import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
    public static void main(String[] args) throws IOException {
        
       Scanner sc =  new Scanner(System.in); 
       System.out.println("Digite o valor para A");
       int A = sc.nextInt();

       System.out.println("Digite o valor de B");
       int B = sc.nextInt();
       
      int X = A + B;
      
      System.out.println("X = " + X);
    }
 
}
