package entities;
public class CalcRetan {

public double base;
public double altura;

public double area(){
 double ar;
 ar = base*altura;
 return ar;
    
}

public double perimetro(){
double perimetro;
perimetro = 2*(base+altura);
return perimetro;
}

public double diagonal(){
return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
}

    
}
