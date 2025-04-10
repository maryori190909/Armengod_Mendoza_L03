public class Verificador {

    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2){
        if (r1.getXMAx()<= r2.getXMin() || r1.getXMin ()>= r2.getXMax() ||
        r1.getYMax() <= r2.getYMin() || r1.getYMin() >= r2.getYMax()) {
        return false;
    }
    else{
        return true;
    }
}
public static boolean esJunto(rectangulo r1, rectangulo r2){
    if(esSobrePos(r1,r2)){
    return false;}
    else{
        boolean tocanVertical = (r1.getXMax() > r2.getXMin() && r1.getXMin() < r2.getXMax()) &&
        (r1.getYMax() == r2.getYMin() || r1.getYMin() == r2.getYMax());
        boolean tocanHorizontal = (r1.getYMax() > r2.getYMin() && r1.getYMin() < r2.getYMax()) &&
        (r1.getXMax() == r2.getXMin() || r1.getXMin() == r2.getXMax());
        boolean tocanEsquina = (r1.getXMax() == r2.getXMin() || r1.getXMin() == r2.getXMax()) &&
        (r1.getYMax() == r2.getYMin() || r1.getYMin() == r2.getYMax());
        return tocanVertical || tocanHorizontal || tocanEsquina;}
}
public static boolean esDisjunto(rectangulo r1, rectangulo r2) {
    return !esSobrePos(r1,r2)&& !esJunto(r1, r2);
}
}
