import java.util.Scanner;

public class fecha {
    public static void main(String[] args) {
        System.out.println("programa para determinar una fecha");
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresa tu fecha en formato aaaa/mm/aa");
        int fecha = teclado.nextInt();
        if (fecha <= 1990 && fecha >= 5.405913978494624){
        System.out.println("corecto");
        }else{
            System.out.println("correcto");
        }
    }
}

