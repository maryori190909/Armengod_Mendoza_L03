import java.util.Scanner;

public class Principal {
    public static void mostrarRectangulo(String nombre, Rectangulo r) {
        System.out.println("Rectangulo " + nombre + " = " + r.toString());
    }
    public static Rectangulo rectanguloInterseccion(Rectangulo r1, Rectangulo r2) {
        double xMin = Math.max(r1.getXMin(), r2.getXMin());
        double xMax = Math.min(r1.getXMax(), r2.getXMax());
        double yMin = Math.max(r1.getYMin(), r2.getYMin());
        double yMax = Math.min(r1.getYMax(), r2.getYMax());
        Coordenada esquina1 = new Coordenada(xMin, yMin);
        Coordenada esquina2 = new Coordenada(xMax, yMax);

        return new Rectangulo(esquina1, esquina2);
    }
    public static void probarCaso(double[]coordsA, double[] coordsB, int numeroPrueba){
        Coordenada esquina1A = new Coordenada(coordsA[0], coordsA[1]);
        Coordenada esquina2A = new Coordenada(coordsA[2], coordsA[3]);
        Rectangulo A = new Rectangulo(esquina1A, esquina2A);

        Coordenada esquina1B = new Coordenada(coordsB[0], coordsB[1]);
        Coordenada esquina2B = new Coordenada(coordsB[2], coordsB[3]);
        Rectangulo B = new Rectangulo(esquina1B, esquina2B);

        System.out.println("\n prueba " + numeroPrueba );
        mostrarRectangulo("A", A );
        mostrarRectangulo("B", B);

        if(Verificador.esSobrePos(A, B)){
            System.out.println("Rectangulos A y B se sobreponen.");
            Rectangulo interseccion = rectanguloInterseccion(A, B);
            System.out.printf("Área de sobreposición = %.2f%n", interseccion.calculoArea());
        } else if (Verificador.esJunto(A, B)) {
            System.out.println("Rectangulos A y B se juntan.");
        } else {
            System.out.println("Rectangulos A y B son disjuntos.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Seleccione el modo: ");
        System.out.println("1 Ingreso manual ");
        System.out.println("2 Probar casos automaticos ");
        System.out.print("opcion: ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {

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
            
            mostrarRectangulo("rectangulo A", A);
            mostrarRectangulo("rectangulo B", B);

            if (Verificador.esSobrePos(A, B)) {
                System.out.println("rectangulos A y B se sobreponen.");
                Rectangulo interseccion = rectanguloInterseccion(A, B);
                System.out.printf("area de sobreposición = %.2f%n", interseccion.calculoArea());

            } else if (Verificador.esJunto(A, B)) {
                System.out.println("rectangulos A y B se juntan.");
            } else {
                System.out.println("rectangulos A y B son disjuntos.");
            }

        } else if (opcion == 2){
            double[] coordsA1 = {1.5,0.3,7.6,2.2};
            double[] coordsB1 = {4.0,4.2,9.4,-2.5};

            double[] coordsA2 = {20.5,-1.1,33.3,3.6};
            double[] coordsB2 = {10.3,-5.2,20.5,8.6};

            double[] coordsA3 = {4.0,0.1,9.0,5.0};
            double[] coordsB3 = {0.0,6.0,5.0,11.0};

            probarCaso(coordsA1, coordsB1, 1);
            probarCaso(coordsA2, coordsB2, 2);
            probarCaso(coordsA3, coordsB3, 3);
        }
        else{
            System.out.println("opcion no valida");
        }

        scanner.close();

    }
}
