package entities;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		
		//Princípio get/put - covariância
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		List<? extends Number> list = intList;
		Number x = list.get(0);
		//Não é possível adicionar com o add.
		//è possivel utilizar o get
		
		//list.add(20); // erro de compilacao

	}

}
