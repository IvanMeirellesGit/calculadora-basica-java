import java.util.Scanner;

public class Calculadora {
    private double valorUm;
    private double valorDois;
    private int operador;

    public double getValorUm() {
        return this.valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }

    public double getValorDois() {
        return this.valorDois;
    }

    public void setValorDois(double valorDois) {
        this.valorDois = valorDois;
    }

    public int getOperador() {
        return this.operador;
    }

    public void setOperador(int operador) {
        this.operador = operador;
    }

    public void realizarCalculo(int operador, double valorUm, double valorDois) {
        switch (operador) {
            case 1:
                System.out.println("Resultado da soma: " + somar(valorUm, valorDois));
                System.out.println(" ---------------------- ");
                break;
            case 2:
                System.out.println("Resultado da subtração: " + subtracao(valorUm, valorDois));
                System.out.println(" ---------------------- ");
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + multiplicacao(valorUm, valorDois));
                System.out.println(" ---------------------- ");
                break;
            case 4:
                System.out.println("Resultado da divisão: " + divisao(valorUm, valorDois));
                System.out.println(" ---------------------- ");
                break;
            default:
                System.out.println("Operação inválida");
                System.out.println(" ---------------------- ");
        }
    }

    private double somar(double valorUm, double valorDois) {
        return valorUm + valorDois;
    }

    private double subtracao(double valorUm, double valorDois) {
        return valorUm - valorDois;
    }

    private double multiplicacao(double valorUm, double valorDois) {
        return valorUm * valorDois;
    }

    private double divisao(double valorUm, double valorDois) {
        if (valorDois == 0) {
            System.out.println("Divisão por zero não permitida!");
        }
        return valorUm / valorDois;
    }

    public boolean validarEntrada() {
        return getOperador() >= 1 && getOperador() <= 4;
    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Realizar nova tarefa?");
        return !sc.nextLine().toUpperCase().equals("N");
    }
}