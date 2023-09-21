package org.java.es3;

public class Main {

	public static void main(String[] args) {
		 int[] elenco = {1, 2, 3, 4, 5, 6, 8, 2};
	        Number elementi = new Number(elenco);

	        while (elementi.hasAncoraElementi()) {
	            int elemento = elementi.getElementoSuccessivo();
	            System.out.println("Elemento: " + elemento);
	        }

	}

}
