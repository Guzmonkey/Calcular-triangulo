import java.util.Scanner;
public class calculadoraConsola {
    // Declaración de atributos
    private calcularTriangulo triangulo;

    /*
     * Constructor de la clase calculadoraConsola
     */
    public calculadoraConsola(){
        triangulo = new calcularTriangulo();
    }
    /*
     * Método para calcular un triangulo en consola
     */
    public void calcularTrianguloConsola(){
        // Creamos un objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // Declaración de variables
        double ladoA;
        double ladoB;
        double ladoC;
        double anguloA;
        double anguloB;
        double anguloC;
        int contador = 0;
        // Le pedimos al usuario que ingrese el lado A
        System.out.println("Ingrese el lado A o ingrese 0 si no conoce el valor: ");
        // Utilizamos un ciclo while para evitar que se ingresen letras
        while (!scanner.hasNextDouble()) {
            // Le pedimos al usuario que ingrese de nuevo un valor
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado A:");
            scanner.next();
        }
        // Guardamos el valor
        ladoA = scanner.nextDouble();
        // Utilizamos un ciclo while por si el usuario ingresó un valor negativo
        while(ladoA <= -1){
            // Le pedimos al usaurio que ingrese un valor valido 
            System.out.println("No se puede tener ese lado! \nIngresa de nuevo el lado A:");
            // Utilizamos otro ciclo while por si el usuario ingresa una letra
            while (!scanner.hasNextDouble()) {
                // Le pedimos al usuario que ingrese un valor permitido
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado A:");
                scanner.next();
            }
            ladoA = scanner.nextDouble();
        }
        // Utilizamos un if por si el usuario ingresa un valor mayor o igual a 1 vaya sumando el contador
        if(ladoA >= 1){
            contador++;
        }
        // Pedimos al usuario que ingrese el lado B
        System.out.println("Ingrese el lado B o ingrese 0 si no conoce el valor: ");
        // Utilizamos un ciclo while por si el usuario ingresa una letra
        while (!scanner.hasNextDouble()) { 
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado B:");
            scanner.next();
        }        
        ladoB = scanner.nextDouble();
        // Utilizamos otro ciclo while por el usuario ingresa un valor no permitido
        while(ladoB <= -1){
            System.out.println("No se puede tener ese lado! \nIngresa de nuevo el lado B:");
            // Utilizamos otro ciclo while por si el usuario ingresa una letra
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado B:");
                scanner.next();
            }
            ladoB = scanner.nextDouble();
        }
        // Utilizamos un if por si el usuario ingresa un valor mayor o igual a 1 vaya sumando el contador
        if(ladoB >= 1){
            contador++;
        }
        // Le pedimos al usuario que ingrese el lado C 
        System.out.println("Ingrese el lado C o ingrese 0 si no conoce el valor:");
        // Utilizamos un ciclo while por si el usuario ingresa una letra
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado C:");
            scanner.next();
        }
        ladoC = scanner.nextDouble();
        // Utilizamos otro ciclo while por si el usuario ingresa un numero no permitido
        while(ladoC <= -1){
            System.out.println("No se puede tener ese lado! \nIngresa de nuevo el lado C:");
            // Utilizamos otro ciclo while por si el usuario ingresa una letra
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el lado C:");
                scanner.next();
            }
            ladoC = scanner.nextDouble();
        }
        // Si el usuario ingresó un numero valido lo vamos sumando en el contador
        if(ladoC >= 1){
            contador++;
        }
        // Le pedimos al usuario que ingrese el angulo A
        System.out.println("Ingrese el angulo A o ingrese 0 si no conoce el valor:");
        // Utilizamos un ciclo while para evitar que ingrese letras
        while (!scanner.hasNextDouble()) {
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo A:");
            scanner.next();
        }
        anguloA = scanner.nextDouble();
        // Utilizamos otro ciclo while para evitar que el usuario ingrese numeros no permitidos
        while(anguloA <= -1){
            System.out.println("No se puede tener ese angulo! \nIngrese de nuevo el angulo A: ");
            // Utilizamos otro ciclo while para evitar que el usuario ingrese letras
            while (!scanner.hasNextDouble()) {
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo A:");
                scanner.next();
            }
            anguloA = scanner.nextDouble();
        }
        // Si el usuario ingresa un numero permitido se va sumando el contador
        if(anguloA >= 1){
            contador++;
        }
        // Le pedimos al usuario que ingrese el angulo B
        System.out.println("Ingrese el angulo B o ingrese 0 si no conoce el valor: ");
        while (!scanner.hasNextDouble()) { // Utilizamos un ciclo while para evitar que el usuario ingrese una letra
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo B:");
            scanner.next();
        }
        anguloB = scanner.nextDouble();
        while(anguloB <= -1){// Utilizamos otro ciclo while para evitar que el usuario ingrese numeros no permitidos
            System.out.println("No se puede tener ese angulo! \nIngrese de nuevo el angulo B:");
            while (!scanner.hasNextDouble()) { // Utilizamos otro ciclo while para evitar que se ingresen letras
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo B:");
                scanner.next();
            }
            anguloB = scanner.nextDouble();
        }
        // Si se ingresa un numero permitido vamos sumando el contador
        if(anguloB >= 1){
            contador++;
        }
        // Le pedimos al usuario que ingrese el angulo C
        System.out.println("Ingrese el angulo C o ingrese 0 si no conoce el valor: ");
        while (!scanner.hasNextDouble()) { // Utilizamos un ciclo while para evitar que se ingrese una letra
            System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo C:");
            scanner.next();
        }
        anguloC = scanner.nextDouble();
        while(anguloC <= -1){ // Utilizamos otro ciclo while para evitar que el usuario ingrese numeros no permitidos
            System.out.println("No se puede tener ese angulo! \nIngrese de nuevo el angulo C:");
            while (!scanner.hasNextDouble()) { // Utilizamos otro ciclo while para evitar que el usuario ingrese letras
                System.out.println("No puedes ingresar letras! \nVuelve a ingresar el angulo C:");
                scanner.next();
            }
            anguloC = scanner.nextDouble();
        }
        // Si se ingresa un valor permitido se va sumando el contador
        if(anguloC >= 1){
            contador++;
        }
        // Utilizamos una condición para realizar los calculos
        // En el primer caso el contador tiene que ser igual a 3 y que los 3 lados del triangulo valgan mas de 0
        if(contador == 3 && ladoA >= 1 && ladoB >= 1 && ladoC >= 1){ 
            // Imprimimos el resultado
            System.out.println(triangulo.calcular3Angulos(ladoA, ladoB, ladoC));
        // El segundo caso es para calcular el lado restante y 2 angulos restantes
        }else if(contador == 3 && ((ladoA >= 1 && ladoB >= 1 && anguloA >= 1) || (ladoA >= 1 && ladoB >= 1 && anguloB >= 1) || (ladoA >= 1 && ladoB >= 1 && anguloC >= 1) || 
        (ladoA >= 1 && ladoC >= 1 && anguloA >= 1) || (ladoA >= 1 && ladoC >= 1 && anguloB >= 1) || (ladoA >= 1 && ladoC >= 1 && anguloC >= 1) || 
        (ladoB >= 1 && ladoC >= 1 && anguloA >= 1) || (ladoB >= 1 && ladoC >= 1 && anguloB >= 1) || (ladoB >= 1 && ladoC >= 1 && anguloC >= 1))){
            System.out.println(triangulo.calcular1Lado2Angulos(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC)); // Imprimimos el resultado
        // El siguiente caso es para calcular 2 lados restantes y 1 angulo
        }else if(contador == 3 && ((ladoA >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoA >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoA >= 1 && anguloB >= 1 && anguloC >= 1) || 
        (ladoB >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoB >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoB >= 1 && anguloB >= 1 && anguloC >= 1) || 
        (ladoC >= 1 && anguloA >= 1 && anguloB >= 1) || (ladoC >= 1 && anguloA >= 1 && anguloC >= 1) || (ladoC >= 1 && anguloB >= 1 && anguloC >= 1))){
            System.out.println(triangulo.calcular2Lados1Angulo(ladoA, ladoB, ladoC, anguloA, anguloB, anguloC)); // Imprimimos el resultado
        // Si el contador vale diferente de 3 mostramos dos casos
        }else if(contador < 3){
            // Donde se ingresó menos de 3 datos
            System.out.println("No puedes ingresar menos de 3 datos!");
        }else{
            // Donde se ingresó mas de 3 datos
            System.out.println("No puedes ingresar mas de 3 datos!");
        }
    }

    /*
     * Método Main
     */
    public static void main(String[] args) {
        // Creamos un objeto calculadoraConsola
        calculadoraConsola opc = new calculadoraConsola();
        opc.calcularTrianguloConsola();
    }
}
