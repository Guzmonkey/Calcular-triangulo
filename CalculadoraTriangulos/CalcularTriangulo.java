import java.lang.Math;
public class CalcularTriangulo extends TrianguloBase {
    // Constructor vacío
    public CalcularTriangulo(){}

    /*
     * Constructor que recibe parametros 
     */ 
    public CalcularTriangulo(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC) {
        super(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC);
    }
    /*
     * Método que calcula el area del triangulo
     */
    public double calcularArea(double ladoA, double ladoB, double anguloC){
        // Declaracion de variables
        double anguloCToRadians = Math.toRadians(anguloC);// Convertimos el anguloC en radianes
        double area = ladoA * ladoB * Math.sin(anguloCToRadians) / 2;
        return area; // Retornamos el area
    }
    /*
     * Método que calcula el perimetro del triangulo
     */
    public double calcularPerimetro(double ladoA, double ladoB, double ladoC){
        double perimetro = ladoA + ladoB + ladoC; // Sumamos los lados ingresados
        return perimetro; // Retornamos el perimetro
    }
    /*
     * Método para calcular el semiperimetro del triangulo 
     */
    public double calcularSemiPerimetro(double ladoA, double ladoB, double ladoC){
        double semiPerimetro = (ladoA + ladoB + ladoC) / 2; // Sumamos los lados ingresados y el resultado lo dividimos entre 2
        return semiPerimetro; // Retornamos el semiperimetro
    }
    /*
     * Método para calcular la altura ha
     */
    public double heightHa(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2; // Calculamos el semiperimetro
        double areaHeron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC)); // Calculamos el area
        double ha = (2 * areaHeron  ) / ladoA; // Utilizamos la formula para calcular la altura ha
        return ha; // Retornamos ha
    }
    /*
     * Método para calcular la altura hb
     */
    public double heightHb(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2; // Calculamos el semiperimetro
        double areaHeron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC)); // Calculamos el area
        double hb = (2 * areaHeron ) / ladoB; // Utilizamos la formula para calcular la altura hb
        return hb;
    }
    /*
     * Método para calcular la altura hc
     */
    public double heightHc(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2; // Calculamos el semiperimetro
        double areaHeron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC)); // Calculamos el area
        double hc = (2 * areaHeron ) / ladoC; // Utilizamos la formula para calcular la altura hc
        return hc;
    }
    /*
     * Método para calcular la mediana ma
     */
    public double medianMa(double ladoA, double ladoC, double anguloB){
        double anguloBToRadians = Math.toRadians(anguloB); // Convertimos el angulo B en radianes 
        double ma = Math.sqrt(Math.pow(ladoA/2, 2) + Math.pow(ladoC, 2) - ladoA * ladoC * Math.cos(anguloBToRadians)); // Calculamos la mediana ma
        return ma;
    }
    /*
     * Método para calcular la mediana mb
     */
    public double medianMb(double ladoA, double ladoB, double anguloC){
        double anguloCToRadians = Math.toRadians(anguloC); // Convertimos el angulo C en radianes
        double mb = Math.sqrt(Math.pow(ladoB/2, 2) + Math.pow(ladoA, 2) - ladoA * ladoB * Math.cos(anguloCToRadians)); // Calculamos la mediana mb
        return mb;
    }
    /*
     * Método para calcular la mediana mc
     */
    public double medianMc(double ladoB, double ladoC, double anguloA){
        double anguloAToRadians = Math.toRadians(anguloA); // Convertimos el angulo A en radianes
        double mc = Math.sqrt(Math.pow(ladoC/2, 2) + Math.pow(ladoB, 2) - ladoB * ladoC * Math.cos(anguloAToRadians)); // Calculamos la mediana mc
        return mc;
    }
    /*
     * Método para calcular el radio interno del triangulo
     */
    public double calcularRadioInterno(double ladoA, double ladoB, double ladoC){
        double semiPerimetro =  (ladoA + ladoB + ladoC) / 2; // Calculamos el semiperimetro
        double area  = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC)); // Calculamos el area
        double radioInterno = area / semiPerimetro; // Dividimos el area por el semiperimetro
        return radioInterno; // Retornamos el resultado
    }
    /*
     * Método para calcular el radio externo del triangulo
     */
    public double calcularRadioExterno(double ladoA, double anguloA){
        double anguloAToRadians = Math.toRadians(anguloA); // Convertimos el angulo A en radianes
        double radioExterno = ladoA / (2 * Math.sin(anguloAToRadians)); // Calculamos el radio externo 
        return radioExterno; // Retornamos el resultado
    }
    /*
     * Método para calcular los angulos del triangulo a partir de los 3 lados
     */
    public String calcular3Angulos(double ladoA, double ladoB, double ladoC){
        // Declaración de variables
        double rad1;
        double anguloA;
        double rad2; 
        double anguloB;
        double rad3;
        double anguloC;
        double area;
        double perimetro; 
        double semiPerimetro;
        double ha;
        double hb;
        double hc;
        double ma;
        double mb;
        double mc;
        double radioInterno;
        double radioExterno;
        // Validamos que se pueda crear un triangulo a partir de sus 3 lados
        if(validarTrianguloCon3Lados(ladoA, ladoB, ladoC)){
            // Si se cumple la condición calculamos sus angulos
            rad1 = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC));
            anguloA = rad1 * (180 / Math.PI);
            rad2 = Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC));
            anguloB = rad2 * (180 / Math.PI);
            rad3 = Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB));
            anguloC = rad3 * (180 / Math.PI);
            // Actualizamos el valor de los angulos
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el area, perimetro, semiperimetro, altura ha, hb, hc, mediana ma, mb, mc y sus radios correspondientes
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);    
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultas
            return "Lado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else{
            // Si no se cumple la condición retornamos un mensaje
            return "No se puede calcular un triangulo con esos números de lados!";
        }
    }
    /*
     * Método para calcular 1 lado y 2 angulos del triangulo
     */
    public String calcular1Lado2Angulos(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC){
        // Declaración de variables
        double ladoRestante;
        double rad1;
        double anguloRestante1;
        double rad2; 
        double anguloRestante2;
        double area;
        double perimetro;
        double semiPerimetro;
        double ha;
        double hb;
        double hc;
        double ma;
        double mb;
        double mc;
        double radioInterno;
        double radioExterno;
        // Validamos si se puede crear un triangulo a partir de sus angulos y lados
        if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoB >= 1 && anguloA >= 1){
            // Si se cumple la condición calculamos el lado y los 2 angulos restantes
            rad1 = Math.asin((ladoB * Math.sin(Math.toRadians(anguloA))) / ladoA);
            anguloRestante1 = rad1 * (180 / Math.PI);
            anguloRestante2 = 180 - anguloA - anguloRestante1;
            ladoRestante = (ladoA * Math.sin(Math.toRadians(anguloRestante2))) / Math.sin(Math.toRadians(anguloA));
            // Actualizamos el valor de los lados y los angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoRestante);
            setAnguloA(anguloA);
            setAnguloB(anguloRestante1);
            setAnguloC(anguloRestante2);
            // Calculamos el area, perimetro, semiperimetro, altura ha, hb, hc, mediana ma, mb, mc y sus radios correspondientes
            area = calcularArea(ladoA, ladoB, anguloRestante2);
            perimetro = calcularPerimetro(ladoA,ladoB , ladoRestante);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoRestante);
            ha = heightHa(ladoA, ladoB, ladoRestante);
            hb = heightHb(ladoA, ladoB, ladoRestante);
            hc = heightHc(ladoA, ladoB, ladoRestante);
            ma = medianMa(ladoA, ladoRestante, anguloRestante1);
            mb = medianMb(ladoA, ladoB, anguloRestante2);
            mc = medianMc(ladoB, ladoRestante, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoRestante);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
        
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoRestante) + "\nAngulo A: " + String.format("%.4f", anguloA) +  "\nAngulo B: " + String.format("%.4f", anguloRestante1) + 
            "\nAngulo C: " + String.format("%.4f", anguloRestante2)  + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f",semiPerimetro) + 
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) + 
            "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc) 
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otra validación por si el usuario ingresa otro angulo
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoB >= 1 && anguloB >= 1){  
            // Realizamos los calculos correspondientes
            rad1 = Math.asin((ladoA * Math.sin(Math.toRadians(anguloB))) / ladoB);
            anguloRestante1 = rad1 * (180 / Math.PI);
            anguloRestante2 = 180 - anguloB - anguloRestante1;
            ladoRestante = (ladoB * Math.sin(Math.toRadians(anguloRestante2))) / Math.sin(Math.toRadians(anguloB));
            // Actualizamos los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoRestante);
            setAnguloA(anguloRestante1);
            setAnguloB(anguloB);
            setAnguloC(anguloRestante2);
            // Calculamos el area, perimetro, semiperimetro, altura ha, hb, hc, mediana ma, mb, mc y sus radios correspondientes
            area = calcularArea(ladoA, ladoB, anguloRestante2);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoRestante);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoRestante);
            ha = heightHa(ladoA, ladoB, ladoRestante);
            hb = heightHb(ladoA, ladoB, ladoRestante);
            hc = heightHc(ladoA, ladoB, ladoRestante);
            ma = medianMa(ladoA, ladoRestante, anguloB);
            mb = medianMb(ladoA, ladoB, anguloRestante2);
            mc = medianMc(ladoB, ladoRestante, anguloRestante1);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoRestante);
            radioExterno = calcularRadioExterno(ladoA, anguloRestante1);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoRestante) + "\nAngulo A: " + String.format("%.4f", anguloRestante1) 
            + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloRestante2) + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + 
            "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) + "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc)
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc) + 
            "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde se ingresa un angulo diferente
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoB >= 1 && anguloC >= 1){
            // Realizamos calculos correspondientes
            ladoRestante = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoA, 2) - (2 * ladoB * ladoA * Math.cos(Math.toRadians(anguloC))));
            rad1 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoB, 2) - Math.pow(ladoA, 2)) / (2 * ladoRestante * ladoB));
            anguloRestante1 = rad1 * (180 / Math.PI);
            rad2 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoA, 2) - Math.pow(ladoB, 2)) / (2 * ladoRestante * ladoA));
            anguloRestante2 = rad2 * (180 / Math.PI);
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoRestante);
            setAnguloA(anguloRestante1);
            setAnguloB(anguloRestante2);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoRestante);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoRestante);
            ha = heightHa(ladoA, ladoB, ladoRestante);
            hb = heightHb(ladoA, ladoB, ladoRestante);
            hc = heightHc(ladoA, ladoB, ladoRestante);
            ma = medianMa(ladoA, ladoRestante, anguloRestante2);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoRestante, anguloRestante1);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoRestante);
            radioExterno = calcularRadioExterno(ladoA, anguloRestante1);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB)+ "\nLado C: " + String.format("%.4f", ladoRestante) +  
            "\nAngulo A: " + String.format("%.4f", anguloRestante1) + "\nAngulo B: " + String.format("%.4f", anguloRestante2) + "\nAngulo C: " + String.format("%.4f", anguloC) 
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc) + "\nInradius r: " +
            String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde se ingrese el lado b, lado c y el angulo a
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoB >= 1 && ladoC >= 1 && anguloA >= 1){
            // Realizamos los calculos correspondientes
            ladoRestante = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - (2 * ladoB * ladoC * Math.cos(Math.toRadians(anguloA))));
            rad1 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoRestante * ladoC));
            anguloRestante1 = rad1 * (180 / Math.PI);
            rad2 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoRestante * ladoB));
            anguloRestante2 = rad2 * (180 / Math.PI);
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoRestante);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloRestante1);
            setAnguloC(anguloRestante2);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoRestante, ladoB, anguloRestante2);
            perimetro = calcularPerimetro(ladoRestante, ladoB, ladoC);  
            semiPerimetro = calcularSemiPerimetro(ladoRestante, ladoB, ladoC); 
            ha = heightHa(ladoRestante, ladoB, ladoC);
            hb = heightHb(ladoRestante, ladoB, ladoC);
            hc = heightHc(ladoRestante, ladoB, ladoC);
            ma = medianMa(ladoRestante, ladoC, anguloRestante1);
            mb = medianMb(ladoRestante, ladoB, anguloRestante2);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoRestante, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoRestante, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoRestante) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloRestante1) + "\nAngulo C: " + String.format("%.4f", anguloRestante2)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura: hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc) 
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde el usuario ingrese el angulo b
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoB >= 1 && ladoC >= 1 && anguloB >= 1){
            // Realizamos los calculos correspondientes
            rad2 = Math.asin((ladoC * Math.sin(Math.toRadians(anguloB))) / ladoB);
            anguloRestante2 = rad2 * (180 / Math.PI);
            anguloRestante1 = 180 - anguloB - anguloRestante2;
            ladoRestante = (ladoB * Math.sin(Math.toRadians(anguloRestante1))) / Math.sin(Math.toRadians(anguloB));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoRestante);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloRestante1);
            setAnguloB(anguloB);
            setAnguloC(anguloRestante2);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoRestante, ladoB, anguloRestante2);
            perimetro = calcularPerimetro(ladoRestante, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoRestante, ladoB, ladoC);
            ha = heightHa(ladoRestante, ladoB, ladoC);
            hb = heightHb(ladoRestante, ladoB, ladoC);
            hc = heightHc(ladoRestante, ladoB, ladoC);
            ma = medianMa(ladoRestante, ladoC, anguloB); 
            mb = medianMb(ladoRestante, ladoB, anguloRestante2);
            mc = medianMc(ladoB, ladoC, anguloRestante1);
            radioInterno = calcularRadioInterno(ladoRestante, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoRestante, anguloRestante1);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoRestante) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) + 
            "\nAngulo A: " + String.format("%.4f", anguloRestante1) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloRestante2)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc) + 
            "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde se ingresa el angulo c
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoB >= 1 && ladoC >= 1 && anguloC >= 1){
            // Realizamos los calculos correspondientes
            rad2 = Math.asin((ladoB * Math.sin(Math.toRadians(anguloC))) / ladoC);
            anguloRestante2 = rad2 * (180 / Math.PI);
            anguloRestante1 = 180 - anguloRestante2 - anguloC;
            ladoRestante = (ladoC * Math.sin(Math.toRadians(anguloRestante1)) / Math.sin(Math.toRadians(anguloC)));
            // Actualizamos los valores del triangulo
            setLadoA(ladoRestante);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloRestante1);
            setAnguloB(anguloRestante2);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoRestante, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoRestante, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoRestante, ladoB, ladoC);
            ha = heightHa(ladoRestante, ladoB, ladoC);
            hb = heightHb(ladoRestante, ladoB, ladoC);
            hc = heightHc(ladoRestante, ladoB, ladoC);
            ma = medianMa(ladoRestante, ladoC, anguloRestante2);
            mb = medianMb(ladoRestante, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloRestante1);
            radioInterno = calcularRadioInterno(ladoRestante, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoRestante, anguloRestante1);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoRestante) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) + 
            "\nAngulo A: " + String.format("%.4f", anguloRestante1) + "\nAngulo B: " + String.format("%.4f", anguloRestante2) + "\nAngulo C: " + String.format("%.4f", anguloC)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) 
            + "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) + "\nMediana ma: " +
            String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc) + "\nInradius r: " + String.format("%.4f", radioInterno)
            + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde se ingresa el lado a, lado c y el angulo a
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoC >= 1 && anguloA >= 1){
            // Realizamos los calculos correspondientes
            rad2 = Math.asin ((ladoC * Math.sin(Math.toRadians(anguloA))) / ladoA);
            anguloC = rad2 * (180 / Math.PI);
            anguloB = 180 - anguloA - anguloC;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB)) / Math.sin(Math.toRadians(anguloA)));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde se ingresa el angulo b
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoC >= 1 && anguloB >= 1){
            // Realizamos los calculos correspondientes
            ladoB = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - (2 * ladoA * ladoC * Math.cos(Math.toRadians(anguloB))));
            rad1 = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC));
            anguloA = rad1 * (180 / Math.PI);
            anguloC = 180 - anguloA - anguloB;
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Otro caso donde se ingresa el angulo c
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoC >= 1 && anguloC >= 1){
            // Realizamos los calculos correspondientes
            rad1 = Math.asin((ladoA * Math.sin(Math.toRadians(anguloC))) / ladoC);
            anguloA = rad1 * (180 / Math.PI);
            anguloB = 180 - anguloA - anguloC;
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else{ // Si no se cumple alguno de los otros casos retornamos que no se puede resolver el triangulo
            return "No se puede resolver el triangulo!";
        }     
    }    
    /*
     * Método para calcular 2 lados y 1 angulo del triangulo
     */
    public String calcular2Lados1Angulo(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC){
        // Declaración de variables
        double area;
        double perimetro;
        double semiPerimetro;
        double ha;
        double hb;
        double hc;
        double ma;
        double mb;
        double mc;
        double radioInterno;
        double radioExterno;
        // Utilizamos una validación para comprobar que se pueda resolver el triangulo y comprobamos que datos del triangulo tenemos
        if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloB >= 1 && ladoA >= 1){
            // Realizamos los calculos correspondientes
            anguloC = 180 - anguloA - anguloB;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloA));
            ladoC = (ladoA * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloA));
            // Actualizamos los valores de los lados y los angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos un else if si el usuario ingresó otro lado
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloB >= 1 && ladoB >= 1){
            // Realizamos los calculos correspondientes
            anguloC = 180 - anguloA - anguloB;
            ladoA = (ladoB * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloB));
            ladoC = (ladoB * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloB));
            // Actuaizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if si el usuario ingresó el lado c
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloB >= 1 && ladoC >= 1){
            // Realizamos los calculos correspondientes
            anguloC = 180 - anguloA - anguloB;
            ladoA = (ladoC * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloC));
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if si es que el usuario ingresó un angulo distinto
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloC >= 1 && ladoA >= 1){
            // Realizamos los calculos correspondientes
            anguloB = 180 - anguloA - anguloC;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloA));
            ladoC = (ladoA * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloA));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if si es que el usuario ingresó otro lado
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloC >= 1 && ladoB >= 1){
            // Realizamos los calculos correspondientes
            anguloB = 180 - anguloA - anguloC;
            ladoA = (ladoB * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloB));
            ladoC = (ladoB * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloB));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if por si el usuario ingresa otro lado 
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloC >= 1 && ladoC >= 1){
            // Realizamos los calculos correspondientes
            anguloB = 180 - anguloA - anguloC;
            ladoA = (ladoC * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloC));
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Realizamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if por si el usuario ingresa otros angulos y lado
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloB >= 1 && anguloC >= 1 && ladoA >= 1){
            // Realizamos los calculos correspondientes
            anguloA = 180 - anguloB - anguloC;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloA));
            ladoC = (ladoA * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloA));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if por si el usuario ingresó otro lado
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloB >= 1 && anguloC >= 1 && ladoB >= 1){
            // Realizamos los calculos correspondientes
            anguloA = 180 - anguloB - anguloC;
            ladoA = (ladoB * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloB));
            ladoC = (ladoB * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloB));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        // Utilizamos otro else if si es que el usaurio ingresó otro lado
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloB >= 1 && anguloC >= 1 && ladoC >= 1){
            // Realizamos los calculos correspondientes
            anguloA = 180 - anguloB - anguloC;
            ladoA = (ladoC * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloC));
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
            // Actualizamos los valores de los lados y angulos
            setLadoA(ladoA);
            setLadoB(ladoB);
            setLadoC(ladoC);
            setAnguloA(anguloA);
            setAnguloB(anguloB);
            setAnguloC(anguloC);
            // Calculamos el resto del triangulo
            area = calcularArea(ladoA, ladoB, anguloC);
            perimetro = calcularPerimetro(ladoA, ladoB, ladoC);
            semiPerimetro = calcularSemiPerimetro(ladoA, ladoB, ladoC);
            ha = heightHa(ladoA, ladoB, ladoC);
            hb = heightHb(ladoA, ladoB, ladoC);
            hc = heightHc(ladoA, ladoB, ladoC);
            ma = medianMa(ladoA, ladoC, anguloB);
            mb = medianMb(ladoA, ladoB, anguloC);
            mc = medianMc(ladoB, ladoC, anguloA);
            radioInterno = calcularRadioInterno(ladoA, ladoB, ladoC);
            radioExterno = calcularRadioExterno(ladoA, anguloA);
            // Retornamos los resultados
            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nAltura ha: " + String.format("%.4f", ha) + "\nAltura hb: " + String.format("%.4f", hb) + "\nAltura hc: " + String.format("%.4f", hc) 
            + "\nMediana ma: " + String.format("%.4f", ma) + "\nMediana mb: " + String.format("%.4f", mb) + "\nMediana mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else{ // Si no se cumple algún caso le decimos al usuario que no se puede resolver el triangulo
            return "No se puede resolver el triangulo!";
        }
    }   
}