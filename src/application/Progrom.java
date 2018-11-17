package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Progrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String,Integer>votes = new  TreeMap<>();
		
		System.out.print("Enter file full path: ");
		String p = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(p))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int n = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(name)) {
					int votC = votes.get(name);
					votes.put(name, n + votC);
					
				}else {
					votes.put(name, n);
				}
				
				line = br.readLine();

		}
			for (String key : votes.keySet()) {
				
				System.out.println(key + ": " + votes.get(key));
				
				
			}

	} catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
	}
		sc.close();

}

}
