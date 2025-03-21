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

    }
    static double distancia(Coordenada c1, Coordenada c2){

    }
    String toString(){

    }
}
