import java.util.Scanner;
public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Se crea un menu para que la persona seleccione la conversion deseada
        System.out.println("Menú de temperaturas");
        System.out.println("1 ---> Fahrenheit ");
        System.out.println("2 ---> Celcius ");
        
        System.out.println("Ingresa un codigo"); //La persona ingresa el codigo por teclado
        int codigo = scanner.nextInt(); //NOTA: Intente hacer un do while con la intencion de validar el codigo (codigo<1 || codigo>2) y que se quedara en un bucle en caso de ingresar un codigo incorrceto pero no corria el programa 

        System.out.println("Ingresa la temperatura a convertir "); //Se pide que ingrese el valor a convertir 
        double temperatura = scanner.nextDouble();

        switch (codigo) { //Se usa un switch que contiene cada formula de conversion segun la deseada
            case 1:
                double fahrenheit = (temperatura*9/5)+32;
                System.out.println("La temperatura en fahrenheit es " + fahrenheit);
                break;
            case 2:
                double celcius = (temperatura-32)*5/9;
                System.out.println("La temperatura en celcius es " + celcius);
            default:
                System.out.println("Opcion  no valida");
                break;
        }

    }
}