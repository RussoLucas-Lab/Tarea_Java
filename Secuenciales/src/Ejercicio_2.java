//Calculadora de Calorías Quemadas

//Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
//minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
//calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
//ejercicio.

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso;
        int minutos;
        int ejercicio;
        float cal_quemadas;
        List<Integer> check_ejercicio = Arrays.asList(1, 2, 3);

        while(true){

            System.out.print("ingrese su peso:");
            peso = sc.nextFloat();

            if(peso>0){
                break;
            } else {
                System.out.print("No puede tener peso negativo, intentelo nuevamente: \n");
            }
        }

        while(true){
            System.out.print("¿Cuantos minutos entrenó?");
            minutos = sc.nextInt();
            if(minutos<0){
                System.out.print("Minutos negativos, intentelo nuevamente: \n");
            }else{break;}
            }
        while(true){

            System.out.print("¿Que ejercicio realio?\n(1) Correr | (2) Nadar | (3) bicicleta");
            ejercicio = sc.nextInt();

            if (check_ejercicio.contains(ejercicio)){
            break;
            } else{
                System.out.print("Ejercicio incorrecto, intentelo nuevamente\n: ");
            }
        }

        switch (ejercicio){
            case 1:
                cal_quemadas = (float) ((peso * 8.3 * minutos) / 60);
                System.out.print("Luego de " + minutos + " minuto/s corriendo usted quemo "+ cal_quemadas+ " calorias");
                break;
            case 2:
                cal_quemadas = (float) ((peso * 5.8  * minutos) / 60);
                System.out.print("Luego de " + minutos + " minuto/s nadando usted quemo "+ cal_quemadas+ " calorias");
                break;
            case 3:
                cal_quemadas = (float) ((peso * 7.5  * minutos) / 60);
                System.out.print("Luego de " + minutos + " minuto/s andando en bici usted quemo "+ cal_quemadas + " calorias");
                break;


        }
    }
}
