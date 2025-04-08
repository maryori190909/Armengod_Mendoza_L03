public class Verificador {

    public static boolean esSobrePos(rectangulo r1, rectangulo r2){
        if (r1.getXMAx()<= r2.getMin() || r1.getXMin ()>= r2.getXMax() ||
        r1.getYMax() <= r2.getYMin() || r1.getYMin() >= r2.getYMax()) {
        return false;
    }
    else{
        return true;
    }
}
public static boolean esJUnto(rectangulo r1, rectangulo r2){
    if(esSobrePos(r1,r2)){
    return false;}
    else{
        
    }
}
