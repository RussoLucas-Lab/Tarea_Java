//Generador de Listas de Reproducción
//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String humor;
        String verificador;
        boolean a = true;

        List<String> check_humor = Arrays.asList("feliz","triste","energetico","relajado");

        while(a == true){
            while(true) {
                System.out.print("Seleccione su estado de humor:\n Feliz | Triste | Energetico | Rejalado\n");
                humor = sc.next();
                humor = humor.toLowerCase();
                if (check_humor.contains(humor)) {
                    switch (humor) {
                        case "feliz":
                            System.out.print("Si usted se encuentra "+ humor +" le recomendamos las siguientes canciones:\n");
                            System.out.print("\"Happy\" – Pharrell Williams\n" +
                                    "\"Can't Stop the Feeling\" – Justin Timberlake\n" +
                                    "\"Walking on Sunshine\" – Katrina and the Waves\n" +
                                    "\"Good as Hell\" – Lizzo\n" +
                                    "\"Uptown Funk\" – Mark Ronson ft. Bruno Mars\n\n");
                        case "triste":
                            System.out.print("Si usted se encuentra "+ humor +" le recomendamos las siguientes canciones:\n");
                            System.out.print("\"Someone Like You\" – Adele\n" +
                                    "\"The Night We Met\" – Lord Huron\n" +
                                    "\"Fix You\" – Coldplay\n" +
                                    "\"Tears Dry on Their Own\" – Amy Winehouse\n" +
                                    "\"Hurt\" – Johnny Cash (cover de Nine Inch Nails)\n\n");
                        case "energetico":
                            System.out.print("Si usted se encuentra "+ humor +" le recomendamos las siguientes canciones:\n");
                            System.out.print("\"Eye of the Tiger\" – Survivor\n" +
                                    "\"Thunderstruck\" – AC/DC\n" +
                                    "\"Don't Stop Me Now\" – Queen\n" +
                                    "\"Born to Run\" – Bruce Springsteen\n" +
                                    "\"Stronger\" – Kanye West\n\n");
                        case "relajado":
                            System.out.print("Si usted se encuentra "+ humor +" le recomendamos las siguientes canciones:\n");
                            System.out.print("\"Weightless\" – Marconi Union\n" +
                                    "\"Sunset Lover\" – Petit Biscuit\n" +
                                    "\"Banana Pancakes\" – Jack Johnson\n" +
                                    "\"Holocene\" – Bon Iver\n" +
                                    "\"Gravity\" – John Mayer\n\n");
                    }
                    break;
                }else{
                    System.out.print("Incorrecto, intentelo nuevamente...\n");

                }
                }
            while (true) {

                System.out.print("¿Desea finalizar? (SI) | (NO)\n");

                verificador = sc.nextLine();
                verificador = verificador.toUpperCase();


                if (verificador.equals("NO") || verificador.equals("SI")) {
                    if (verificador.equals("NO")) {
                        break;
                    } else {
                        System.out.print("¡Gracias!\n");
                        a = false;
                        break;
                    }
                }
                else {
                    System.out.print("Incorrecto, intentelo nuevamente...\n");

                }
                }
            }

        }
    }

