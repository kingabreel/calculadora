package test.java;

import main.java.Calculadora;
import main.java.Numeros;
import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


public class CalculadoraTest {
    /*Existem outros tipos de teste como o @BeforeAll, @AfterAll, @BeforeEach e @AfterEach
    * Os nomes são auto explicativos, os dois primeiros serão testes que serão execultados antes
    * e depois de todos os testes, respectivamente. Já os dois ultimos, serão executados antes e depois
    * de cada teste.*/
    Numeros numeros = new Numeros(5, 19);
    Calculadora calc = new Calculadora();

    @Order(1)
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
    @Order(2)
    @Test
    public void validarDivisao(){
        numeros.setNumero2(20);
        numeros.setNumero1(1);
        Assert.assertEquals(20, calc.divisao(numeros.getNumero2(), numeros.getNumero1()));
    }
    @Test
    public void validarCalc(){
        //Assumptions, são presunções, o código será execultado caso o Assumpption seja verdadeiro.

        //Aqui terá um erro, pois o objeto calc não é nulo, então a condição abaixo é verdadeira
        //Assumptions.assumeFalse(calc != null);

        Assumptions.assumeTrue(calc != null);
        Assert.assertEquals(20, 30-10);
    }
    /*Existem testes que são execultados somente em determinadas condições, por exemplo:
    * @EnableIf
    * @EnableOnOS*/
    @Order(4)
    @Test
    @EnabledOnOs(OS.LINUX)
    public void testeLinux(){
        System.out.println("sistema linux detectado");
    }
    @Order(3)
    @Test
    @DisabledOnOs({OS.MAC, OS.WINDOWS})
    public void testeOutrosOS(){
        System.out.println("Sistema não é windows ou mac");
    }

    @Order(4)
    @Test
    public void testeExcecao(){
        Assert.assertThrows(ArithmeticException.class, () ->
                calc.divisao(10,0));
    }
}
