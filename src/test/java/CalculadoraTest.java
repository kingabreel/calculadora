package test.java;

import main.java.Calculadora;
import main.java.Numeros;
import org.junit.Test;
import org.junit.Assert;
public class CalculadoraTest {
    Numeros numeros = new Numeros(5, 19);
    Calculadora calc = new Calculadora();

    @Test
    public void validarSoma(){
        Assert.assertEquals(24, calc.soma(numeros.getNumero1(), numeros.getNumero2()));
    }
    @Test
    public void validarMultiplicacao(){
        Assert.assertEquals(95, calc.multiplicacao(numeros.getNumero2(), numeros.getNumero1()));
    }
    @Test
    public void validarSubtracao(){
        Assert.assertEquals(14, calc.subtracao(numeros.getNumero2(), numeros.getNumero1()));
        Assert.assertEquals(-14, calc.subtracao(numeros.getNumero1(), numeros.getNumero2()));
    }
    @Test
    public void validarDivisao(){
        numeros.setNumero2(20);
        numeros.setNumero1(1);
        Assert.assertEquals(20, calc.divisao(numeros.getNumero2(), numeros.getNumero1()));
    }
}
