package org.java.es2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	 public static void main(String[] args) {
		 
		 	Scanner sc = new Scanner(System.in);
		 	 
	        Map<Character, Integer> conteggioOccorrenze = new HashMap<>();

	        
	        System.out.print("Iserisci una parola: ");
	        String input = sc.nextLine();
	        
	     
	        for (int i = 0; i < input.length(); i++) {
	            char carattere = input.charAt(i);
	            
	            conteggioOccorrenze.put(carattere, conteggioOccorrenze.getOrDefault(carattere, 0) + 1);
	             
	        }
	        
	        System.out.print(conteggioOccorrenze.entrySet());
	        
	        
	        for (Map.Entry<Character, Integer> entry : conteggioOccorrenze.entrySet()) {
	            char carattere = entry.getKey();
	            int occorrenze = entry.getValue();
	            System.out.println(carattere + ":" + occorrenze);
	        }
	    }

}
