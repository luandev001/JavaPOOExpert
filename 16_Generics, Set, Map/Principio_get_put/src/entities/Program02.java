package entities;

import java.util.ArrayList;
import java.util.List;

public class Program02 {

	public static void main(String[] args) {
		
		//Princípio get/put - contravariância
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		//è possível adicionar
		//Não pode utilizar o get
		//Number x = myNums.get(0); // erro de compilacao

	}

}
