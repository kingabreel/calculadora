package main.java;

public class Calculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Numeros numeros = new Numeros(1, 4);

        System.out.println(calculadora.multiplicacao(numeros.getNumero1(), numeros.getNumero2()));

        numeros.setNumero1(2);
        numeros.setNumero2(4);

        int resultado = calculadora.soma(numeros.getNumero1(), numeros.getNumero2());
        System.out.println("Resultado de " + numeros.getNumero1() + " + " + numeros.getNumero2() + " = " + resultado);
    }

    public int soma (int a, int b) {
        return a+b;
    }
    public int subtracao(int a, int b){
        return a-b;
    }
    public int multiplicacao(int a, int b){
        return a*b;
    }
    public int divisao(int a, int b){
        return a/b;
    }
}
