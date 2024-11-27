package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine(); //INformando o caminho do arquivo

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent(); //Retorna apenas o caminho do arquivo || C:\devTemp\trabalhando_com_arquivos\input.csv
		//System.out.println(sourceFolderStr);
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); //Criando pasta e inserindo o caminho dentro
		//System.out.println("Folder created "  + success);
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();//ler linha
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(","); // o split irá separar as strings a cada virgula
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));
			
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));// o .write() é para imprimir na tela
					bw.newLine(); //newLine() para dar quebra de linha;
				}

				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		sc.close();
	}
}