import java.util.Scanner;

public class Principal {
    public static void mostrarRectangulo(String nombre, rectangulo r) {
        System.out.println("Rectangulo " + nombre + " = " + r.toString());
    }
    public static Rectangulo rectanguloInterseccion(rectangulo r1, rectangulo r2) {
        double xMin = Math.max(r1.getXMin(), r2.getXMin());
        double xMax = Math.min(r1.getXMax(), r2.getXMax());
        double yMin = Math.max(r1.getYMin(), r2.getYMin());
        double yMax = Math.min(r1.getYMax(), r2.getYMax());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese las cordenas del rectangulo1 : ");
        System.out.println("Esquina1 (x,y) : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Esquina2 (x,y) :");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        Coordenada esquina1A = new Coordenada(x1,y1);
        Coordenada esquina2A = new Coordenada(x2,y2);
        Rectangulo A = new Rectangulo(esquina1A, esquina2A);

        System.out.println("Ingrese las cordenas del rectangulo2 : ");
        System.out.println("Esquina1 (x,y) : ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        System.out.println("Esquina2 (x,y) :");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Coordenada esquina1B = new Coordenada(x3,y3);
        Coordenada esquina2B = new Coordenada(x4,y4);
        Rectangulo B = new Rectangulo(esquina1B, esquina2B);


    }
}
