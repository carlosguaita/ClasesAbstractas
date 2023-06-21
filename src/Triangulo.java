import java.util.Scanner;

public class Triangulo extends Figura{

    double a, b, c;



    double calcularPerimetro(){
        a = calcularDistacia(0,1);
        b = calcularDistacia(0,2);
        c = calcularDistacia(1,2);
        double perimetro = a+b+c;
        return perimetro;
    }

    @Override
    double calcularArea() {
        double s = calcularPerimetro()/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <3; i++) {
            System.out.println("Ingrese la componente X del punto "+i+": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto "+i+": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z del punto "+i+": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x,y,z));
        }
    }
}
