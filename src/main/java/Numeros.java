package main.java;

public class Numeros {
    private int numero1, numero2;

    public Numeros(int a, int b){
        this.numero1 = a;
        this.numero2 = b;
    }
    public void setNumero1(int a) {
        this.numero1 = a;
    }
    public void setNumero2(int b){
        this.numero2 = b;
    }

    public int getNumero1(){
        return numero1;
    }

    public int getNumero2(){
        return numero2;
    }
}
