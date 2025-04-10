public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int capacidad){
        this.n = capacidad;
        this.rectangulos = new Rectangulo[capacidad];
        this.distancias = new double[capacidad];
        this.areas = new double[capacidad];
    }
    public boolean addRectangulo(Rectangulo r){
        if (numRec < n){
            rectangulos[numRec] = r;
            double dx = r.getEsquina1().getX() - r.getEsquina2().getX();
            double dy = r.getEsquina1().getY() - r.getEsquina2().getY();
            distancias[numRec] = Math.sqrt(dx * dx + dy * dy);
        }
    }

}
