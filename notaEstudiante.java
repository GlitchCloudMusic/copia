import java.util.Scanner;

public class notaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota;

        System.out.println("Ingrese la nota del estudiante:");
        nota = teclado.nextFloat();

        if(nota >= 70){
            System.out.println("¡Aprobado!");
        }
        else if(nota >= 60){
            System.out.println("Convocatoria");
        }
        else if (nota < 60){
            System.out.println("Reprobado");
        }
    }
}
