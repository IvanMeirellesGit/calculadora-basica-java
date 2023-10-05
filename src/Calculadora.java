public class Calculadora {
    private double valorUm;
    private double valorDois;
    private String operador;

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

    public String getOperador() {
        return this.operador;
    }

    public void setoperador(String operador) {
        this.operador = operador;
    }

    public double somar() {
        return getValorUm() + getValorDois();
    }

    public double multiplicacao() {
        return getValorUm() * getValorDois();
    }

    public double subtracao() {
        return getValorUm() - getValorDois();
    }

    public double divisao() {
        return getValorUm() / getValorDois();
    }

}