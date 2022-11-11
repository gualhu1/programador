import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner( System.in);
        System.out.println("Introduzca un numero");
        numero = teclado.nextInt();
        if ( numero % 2 == 0)
        { 
            System.out.print( "ES PAR");

        }
        else 
        {
            System.out.print( "ES IMPAR");
        }
    }
}
