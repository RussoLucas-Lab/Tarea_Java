//Generador de Rutinas de Ejercicio
//Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
//avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
//duraciones.


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condicion;
        List<Integer> check_ejercicio = Arrays.asList(1, 2, 3);

        while(true) {
            System.out.print("Ingrese su condición física:\n(1) Principiante | (2) Intermedio | (3) Avanzado\n");
            condicion = sc.nextInt();
            if(check_ejercicio.contains(condicion)){
                break;
            }else {System.out.print("Incorrecto intentelo nuevamente\n");}

        }
        switch (condicion){
            case 1:
                System.out.print("Principiante (3 días por semana)\n" +
                        "Día 1:\n" +
                        "\n" +
                        "Caminata rápida – 20 minutos\n" +
                        "Entrenamiento de fuerza (peso corporal): Sentadillas, flexiones (modificadas), plancha – 2 series de 10 repeticiones\n" +
                        "Día 2:\n" +
                        "\n" +
                        "Ciclismo ligero – 30 minutos\n" +
                        "Estiramientos (piernas, espalda, brazos) – 10 minutos\n" +
                        "Día 3:\n" +
                        "\n" +
                        "Natación ligera – 20 minutos\n" +
                        "Core básico: Abdominales, puente de glúteos – 2 series de 10 repeticiones");
            case 2:
                System.out.print("Intermedio (5 días por semana)\n" +
                        "Día 1:\n" +
                        "\n" +
                        "Correr (moderado) – 30 minutos\n" +
                        "Entrenamiento de fuerza (peso corporal): Sentadillas, estocadas, flexiones – 3 series de 12 repeticiones\n" +
                        "Día 2:\n" +
                        "\n" +
                        "Ciclismo moderado – 45 minutos\n" +
                        "Estiramientos dinámicos – 10 minutos\n" +
                        "Día 3:\n" +
                        "\n" +
                        "HIIT ligero (trote, saltos, burpees) – 20 minutos\n" +
                        "Entrenamiento de fuerza (pesas ligeras): Prensa de pecho, remo, zancadas – 3 series de 10 repeticiones\n" +
                        "Día 4:\n" +
                        "\n" +
                        "Natación moderada – 30 minutos\n" +
                        "Estiramientos – 10 minutos\n" +
                        "Día 5:\n" +
                        "\n" +
                        "Correr o caminar rápido – 30 minutos\n" +
                        "Core intermedio: Plancha lateral, elevaciones de pierna – 3 series de 15 repeticiones");
            case 3:
                System.out.print("Intermedio (5 días por semana)\n" +
                        "Día 1:\n" +
                        "\n" +
                        "Correr (moderado) – 30 minutos\n" +
                        "Entrenamiento de fuerza (peso corporal): Sentadillas, estocadas, flexiones – 3 series de 12 repeticiones\n" +
                        "Día 2:\n" +
                        "\n" +
                        "Ciclismo moderado – 45 minutos\n" +
                        "Estiramientos dinámicos – 10 minutos\n" +
                        "Día 3:\n" +
                        "\n" +
                        "HIIT ligero (trote, saltos, burpees) – 20 minutos\n" +
                        "Entrenamiento de fuerza (pesas ligeras): Prensa de pecho, remo, zancadas – 3 series de 10 repeticiones\n" +
                        "Día 4:\n" +
                        "\n" +
                        "Natación moderada – 30 minutos\n" +
                        "Estiramientos – 10 minutos\n" +
                        "Día 5:\n" +
                        "\n" +
                        "Correr o caminar rápido – 30 minutos\n" +
                        "Core intermedio: Plancha lateral, elevaciones de pierna – 3 series de 15 repeticiones\n" +
                        "Avanzado (6 días por semana)\n" +
                        "Día 1:\n" +
                        "\n" +
                        "Correr rápido – 40 minutos\n" +
                        "Entrenamiento de fuerza avanzado (pesas pesadas): Prensa de pierna, peso muerto, press de banca – 4 series de 12 repeticiones\n" +
                        "Día 2:\n" +
                        "\n" +
                        "HIIT intenso (sprints, burpees, saltos) – 30 minutos\n" +
                        "Core avanzado: Plancha con peso, rueda abdominal – 4 series de 15 repeticiones\n" +
                        "Día 3:\n" +
                        "\n" +
                        "Natación intensa – 40 minutos\n" +
                        "Estiramientos avanzados – 15 minutos\n" +
                        "Día 4:\n" +
                        "\n" +
                        "Ciclismo rápido o de montaña – 60 minutos\n" +
                        "Entrenamiento de fuerza avanzado (pesas pesadas): Remo con barra, press militar, dominadas – 4 series de 10 repeticiones\n" +
                        "Día 5:\n" +
                        "\n" +
                        "Carrera de velocidad o cuestas – 30 minutos\n" +
                        "Entrenamiento de piernas avanzado: Sentadillas pesadas, zancadas con salto – 4 series de 12 repeticiones\n" +
                        "Día 6:\n" +
                        "\n" +
                        "Cardio moderado (correr o ciclismo) – 40 minutos\n" +
                        "Estiramientos y flexibilidad – 20 minutos");
        }
    }
}
