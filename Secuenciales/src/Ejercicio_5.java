// Calculadora de Costo de Viaje
//Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
//combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
//calcule e imprima el costo total del viaje.


import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float costo, kilometros, consumo, precio;

        while (true) {

            while (true) {
                System.out.print("Ingrese la distancia en kilometros de su viaje: ");
                kilometros = sc.nextFloat();

                if (kilometros < 0) {
                    System.out.print("Distancia negativa, intentelo nuevamente: \n");
                } else {
                    break;
                }
            }
            while (true) {
                System.out.print("Ingrese el consumo de combustible en litros por kilometros ");
                consumo = sc.nextFloat();

                if (consumo < 0) {
                    System.out.print("Distancia negativa, intentelo nuevamente: ");
                } else {
                    break;
                }
            }
            while (true) {
                System.out.print("Ingrese el precio de la nafta por litro: ");
                precio = sc.nextFloat();

                if (precio < 0) {
                    System.out.print("Precio negativa, intentelo nuevamente: \n");
                } else {
                    break;
                }
            }

            costo = precio * kilometros / consumo;
            System.out.print("El costo total para un viaje de "+kilometros+" kilometros , con una media de "+consumo+" litros por kilometo, y un precio de "+precio+" el litro de combustibble es:\n"+"$"+costo);
            break;
        }
    }
}
