import java.util.Scanner;

class Tabuada
{
 public static void main(String[]args)
  {
   int i;
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int numero = input.nextInt();

    for ( i = 1; i <= 10; i++)
    {
      int resultado = numero * i;
      System.out.println(numero+" X "+i+" = "+resultado);
    }
  }
}
  