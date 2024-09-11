import java.lang.Math;

public class calcularTriangulo extends trianguloBase {
    // Constructor vacío
    public calcularTriangulo(){}

    /*
     * Constructor que recibe parametros 
     */ 
    public calcularTriangulo(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC) {
        super(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC);
    }

    /*
     * Método que calcula el area del triangulo
     */
    public double calcularArea(double ladoA, double ladoB, double anguloC){
        // Declaracion de variables
        // Convertimos el anguloC en radianes
        double anguloCToRadians = Math.toRadians(anguloC);
        double area = ladoA * ladoB * Math.sin(anguloCToRadians) / 2;
        return area;
    }

    /*
     * Método que calcula el perimetro del triangulo
     */
    public double calcularPerimetro(double ladoA, double ladoB, double ladoC){
        double perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }

    public double calcularSemiPerimetro(double ladoA, double ladoB, double ladoC){
        double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
        return semiPerimetro;
    }

    public double heightHa(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2;
        double areaHeron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        double ha = (2 * areaHeron  ) / ladoA; 
        return ha;
    }

    public double heightHb(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2;
        double areaHeron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        double hb = (2 * areaHeron ) / ladoB;
        return hb;
    }

    public double heightHc(double ladoA, double ladoB, double ladoC){
        double s = (ladoA + ladoB + ladoC) / 2;
        double areaHeron = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
        double hc = (2 * areaHeron ) / ladoC;
        return hc;
    }

    public double medianMa(double ladoA, double ladoC, double anguloB){
        double anguloBToRadians = Math.toRadians(anguloB);
        double ma = Math.sqrt(Math.pow(ladoA/2, 2) + Math.pow(ladoC, 2) - ladoA * ladoC * Math.cos(anguloBToRadians));
        return ma;
    }

    public double medianMb(double ladoA, double ladoB, double anguloC){
        double anguloCToRadians = Math.toRadians(anguloC);
        double mb = Math.sqrt(Math.pow(ladoB/2, 2) + Math.pow(ladoA, 2) - ladoA * ladoB * Math.cos(anguloCToRadians));
        return mb;
    }

    public double medianMc(double ladoB, double ladoC, double anguloA){
        double anguloAToRadians = Math.toRadians(anguloA);
        double mc = Math.sqrt(Math.pow(ladoC/2, 2) + Math.pow(ladoB, 2) - ladoB * ladoC * Math.cos(anguloAToRadians));
        return mc;
    }

