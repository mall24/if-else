import java.util.Scanner;

class condiciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("usuario ingrese un numero");
        int m= leer.nextInt();

        if (m % 2 == 0){
            System.out.printf(" El numero %d es PAR",m);
        } else {
            System.out.printf(" El  número %d es IMPAR",m);
    }   }
}