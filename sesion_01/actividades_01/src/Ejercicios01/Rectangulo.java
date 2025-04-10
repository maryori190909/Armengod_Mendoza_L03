import java.util.*;
import java.math.*;
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

    public double getXMin() {
        return Math.min(esquina1.getX(), esquina2.getX());
    }
    public double getXMax() {
        return Math.max(esquina1.getX(), esquina2.getX());
    }
    public double getYMin() {
        return Math.min(esquina1.getY(), esquina2.getY());
    }
    public double getYMax() {
        return Math.max(esquina1.getY(), esquina2.getY());
    }
    public double calculoArea() {
        return Math.abs((getXMax() - getXMin()) * (getYMax() - getYMin()));
    }
    @Override
    public String toString(){
        return "El rectangulo tiene coordenada: ([" + getXMin() + ", " + getYMin() + "], [" + getXMax() + ", " + getYMax() + "])";
    }
}