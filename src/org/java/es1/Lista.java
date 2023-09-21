package org.java.es1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	 public static void main(String[] args) {
		 
		 
	        ArrayList<Task> listaRegali = new ArrayList<>();
	       
	        Scanner scanner = new Scanner(System.in);
	        boolean continua = true;
	        System.out.println("----------------------------------");
	        System.out.println("La tua lista dei regali di Natale!");
	        System.out.println("----------------------------------");
	        int x = 0;
	        while (continua) {
	        	System.out.println("");
	        	

	        	try {
	        	    String destinatario;
	        	    do {
	        	        System.out.print("A chi è destinato il regalo? ");
	        	        destinatario = scanner.nextLine();
	        	        if (destinatario.isBlank()) {
	        	        	System.out.println("----------------------------------");
	        	            System.err.println("Il destinatario non può essere vuoto. Riprova riprova.");
	        	            System.out.println("----------------------------------");
	        	        }
	        	    } while (destinatario.isBlank());

	        	    System.out.print("Inserisci il nome del regalo: ");
	        	    String nomeRegalo = scanner.nextLine();
	        	    
	        	    Task task = new Task(destinatario, nomeRegalo);
	        	    listaRegali.add(task);
	        	    System.out.println("----------------------------------");
	        	    System.out.println("Regalo aggiunto alla lista.");
	        	    System.out.println("----------------------------------");
	        	} catch (Exception e) {
	        		System.out.println("----------------------------------");
	        	    System.err.println("Errore durante l'aggiunta del regalo: " + e.getMessage());
	        	    System.out.println("----------------------------------");
	        	    continue;
	        	}

	            System.out.print("Vuoi aggiungere un altro regalo? (sì/no): ");
	            String risposta = scanner.nextLine();
	            if (risposta.equalsIgnoreCase("no")) {
	                continua = false;
	            }
	            
	        }
	        System.out.println("----------------------------------");
	        System.out.println("----------------------------------");
	        System.out.println("\nEcco la lista dei regali di Natale:");
	        System.out.println("");

	        for (int i = 0; i < listaRegali.size(); i++) {
	            System.out.println("N." + (i + 1) + " " + listaRegali.get(i));
	        }

	        scanner.close();
	    }

}
