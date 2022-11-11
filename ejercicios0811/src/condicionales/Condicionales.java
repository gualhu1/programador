package condicionales;

import java.util.Scanner;

public class Condicionales {
    private static Scanner sc = new Scanner(System.in);
    public Condicionales (String nombre) {
        System.out.println("Hola "+ nombre + " desde el constructor de condicionales");
    }

    public void e1(){
        
    }
    public void e2(){
        
    }
    public void e3(){
        
    }

    
    public String e4()
    {
        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();
        if ( numero % 2 == 0)
        { 
            return "es par";
            
        }
        else 
        {
            return "no es par";
        }   
    }


    public void e5(){
        
    }
    public void e6(){
        
    }
    public void e7(){
        
    }
    public void e8(){
        
    }
}
