package br.com.marcos.matrizes;

public class Main {
		
	public static void main(String[] args) {
		
		double[][] a = {{-50,1.1, 4.5}, {6.3,-7}, {8,-10.3}};
		double[][] b = {{-50,1.1, 4.5}, {6.3,-7}, {8,-10.3}};
		double[][] c = {{-50,1.1, 4.5}, {63,-7}, {8, 10.3}};
		double[][] d = {{-50,11}, {63,-7}};
		MatrizDeDoubles matriz = new MatrizDeDoubles(a);
		
		System.out.println("A igualdade entres as matrizes a e b é: "+matriz.eIgual(b));
		System.out.println("A igualdade entres as matrizes a e c é: "+matriz.eIgual(c));
		System.out.println("A igualdade entres as matrizes a e d é: "+matriz.eIgual(d));
	
	}
}
