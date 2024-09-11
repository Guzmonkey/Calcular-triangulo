public class trianguloBase {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloA;
    private double anguloB;
    private double anguloC;
    
    // Constructor vacío 
    public trianguloBase(){}

    public trianguloBase(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.anguloA = anguloA;
        this.anguloB = anguloB;
        this.anguloC = anguloC;
    }

    public boolean validarTrianguloCon3Lados(double ladoA, double ladoB, Double ladoC){
        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            return true;
        }else{
            return false;
        }
    }

    public boolean validarTrianguloCon3Angulos(double anguloA, double anguloB, double anguloC){
        if(anguloA <= -1|| anguloB <= -1 || anguloC <= -1 ){
            return false;
        }else if(anguloA >= 180 || anguloB >= 180 || anguloC >= 180){
            return false;
        }else{
            return true;
        }
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getAnguloA() {
        return anguloA;
    }

    public void setAnguloA(double anguloA) {
        this.anguloA = anguloA;
    }

    public double getAnguloB() {
        return anguloB;
    }

    public void setAnguloB(double anguloB) {
        this.anguloB = anguloB;
    }

    public double getAnguloC() {
        return anguloC;
    }

    public void setAnguloC(double anguloC) {
        this.anguloC = anguloC;
  
    }
    @Override
    public String toString() {
        return "TrianguloBase{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", anguloA=" + anguloA + ", anguloB=" + anguloB + ", anguloC=" + anguloC + '}';
    }
}
