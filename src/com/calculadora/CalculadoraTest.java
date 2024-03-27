package com.calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        calculadora.performOperation(20);
        calculadora.performOperation('*');
        calculadora.performOperation(30);
        calculadora.performOperation('-');
        calculadora.performOperation(5);
        
        // Ahora que todas las operaciones y operandos están en su lugar, podemos realizar la operación
        calculadora.performOperation();
        
        double result = calculadora.getResult();
        System.out.println("El resultado de la operación es: " + result);
    }
}
