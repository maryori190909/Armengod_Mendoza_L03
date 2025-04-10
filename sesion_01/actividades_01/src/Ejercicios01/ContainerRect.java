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

            areas[numRec] = r.calculoArea();
            numRec++;
            return true;
        }
        else{
            System.out.println("capacidad sobrepasada, no se puede agregar mas rectangulos ");
            return false;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo\\tCoordenadas\\t\\tDistancia\\tArea\\n");
        for(int i=0; i< numRec ; i++){
            sb.append((i+1)).append("\t").append(rectangulos[i].toString()).append("\t").append(String.format("%.3f", distancias[i]))
            .append("\t\t").append(String.format("%.2f", areas[i])).append("\n");
        }
        return sb.toString();
    }

}
