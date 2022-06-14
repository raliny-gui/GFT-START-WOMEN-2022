import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int idade, cont = 1;
        double altura, somaAltura = 0, peso;
        int idadeX = 0, alturaX = 0;

        do{
            System.out.println("Digite uma idade");
            idade = entrada.nextInt();

            System.out.println("Digite uma altura");
            altura = entrada.nextDouble();

            System.out.println("Digite um peso");
            peso = entrada.nextDouble();

            if( (idade >= 10) && (idade <= 30) ){
                alturaX++;
                somaAltura = altura + somaAltura;
            }
            if(peso > 90){
                alturaX++;
            }
            cont++;
            System.out.println("\n");
        }while(cont <= 4);

        if(idadeX > 0){

        }

        if(alturaX > 1.50){

            System.out.println("A média de pessoas entre 10 e 30 anos é: " + (somaAltura / alturaX) + "\n");
        } else{

            System.out.println("Nenhuma pessoa tem idade entre 10 e 30 anos \n");
        }

        if (alturaX > 0){

            System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (alturaX * 100 / (cont - 1)) + " %");
        } else{
            System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
        }
    }
}
