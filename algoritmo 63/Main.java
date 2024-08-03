import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aulaValor, descontoINSS;
        int aulaMes;

        System.out.println("Valor hora/aula: ");
        aulaValor = scanner.nextDouble();

        System.out.println("Quantidade de aulas por mês: ");
        aulaMes = scanner.nextInt();

        descontoINSS = aulaValor * (aulaValor / 100);

        System.out.println();
        System.out.println("Valor da hora aula: " + "R$" + aulaValor);
        System.out.println("Número de aulas dadas no mês: " + aulaMes);
        System.out.println("Desconto do INSS: " + descontoINSS + "%");

    }
}