package br.com.marcos.matrizes;

public class MatrizDeDoubles {
	
	double[][] matriz;
	
	MatrizDeDoubles(double[][] matriz) {
		this.matriz = matriz;
	}
	
	boolean eIgual(double[][] matriz) {
		boolean resultado = true;
		
		//Verificando se matrizes possuem o mesmo numero de linhas
		if(this.matriz.length == matriz.length) {
			for(int i = 0; i < this.matriz.length && resultado; i++) {
				
				//Verificando se as linhas possuem o mesmo numero de colunas
				if(this.matriz[i].length == matriz[i].length) {
					for(int j = 0; j < this.matriz[i].length && resultado; j++) {
						
						//Verificando se os elementos correspondentes são diferentes
						if(this.matriz[i][j] != matriz[i][j]) {
							resultado = false;
						}
					}
				} else {
					resultado  = false;
					break;
				}
			}
		} else {
			resultado = false;
		}
		return resultado;
	}
}
