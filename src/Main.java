public class Main {

    public static void main(String[] args) {

        double salario = 1;
        double aumento = 0;

        if (salario <= 280)

        {
            aumento = 2.0;
        }
        else if (salario > 280 && salario <= 700)
        {
            aumento = 1.5;
        }
        else if (salario > 700 && salario <= 1500)
        {
            aumento = 1.0;
        }
        else if (salario > 1500)
        {
            aumento = 5;
        }
        
            salario = salario + (salario * aumento / 100);
            aumento = aumento * 2;

            System.out.println(salario);
            System.out.println(salario * aumento / 100);
            System.out.println(aumento * 2);
            System.out.println(salario + (salario * aumento / 100));

    }}