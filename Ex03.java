import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);

      try{
        System.out.println("informe um numero inteiro:");
        int numero=sc.nextInt();
        System.out.println("voce digitou "+numero);
      } catch(InputMismatchException e){
        System.out.println("erro voce deve digitar um numero inteiro");

      }
      sc.close();
    }
    
}
