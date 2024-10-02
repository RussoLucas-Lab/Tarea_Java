//Generador de Horóscopo
//Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
//imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.

//El programa no tiene en cuenta si el año es bisiesto o no, por lo que se toma a febrero con 28 días

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;


public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        List<Integer> mes_31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> mes_30 = Arrays.asList(4, 6, 9, 11);

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
            dia = sc.nextInt();

            if (mes_31.contains(mes) ) {
    ;           if(0 < dia && dia <=31 ){
                    break;
                }
                else {
                    System.out.print("Dia incorrecto intentelo nuevamente\n");
                }
            }
            else if (mes_30.contains(mes)) {
                if(0 < dia && dia <=30 ){
                    break;
                }
                else {
                    System.out.print("Dia incorrecto intentelo nuevamente\n");
                }
            }
            else if (mes == 2){
                    if(0 < dia && dia <=28 ){
                        break;
                    }
                    else {
                        System.out.print("Dia incorrecto intentelo nuevamente\n");
                    }
            }
            else {
                System.out.print("Dia incorrecto intentelo nuevamente\n");
            }
        }

        System.out.print("\nSu fecha de nacimiento es: "+ dia + "/" + mes + "/" + anio+"\n");

        switch(mes) {

            case 1:
                if (dia >= 20) {
                    System.out.print("Su sigo es ACUARIO\n");
                    System.out.print(" Mi mente visionaria busca siempre nuevas formas de cambiar el mundo.");
                    break;
                } else {
                    System.out.print("Su sigo es CAPRICORNIO\n");
                    System.out.print("Con paciencia y disciplina, construyo mi éxito un paso a la vez.");
                    break;
                }
            case 2:
                if (dia >= 19) {
                    System.out.print("Su sigo es PISCIS\n");
                    System.out.print("Fluyo con la corriente de mis sueños, encontrando significado en la conexión espiritual");
                    break;
                } else {
                    System.out.print("Su sigo es ACUARIO\n");
                    System.out.print(" Mi mente visionaria busca siempre nuevas formas de cambiar el mundo.");
                    break;
                }
            case 3:
                if (dia >=21) {
                    System.out.print("Su sigo es ARIES\n");
                    System.out.print("El fuego de mi pasión me impulsa a conquistar cualquier desafío.");
                    break;
                } else {
                    System.out.print("Su sigo es PISCIS\n");
                    System.out.print("Fluyo con la corriente de mis sueños, encontrando significado en la conexión espiritual");
                    break;
                }
            case 4:
                if (dia >= 20) {
                    System.out.print("Su sigo es TAURO\n");
                    System.out.print("La estabilidad y la tranquilidad son los cimientos sobre los que construyo mi vida");
                    break;
                } else {
                    System.out.print("Su sigo es ARIES\n");
                    System.out.print("El fuego de mi pasión me impulsa a conquistar cualquier desafío.");
                    break;
                }
            case 5:
                if (dia >= 21) {
                    System.out.print("Su sigo es GEMINIS\n");
                    System.out.print("Mi curiosidad infinita me lleva a descubrir nuevas ideas y perspectivas.");
                    break;
                } else {
                    System.out.print("Su sigo es TAURO\n");
                    System.out.print("La estabilidad y la tranquilidad son los cimientos sobre los que construyo mi vida");
                    break;
                }
            case 6:
                if (dia >= 21) {
                    System.out.print("Su sigo es CANCER\n");
                    System.out.print("Encuentro fuerza en mis emociones, y mi hogar es mi refugio.");
                    break;
                } else {
                    System.out.print("Su sigo es GEMIIS\n");
                    System.out.print("Mi curiosidad infinita me lleva a descubrir nuevas ideas y perspectivas.");
                    break;
                }
            case 7:
                if (dia >= 23) {
                    System.out.print("Su sigo es LEO\n");
                    System.out.print("Brillo con confianza, y el mundo es el escenario en el que muestro mi grandeza.");
                    break;
                } else {
                    System.out.print("Su sigo es CANCER\n");
                    System.out.print("Encuentro fuerza en mis emociones, y mi hogar es mi refugio.");
                    break;
                }
            case 8:
                if (dia >= 23) {
                    System.out.print("Su sigo es VIRGO\n");
                    System.out.print("La perfección está en los detalles, y cada paso que doy es preciso y calculado.");
                    break;
                } else {
                    System.out.print("Su sigo es LEO\n");
                    System.out.print("Brillo con confianza, y el mundo es el escenario en el que muestro mi grandeza.");
                    break;
                }
            case 9:
                if (dia >= 23) {
                    System.out.print("Su sigo es LIBRA\n");
                    System.out.print("El equilibrio y la armonía guían mis decisiones, buscando siempre la justicia.");
                    break;
                } else {
                    System.out.print("Su sigo es VIRGO\n");
                    System.out.print("La perfección está en los detalles, y cada paso que doy es preciso y calculado.");
                    break;
                }
            case 10:
                if (dia >= 23) {
                    System.out.print("Su sigo es ESCORPIO\n");
                    System.out.print("Mi intensidad emocional me lleva a profundizar en lo desconocido y transformarme.");
                    break;
                } else {
                    System.out.print("Su sigo es LIBRA\n");
                    System.out.print("El equilibrio y la armonía guían mis decisiones, buscando siempre la justicia.");
                    break;
                }
            case 11:
                if (dia >= 23) {
                    System.out.print("Su sigo es SAGITARIO\n");
                    System.out.print("La libertad de explorar el mundo y el conocimiento es mi mayor aventura.");
                    break;
                } else {
                    System.out.print("Su sigo es ESCORPIO\n");
                    System.out.print("Mi intensidad emocional me lleva a profundizar en lo desconocido y transformarme.");
                    break;
                }
            case 12:
                if (dia >= 23) {
                    System.out.print("Su sigo es CAPRICORNIO \n");
                    System.out.print("Con paciencia y disciplina, construyo mi éxito un paso a la vez.");
                    break;
                } else {
                    System.out.print("Su sigo es SAGITARIO\n");
                    System.out.print("La libertad de explorar el mundo y el conocimiento es mi mayor aventura.");
                    break;
                }
        }
        }

    }

