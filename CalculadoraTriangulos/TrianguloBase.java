public class TrianguloBase {
    // Declaración de atributos
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloA;
    private double anguloB;
    private double anguloC;
    
    /*
     * Constructor vacío
     */
    public TrianguloBase(){}

    /*
     * Constructor de la clase trianguloBase
     */
    public TrianguloBase(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.anguloA = anguloA;
        this.anguloB = anguloB;
        this.anguloC = anguloC;
    }

    /*
     * Método que valida si se puede formar un triangulo con 3 lados
     */
    public boolean validarTrianguloCon3Lados(double ladoA, double ladoB, Double ladoC){
        // Comparamos la suma de dos lados tiene que ser mayor al lado restante
        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA){
            // Retorna verdadero si se cumple la condición
            return true;
        }else{
            // Retorna falso si no se cumple la condición
            return false;
        }
    }

    /*
     * Método que valida si se ingresan angulos permitidos
     */
    public boolean validarTrianguloCon3Angulos(double anguloA, double anguloB, double anguloC){
        if(anguloA <= -1|| anguloB <= -1 || anguloC <= -1 ){ // Comparamos si se ingresa un número menor o igual a -1
            return false; // Retorna false
        // Comparamos si se ingresan angulos igual o mayores a 180
        }else if(anguloA >= 180 || anguloB >= 180 || anguloC >= 180){
            return false; // Retornamos false
        }else{ // Si se cumple la condición de agregar números permitidos regresa true
            return true;
        }
    }

    /*
     * Métodos Getters y Setters de la clase trianguloBase
     */
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
    
    /*
     * Método toString
     */
    @Override
    public String toString() {
        return "Triangulo " + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", anguloA=" + anguloA + ", anguloB=" + anguloB + ", anguloC=" + anguloC;
    }
}
