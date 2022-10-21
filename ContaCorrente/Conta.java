package ContaCorrente;
import java.util.Scanner;


public class Conta {
    
    Scanner leitor = new Scanner(System.in);
    private int numeroConta;
    private String titular;
    private double saldo;
    double quantidade;

    public Conta (int numeroConta, String titular, double saldo) {// construtor
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void MostrarDados() { // metodo mostrar dados;
        System.out.println("O numero da conta é: " + numeroConta);
        System.out.println("O nome do titular é: " + titular);
        System.out.println("O saldo na conta é de: " + saldo);
    }

    public void MudarNome() { //metodo: mudar nome;
        titular = leitor.nextLine();
    }

    public double Sacar() { // metodo: sacar;
        double novoSaldo = saldo - quantidade;
        this.saldo = novoSaldo;
        return novoSaldo;

    }

    public double Depositar() { // metodo: depositar;
        this.saldo += quantidade;
        return saldo;
    }

    // GETS E SETS//
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}
