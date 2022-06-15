import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        System.out.println("digita o dia :");
        Scanner in = new Scanner(System.in);
        int dia = in.nextInt();
        System.out.println("digita o mes :");
        int mes = in.nextInt();
        System.out.println("digita o ano :");
        int ano = in.nextInt();
        in.close();

        boolean evalido = true;

        if (dia > 31) {
            System.out.println("dia invalido :");
            evalido = false;
        }
        if (mes > 12) {
            System.out.println("mes invalido :");
            evalido = false;
        }
        if (ano != 2000) {
            System.out.println("ano invalido :");
            evalido = false;
        }

        if (evalido) {
            System.out.println("Data valida");
        }


    }}


