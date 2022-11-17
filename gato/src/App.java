import java.util.Scanner;

import model.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        int fila,col;
        Scanner sc = new Scanner(System.in);
        Gato gato = new Gato();
        gato.imprimeTablero();
            for (int i = 0;i<9;i++){
            System.out.println("Tira fila");
            fila = sc.nextInt();
            System.out.println("Tira col");
            col = sc.nextInt();

            gato.tirar(fila, col, i%2==0?'X' : '0');
            gato.imprimeTablero();
            }        
    }
}
