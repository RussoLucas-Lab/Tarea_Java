//Generador de Horóscopo
//Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
//imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;
        int mes;
        int anio;
        boolean a;
        int [] mes_31 = {1, 3, 5, 7, 8, 10, 12};
        int [] mes_30 = {4, 6, 9, 11};
        while(true) {

            System.out.print("Ingrese su año de nacimiento: ");
            anio = sc.nextInt();

            if (anio > 2024 || anio < 1900) {
                System.out.print("Año incorrecto intentelo nuevamente\n");
            }
            else {
                break;
            }
        }

        while(true) {

            System.out.print("Ingrese su mes de nacimiento (1-12): ");
            mes = sc.nextInt();

            if (0 < mes && mes < 13 ) {
                break;
                            }
            else {
                System.out.print("Mes incorrecto intentelo nuevamente\n");
            }
        }
        while(true) {

            System.out.print("Ingrese su Día de nacimiento: ");
            mes = sc.nextInt();

            if () {
                break;

            }
            else {
                System.out.print("Mes incorrecto intentelo nuevamente\n");
            }
        }

    }
}
