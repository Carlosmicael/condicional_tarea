import java.util.Scanner;

/**
 * programa para determinar el valor de la presion en libras por pulgada cuadrada de una onda
 */
public class Presion {
    public static void main(String[] args) {
        System.out.println("programa para determinar el valor de la presion");
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el tiempo");
        int tiempo = teclado.nextInt();

        if (tiempo <= 35 )
            System.out.println("la presion es: 0.46t");
        else{

        if (tiempo >= 35 )
            System.out.println("la presion es: 9,64 psi");


    }
}
}