package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Sale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Sale> list = new ArrayList<>();

			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Sale(
						Integer.parseInt(fields[0]), 
						Integer.parseInt(fields[1]), 
						fields[2], 
						Integer.parseInt(fields[3]), 
						Double.parseDouble(fields[4])));
				line = br.readLine(); 
			}
			
			Comparator<Sale> comp = (s1, s2) -> s1.averagePrice().compareTo(s2.averagePrice());
			
			List<Sale> firstSales = list.stream()
					.filter(x -> x.getYear() == 2016) // Filtrar pelo ano
					.sorted(comp.reversed())
					.limit(5) //Limitar pelos 5 primeiros
					.collect(Collectors.toList()); // Transformar em tipo list novamente
 			
			firstSales.forEach(System.out::println); 
			
			String name = "Logan";
			
			double seller = list.stream()
					.filter(s -> s.getMonth() == 1 || s.getMonth()==7)
					.filter(s -> s.getSeller().equals(name))
					.map(s -> s.getTotal())
					.reduce(0.0, (x, y) -> x+y);
									
			
			System.out.println();
			System.out.println("Valor total vendido pelo vendedor " + name + " nos meses 1 e 7 = " + String.format("%.2f", seller));		
					
			// C:\devTemp\in.csv
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();

	}

}
