//6: Generador de Planes de Estudio
//Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
//plan de estudio semanal distribuyendo esas horas en diferentes materias.



import java.util.Scanner;


public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasDiarias = sc.nextInt();

        String materia1 = "Matemáticas";
        String materia2 = "Ciencias";
        String materia3 = "Historia";
        String materia4 = "Programacion";

        int horasPorMateria = horasDiarias / 4;
        int horasRestantes = horasDiarias % 4;

        System.out.println("\nPlan de Estudio Semanal:");

        // Día 1
        System.out.println("\nDía 1:");
        System.out.println(materia1 + ": " + (horasPorMateria + (horasRestantes > 0 ? 1 : 0)) + " horas");
        System.out.println(materia2 + ": " + horasPorMateria + " horas");
        System.out.println(materia3 + ": " + horasPorMateria + " horas");
        System.out.println(materia4 + ": " + horasPorMateria + " horas");

        // Día 2
        System.out.println("\nDía 2:");
        System.out.println(materia1 + ": " + horasPorMateria + " horas");
        System.out.println(materia2 + ": " + (horasPorMateria + (horasRestantes > 1 ? 1 : 0)) + " horas");
        System.out.println(materia3 + ": " + horasPorMateria + " horas");
        System.out.println(materia4 + ": " + horasPorMateria + " horas");

        // Día 3
        System.out.println("\nDía 3:");
        System.out.println(materia1 + ": " + horasPorMateria + " horas");
        System.out.println(materia2 + ": " + horasPorMateria + " horas");
        System.out.println(materia3 + ": " + (horasPorMateria + (horasRestantes > 2 ? 1 : 0)) + " horas");
        System.out.println(materia4 + ": " + horasPorMateria + " horas");

        // Día 4
        System.out.println("\nDía 4:");
        System.out.println(materia1 + ": " + horasPorMateria + " horas");
        System.out.println(materia2 + ": " + horasPorMateria + " horas");
        System.out.println(materia3 + ": " + horasPorMateria + " horas");
        System.out.println(materia4 + ": " + (horasPorMateria + (horasRestantes > 3 ? 1 : 0)) + " horas");

        // Día 5
        System.out.println("\nDía 5:");
        System.out.println(materia1 + ": " + horasPorMateria + " horas");
        System.out.println(materia2 + ": " + horasPorMateria + " horas");
        System.out.println(materia3 + ": " + horasPorMateria + " horas");
        System.out.println(materia4 + ": " + horasPorMateria + " horas");
    }
}
