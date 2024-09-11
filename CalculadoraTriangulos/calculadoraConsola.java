import java.util.Scanner;
public class calculadoraConsola {
    private calcularTriangulo triangulo;
    public calculadoraConsola(){
        triangulo = new calcularTriangulo();
    }

    public void calcularTrianguloConsola(){
        Scanner scanner = new Scanner(System.in);
        double ladoA;
        double ladoB;
        double ladoC;
        double anguloA;
        double anguloB;
        double anguloC;
        int contador;
        contador = 0;
        System.out.println("Ingrese el lado A: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado A:");
            scanner.next();
        }
        ladoA = scanner.nextDouble();
        while(ladoA <= -1){
            System.out.println("No se puede tener ese lado!");
            System.out.println("Ingresa de nuevo el lado A: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado A:");
                scanner.next();
            }
            ladoA = scanner.nextDouble();
        }
        if(ladoA >= 1){
            contador++;
        }
        System.out.println("Ingrese el lado B: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado B:");
            scanner.next();
        }
        ladoB = scanner.nextDouble();
        while(ladoB <= -1){
            System.out.println("No se puede tener ese lado!");
            System.out.println("Ingresa de nuevo el lado B: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado B:");
                scanner.next();
            }
            ladoB = scanner.nextDouble();
        }
        if(ladoB >= 1){
            contador++;
        }
        System.out.println("Ingrese el lado C:");
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado C:");
            scanner.next();
        }
        ladoC = scanner.nextDouble();
        while(ladoC <= -1){
            System.out.println("No se puede tener ese lado!");
            System.out.println("Ingresa de nuevo el lado C: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado C:");
                scanner.next();
            }
            ladoC = scanner.nextDouble();
        }
        if(ladoC >= 1){
            contador++;
        }
        System.out.println("Ingrese el angulo A: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo A:");
            scanner.next();
        }
        anguloA = scanner.nextDouble();
        while(anguloA <= -1){
            System.out.println("No se puede tener ese angulo!");
            System.out.println("Ingrese de nuevo el angulo A: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo A:");
                scanner.next();
            }
            anguloA = scanner.nextDouble();
        }
        if(anguloA >= 1){
            contador++;
        }
        System.out.println("Ingrese el angulo B: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo B:");
            scanner.next();
        }
        anguloB = scanner.nextDouble();
        while(anguloB <= -1){
            System.out.println("No se puede tener ese angulo!");
            System.out.println("Ingrese de nuevo el angulo B: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo B:");
                scanner.next();
            }
            anguloB = scanner.nextDouble();
        }
        if(anguloB >= 1){
            contador++;
        }
        System.out.println("Ingrese el angulo C: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo C:");
            scanner.next();
        }
        anguloC = scanner.nextDouble();
        while(anguloC <= -1){
            System.out.println("No se puede tener ese angulo!");
            System.out.println("Ingrese de nuevo el angulo C: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo C:");
                scanner.next();
            }
            anguloC = scanner.nextDouble();
        }

        if(anguloC >= 1){
            contador++;
        }
        
        if(contador == 3 && ladoA >= 1 && ladoB >= 1 && ladoC >= 1){
            System.out.println(triangulo.calcular3Angulos(ladoA, ladoB, ladoC));

        }else if(contador == 3 && ((ladoA >= 1 && ladoB >= 1 && anguloA >= 1) || (ladoA >= 1 && ladoB >= 1 && anguloB >= 1) || (ladoA >= 1 && ladoB >= 1 && anguloC >= 1) || 
        (ladoA >= 1 && ladoC >= 1 && anguloA >= 1) || (ladoA >= 1 && ladoC >= 1 && anguloB >= 1) || (ladoA >= 1 && ladoC >= 1 && anguloC >= 1) || 
        (ladoB >= 1 && ladoC >= 1 && anguloA >= 1) || (ladoB >= 1 && ladoC >= 1 && anguloB >= 1) || (ladoB >= 1 && ladoC >= 1 && anguloC >= 1))){
            System.out.println(triangulo.calcular1Lado2Angulos(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC));

        }else if(contador == 3 && ((ladoA >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoA >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoA >= 1 && anguloB >= 1 && anguloC >= 1) || 
        (ladoB >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoB >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoB >= 1 && anguloB >= 1 && anguloC >= 1) || 
        (ladoC >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoC >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoC >= 1 && anguloB >= 1 && anguloC >= 1))){
            System.out.println(triangulo.calcular2Lados1Angulo(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC));

        }else if(contador < 3){
            System.out.println("No puedes ingresar menos de 3 datos!");
        }else{
            System.out.println("No puedes ingresar mas de 3 datos!");
        }

         
    }


    public static void main(String[] args) {
        calculadoraConsola opc = new calculadoraConsola();
        opc.calcularTrianguloConsola();
    }
}
