import java.util.Scanner; //importando Scanner

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Instanciando Scanner para receber entrada de dados
        Calculadora calculadora = new Calculadora();

        System.out.println(" ---------------------- ");
        System.out.println(" -- CALCULADORA JAVA -- ");
        System.out.println(" ---------------------- ");

        do {
            System.out.println("Que operaçao deseja fazer? ");
            System.out.println(" ---------------------- ");

            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println(" ---------------------- ");

            calculadora.setOperador(scan.nextInt());
            // System.out.println(calculadora.getOperador());

            if (calculadora.validarEntrada()) {

                System.out.println("Digite o valor um: ");
                calculadora.setValorUm(scan.nextDouble());
                // System.out.println(calculadora.getValorUm());

                System.out.println("Digite o valor dois: ");
                calculadora.setValorDois(scan.nextDouble());
                // System.out.println(calculadora.getValorDois());

                calculadora.realizarCalculo(calculadora.getOperador(), calculadora.getValorUm(),
                        calculadora.getValorDois());
            } else {
                System.out.println(
                        "Entrada inválida. Certifique-se de inserir números válidos e escolher uma operação válida");
            }
        } while (Calculadora.verificarNovaOperacao());
    }
}