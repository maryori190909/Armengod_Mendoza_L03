import java.util.*;
public class Coordenada {
    private double x;
    private double y;
    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    public Coordenada(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        this.x = c.x;
        this.y = c.y;
    }
    void setX(double x){
        this.x =x;
    }
    void setY(double y){
        this.y =y;
    }
    double getX(double x){
        return x;
    }
    double getY(double y){
        return y;
    }
    double distancia(Coordenada c){
        double dx = c.x -this.x;
        double dy =c.y - this.y;
        return Math.sqrt(dx * dx + dy*dy);
    }
    static double distancia(Coordenada c1, Coordenada c2){
        double dx = c2.x - c1.x;
        double dy = c2.y - c1.y;
        return Math.sqrt(dx*dx +dy*dy);
    }
    @Override
    String toString(){
        return"("+ x +"," + y + ")" ;
    }
}
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    public Rectangulo (Coordenada c1, Coordenada c2){
        setEsquina1(c1);
        setEsquina2(c2);
    }
    public void setEsquina1 (Coordenada coo){
        this.esquina1 = new Coordenada(coo);
    }
    public void setEsquina2 (Coordenada coo){
        this.esquina2 = new Coordenada(coo);
    }
    public Coordenada getEsquina1 (){
        return new Coordenada(esquina1);
    }
    public Coordenada getEsquina2 (){
        return new Coordenada(esquina2);
    }
    public String toString(){
        return "El rectangulo tiene coordenada: [ "+esquina1 + " - " + esquina2 + "] ";
    }
}

