import java.util.Scanner; //importando Scanner

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Instanciando Scanner para receber entrada de dados
        Calculadora calculadora = new Calculadora();

        System.out.println(" ---------------------- ");
        System.out.println(" -- CALCULADORA JAVA -- ");
        System.out.println(" ---------------------- ");

        System.out.println("Que operaçao deseja fazer? ");

        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");

        calculadora.setoperador(scan.next());
        // System.out.println(calculadora.getOperador());

        System.out.println("Digite o valor um: ");
        calculadora.setValorUm(scan.nextDouble());
        // System.out.println(calculadora.getValorUm());

        System.out.println("Digite o valor dois: ");
        calculadora.setValorDois(scan.nextDouble());
        // System.out.println(calculadora.getValorDois());

        switch (calculadora.getOperador()) {
            case "+":
                System.out.println("Resultado da soma: " + calculadora.somar());
                break;
            case "-":
                System.out.println("Resultado da subtração: " + calculadora.subtracao());
                break;
            case "*":
                System.out.println("Resultado da soma: " + calculadora.multiplicacao());
                break;
            case "/":
                System.out.println("Resultado da soma: " + calculadora.divisao());
                break;
            default:
                System.out.println("Operação inválida");
        }

    }
}