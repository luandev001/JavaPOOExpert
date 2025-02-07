package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Enter file full path");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer record = Integer.parseInt(fields[1]);
				
				if(votos.containsKey(name)) {
					int qtdeVotos = votos.get(name);
					votos.put(name, record + qtdeVotos);//pega o nome e o registro de votos somando aos votos aonteriores caso o nome ja tenha aparecido
				}
				else {
					votos.put(name, record); // caso não tenha nenhum voto é acrescentado um nome+voto do candidato
					
				}
				
				line = br.readLine();
			}
			
			//Esse for é para pegar cada nome+ votos de cada registro e printar na tela
			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
