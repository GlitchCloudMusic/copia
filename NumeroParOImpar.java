import java.util.Scanner;

public class NumeroParOImpar{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numero;

        System.out.println("Ingrese el número:");
        numero = teclado.nextFloat();

        if (numero % 2 == 0){
            System.out.println("El número " + numero + " es par");
        }
        else{
            System.out.println("El número " + numero + " es impar");
        }
    }
}