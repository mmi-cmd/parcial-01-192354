import java.util.Scanner;
public class EncontrarNumeroMayor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int MAXIMA_CANTIDAD_NUMEROS = 3; //Evitar magic numbers
    int [] numeros = new int[MAXIMA_CANTIDAD_NUMEROS]; //Se crea array para ingresar numeros a verificar

    for (int i = 0; i < MAXIMA_CANTIDAD_NUMEROS; i++) { //for que recorre array para llenarlo
        System.out.println("Ingrese el numero de la posicion " + (i+1));
        numeros[i] = scanner.nextInt();
    }
    
    if (numeros[0]>numeros[1] && numeros[0]>numeros[2] ){ //verificacion con if para determinar cual numero es mayor 
            System.out.println("El numero mayor es " + numeros[0]);

    } else if (numeros[1]>numeros[0] && numeros[1]>numeros[2]) {
        System.out.println("El numero mayor es " + numeros[1]);

    } else if (numeros[2]>numeros[0] && numeros[2]>numeros[1]){
        System.out.println("El numero mayor es " + numeros[2]);
    } else{
        System.out.println("Error");
    }
    }
}
