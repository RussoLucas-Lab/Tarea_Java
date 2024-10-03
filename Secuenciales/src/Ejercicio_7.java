//Calculadora de Índice de Felicidad
//Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
//vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
//índice de felicidad basado en esos factores.


import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int satisfaccion_vida, estres, salud, dinero, familia;
        float promedio;

        System.out.print("Bienvenido al calculador de Indicide de Felicidad, porfavor ingrese los siguientes datos utilizando una escala de [1-10]\n");

        while (true) {
            System.out.print("\nSatisfaccion con su vida: ");
            System.out.print("\n10 Completamente satisfecho, 1 para nada satisfecho: ");
            satisfaccion_vida = sc.nextInt();

            if (satisfaccion_vida >= 1 && satisfaccion_vida <= 10) {
                break;
            } else {
                System.out.print("Fuera de parametro, intentelo nuevamente\n ");
            }}
        while (true) {
                System.out.print("\nEstres");
                System.out.print("\n10 Sin estres, 1 con excesivo estres: ");
                estres = sc.nextInt();

                if (estres >= 1 && estres <= 10) {
                    break;

                } else {
                    System.out.print("Fuera de parametro, intentelo nuevamente\n ");
                }}
        while (true) {
                System.out.print("\n\nSalud");
                System.out.print("\n10 Excelente salud, 1 con salud deplorable: ");
                salud = sc.nextInt();

                if (salud>= 1 && salud <= 10) {
                    break;

                } else {
                    System.out.print("Fuera de parametro, intentelo nuevamente\n");
                }}
        while (true) {
                System.out.print("\n\nDinero");
                System.out.print("\n10 Mucho dinero, 1 sin dinero: ");
                dinero = sc.nextInt();

                if (dinero>= 1 && dinero <= 10) {
                    break;

                } else {
                    System.out.print("Fuera de parametro, intentelo nuevamente\n");
                }}
        while (true) {
                System.out.print("\n\nFamilia & Amigos");
                System.out.print("\n10 Excelente relacion con familiares y amigos, 1 sin familiares ni amigos: ");
                familia = sc.nextInt();

                if (familia>= 1 && familia <= 10) {
                    break;

                } else {
                    System.out.print("Fuera de parametro, intentelo nuevamente\n");
                }}
            promedio = (familia + dinero + salud + estres + satisfaccion_vida) / 5;
            promedio = Math.round(promedio);
            System.out.print("\nEn una escala de felicidad del [1-10], donde 1 es infeliz y 10 compleatamente feliz, usted posee un indice de: "+promedio);
        }


    }