    public double calcularRadioInterno(double ladoA, double ladoB, double ladoC){
        double semiPerimetro =  (ladoA + ladoB + ladoC) / 2;
        double area  = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));
        double radioInterno = area / semiPerimetro;
        return radioInterno;
    }

    public double calcularRadioExterno(double ladoA, double anguloA){
        double anguloAToRadians = Math.toRadians(anguloA);
        double radioExterno = ladoA / (2 * Math.sin(anguloAToRadians));
        return radioExterno;
    }

    public String calcular3Angulos(double ladoA, double ladoB, double ladoC){
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

        if(validarTrianguloCon3Lados(ladoA, ladoB, ladoC)){
            rad1 = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC));
            anguloA = rad1 * (180 / Math.PI);
            rad2 = Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC));
            anguloB = rad2 * (180 / Math.PI);
            rad3 = Math.acos((Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB));
            anguloC = rad3 * (180 / Math.PI);
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

            return "Lado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else{
            return "No se puede calcular un triangulo con esos números de lados!";
        }
    }

   
    public String calcular1Lado2Angulos(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC){
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
        if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoB >= 1 && anguloA >= 1){
            rad1 = Math.asin((ladoB * Math.sin(Math.toRadians(anguloA))) / ladoA);
            anguloRestante1 = rad1 * (180 / Math.PI);
            anguloRestante2 = 180 - anguloA - anguloRestante1;
            ladoRestante = (ladoA * Math.sin(Math.toRadians(anguloRestante2))) / Math.sin(Math.toRadians(anguloA));
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
            "\nHieght ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) + 
            "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc) 
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoB >= 1 && anguloB >= 1){
            rad1 = Math.asin((ladoA * Math.sin(Math.toRadians(anguloB))) / ladoB);
            anguloRestante1 = rad1 * (180 / Math.PI);
            anguloRestante2 = 180 - anguloB - anguloRestante1;
            ladoRestante = (ladoB * Math.sin(Math.toRadians(anguloRestante2))) / Math.sin(Math.toRadians(anguloB));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoRestante) + "\nAngulo A: " + String.format("%.4f", anguloRestante1) 
            + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloRestante2) + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + 
            "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) + "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc)
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc) + 
            "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoB >= 1 && anguloC >= 1){
            ladoRestante = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoA, 2) - (2 * ladoB * ladoA * Math.cos(Math.toRadians(anguloC))));
            rad1 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoB, 2) - Math.pow(ladoA, 2)) / (2 * ladoRestante * ladoB));
            anguloRestante1 = rad1 * (180 / Math.PI);
            rad2 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoA, 2) - Math.pow(ladoB, 2)) / (2 * ladoRestante * ladoA));
            anguloRestante2 = rad2 * (180 / Math.PI);
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB)+ "\nLado C: " + String.format("%.4f", ladoRestante) +  
            "\nAngulo A: " + String.format("%.4f", anguloRestante1) + "\nAngulo B: " + String.format("%.4f", anguloRestante2) + "\nAngulo C: " + String.format("%.4f", anguloC) 
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc) + "\nInradius r: " +
            String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoB >= 1 && ladoC >= 1 && anguloA >= 1){
            ladoRestante = Math.sqrt(Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - (2 * ladoB * ladoC * Math.cos(Math.toRadians(anguloA))));
            rad1 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoRestante * ladoC));
            anguloRestante1 = rad1 * (180 / Math.PI);
            rad2 = Math.acos((Math.pow(ladoRestante, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoRestante * ladoB));
            anguloRestante2 = rad2 * (180 / Math.PI);
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

            return "\nLado A: " + String.format("%.4f", ladoRestante) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloRestante1) + "\nAngulo C: " + String.format("%.4f", anguloRestante2)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight: hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc) 
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoB >= 1 && ladoC >= 1 && anguloB >= 1){
            rad2 = Math.asin((ladoC * Math.sin(Math.toRadians(anguloB))) / ladoB);
            anguloRestante2 = rad2 * (180 / Math.PI);
            anguloRestante1 = 180 - anguloB - anguloRestante2;
            ladoRestante = (ladoB * Math.sin(Math.toRadians(anguloRestante1))) / Math.sin(Math.toRadians(anguloB));
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

            return "\nLado A: " + String.format("%.4f", ladoRestante) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) + 
            "\nAngulo A: " + String.format("%.4f", anguloRestante1) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloRestante2)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro)
            + "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc) + 
            "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
       
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoB >= 1 && ladoC >= 1 && anguloC >= 1){
            rad2 = Math.asin((ladoB * Math.sin(Math.toRadians(anguloC))) / ladoC);
            anguloRestante2 = rad2 * (180 / Math.PI);
            anguloRestante1 = 180 - anguloRestante2 - anguloC;
            ladoRestante = (ladoC * Math.sin(Math.toRadians(anguloRestante1)) / Math.sin(Math.toRadians(anguloC)));
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

            return "\nLado A: " + String.format("%.4f", ladoRestante) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) + 
            "\nAngulo A: " + String.format("%.4f", anguloRestante1) + "\nAngulo B: " + String.format("%.4f", anguloRestante2) + "\nAngulo C: " + String.format("%.4f", anguloC)
            + "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) 
            + "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) + "\nMedian ma: " +
            String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc) + "\nInradius r: " + String.format("%.4f", radioInterno)
            + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoC >= 1 && anguloA >= 1){
            rad2 = Math.asin ((ladoC * Math.sin(Math.toRadians(anguloA))) / ladoA);
            anguloC = rad2 * (180 / Math.PI);
            anguloB = 180 - anguloA - anguloC;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB)) / Math.sin(Math.toRadians(anguloA)));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoC >= 1 && anguloB >= 1){
            ladoB = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - (2 * ladoA * ladoC * Math.cos(Math.toRadians(anguloB))));
            rad1 = Math.acos((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC));
            anguloA = rad1 * (180 / Math.PI);
            anguloC = 180 - anguloA - anguloB;
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && ladoA >= 1 && ladoC >= 1 && anguloC >= 1){
            rad1 = Math.asin((ladoA * Math.sin(Math.toRadians(anguloC))) / ladoC);
            anguloA = rad1 * (180 / Math.PI);
            anguloB = 180 - anguloA - anguloC;
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else{
            return "No se puede resolver el triangulo!";
        }     
    }    

    public String calcular2Lados1Angulo(double ladoA, double ladoB, double ladoC, double anguloA, double anguloB, double anguloC){
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
        if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloB >= 1 && ladoA >= 1){
            anguloC = 180 - anguloA - anguloB;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloA));
            ladoC = (ladoA * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloA));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloB >= 1 && ladoB >= 1){
            anguloC = 180 - anguloA - anguloB;
            ladoA = (ladoB * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloB));
            ladoC = (ladoB * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloB));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloB >= 1 && ladoC >= 1){
            anguloC = 180 - anguloA - anguloB;
            ladoA = (ladoC * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloC));
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloC >= 1 && ladoA >= 1){
            anguloB = 180 - anguloA - anguloC;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloA));
            ladoC = (ladoA * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloA));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloC >= 1 && ladoB >= 1){
            anguloB = 180 - anguloA - anguloC;
            ladoA = (ladoB * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloB));
            ladoC = (ladoB * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloB));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloA >= 1 && anguloC >= 1 && ladoC >= 1){
            anguloB = 180 - anguloA - anguloC;
            ladoA = (ladoC * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloC));
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloB >= 1 && anguloC >= 1 && ladoA >= 1){
            anguloA = 180 - anguloB - anguloC;
            ladoB = (ladoA * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloA));
            ladoC = (ladoA * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloA));
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

            return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloB >= 1 && anguloC >= 1 && ladoB >= 1){
            anguloA = 180 - anguloB - anguloC;
            ladoA = (ladoB * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloB));
            ladoC = (ladoB * Math.sin(Math.toRadians(anguloC))) / Math.sin(Math.toRadians(anguloB));
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

             return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);

        }else if(validarTrianguloCon3Angulos(anguloA, anguloB, anguloC) && anguloB >= 1 && anguloC >= 1 && ladoC >= 1){
            anguloA = 180 - anguloB - anguloC;
            ladoA = (ladoC * Math.sin(Math.toRadians(anguloA))) / Math.sin(Math.toRadians(anguloC));
            ladoB = (ladoC * Math.sin(Math.toRadians(anguloB))) / Math.sin(Math.toRadians(anguloC));
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

             return "\nLado A: " + String.format("%.4f", ladoA) + "\nLado B: " + String.format("%.4f", ladoB) + "\nLado C: " + String.format("%.4f", ladoC) 
            + "\nAngulo A: " + String.format("%.4f", anguloA) + "\nAngulo B: " + String.format("%.4f", anguloB) + "\nAngulo C: " + String.format("%.4f", anguloC) +
            "\nArea: " + String.format("%.4f", area) + "\nPerimetro: " + String.format("%.4f", perimetro) + "\nSemiperimetro: " + String.format("%.4f", semiPerimetro) +
            "\nHeight ha: " + String.format("%.4f", ha) + "\nHeight hb: " + String.format("%.4f", hb) + "\nHeight hc: " + String.format("%.4f", hc) 
            + "\nMedian ma: " + String.format("%.4f", ma) + "\nMedian mb: " + String.format("%.4f", mb) + "\nMedian mc: " + String.format("%.4f", mc)
            + "\nInradius r: " + String.format("%.4f", radioInterno) + "\nCircumradius R: " + String.format("%.4f", radioExterno);
        }else{
            return "No se puede resolver el triangulo!";
        }
    }   
}
