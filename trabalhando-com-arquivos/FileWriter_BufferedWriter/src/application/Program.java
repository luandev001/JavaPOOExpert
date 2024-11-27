package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] { "\n" + "Good morning", "Good afternoon", "Good night \n" };
		String path = "C:\\devTemp\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); //Para dar quebra de linha --> newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}