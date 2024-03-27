package com.calculadora;
import java.util.ArrayList;

public class Calculadora {
	private ArrayList<Double> operando;
	private ArrayList<Character> operaciones;
	private double result;
	private boolean primerOperador;
	
	public Calculadora() {
		operando = new ArrayList<>();
		operaciones = new ArrayList<>();
		result = 0.0;
		primerOperador = false;
	}
	
	public void performOperation(double operando) {
		if (!this.primerOperador) {
			this.operando.add(operando);
			this.primerOperador = true;
		}
		else {
			this.operando.add(operando);
			this.performOperation();
	}
}

	public void performOperation(char operacion) {
		operaciones.add(operacion);
	}
	
	public void performOperation() {
	    result = operando.get(0);
	    for(int i = 0; i < operaciones.size(); i++) {
	        char operacion = operaciones.get(i);
	        double siguienteOperando = operando.get(i + 1);
	        switch (operacion) {
	            case '+':
	                result += siguienteOperando;
	                break;
	            case '-':
	                result -= siguienteOperando;
	                break;
	            case '*':
	                result *= siguienteOperando;
	                break;
	            case '/':
	                if (siguienteOperando != 0) {
	                    result /= siguienteOperando;
	                } else {
	                    System.out.println("Error: División por cero.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Operación no válida");
	        }
	    }
	}

	public double getResult() {
		return result;
	}
}
