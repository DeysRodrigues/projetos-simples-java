package ContaCorrente;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Conta conta = new Conta (101010, "Deys Rodrigues", 500.0d);
        try (Scanner leitor = new Scanner(System.in)) {
            int opcaoMenu;
            System.out.println("Escolha uma opção");
            System.out.println("1 - Ver todos os dados");
            System.out.println("2 - Mudar nome do titular");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Sair");
            opcaoMenu = leitor.nextInt();

            switch (opcaoMenu) {

                case 1:
                    conta.MostrarDados();
                    break;

                case 2:
                    System.out.println("Qual o nome do titular");
                    conta.setTitular(leitor.nextLine());
                    conta.MudarNome();
                    break;

                case 3:
                    System.out.println("Quanto você quer depositar?");
                    conta.setQuantidade(leitor.nextDouble());
                    System.out.println("Deu! seu novo saldo é: " + conta.Depositar());
                    break;

                case 4:
                    System.out.println("Quanto você quer sacar?");
                    conta.setQuantidade(leitor.nextDouble());
                    System.out.println("Deu! seu novo saldo é: " + conta.Sacar());
                    break;

                case 5:
                    break;

            }
        }

    }
}
