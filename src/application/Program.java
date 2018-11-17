package application;

import java.util.LinkedHashMap;
import java.util.Map;

import entiries.Client;

public class Program {

	public static void main(String[] args) {
		
		  
	    Client c1 = new Client("Ana",2222222);
	    Client c2 = new Client("Maria",678800093);
	    Client c3 = new Client("Bob", 349900333);
	     
	    Map<Integer, Client> ht = new LinkedHashMap<>();
	    ht.put(1, c1);
	    ht.put(2, c2);
	    ht.put(3, c3);
	    
	    System.out.println("CPF \t\t Cliente");
	    for (int i = 1; i <= ht.size(); i++) {
	      System.out.println(ht.get(i));
	    }
	  }

	}


