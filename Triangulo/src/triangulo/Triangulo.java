package triangulo;

import entities.CalcRetan;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        CalcRetan cr = new CalcRetan();
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Entre com a Altura e a base do Retangulo: ");
        cr.altura = sc.nextDouble();
        cr.base = sc.nextDouble();
        
        System.out.println("Area = "+cr.area());
        System.out.println("Perimetro = "+cr.perimetro());
        System.out.println("Diagonal = "+cr.diagonal());
       
        
        
        



    }
    
}
