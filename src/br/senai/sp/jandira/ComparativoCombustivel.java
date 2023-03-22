package br.senai.sp.jandira;

import java.util.Scanner;

public class ComparativoCombustivel {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("**********************************");
		 System.out.println("       GASOLINA OU ÁLCOOL       ");
		 System.out.println("**********************************");
		 System.out.println("");
		 
		 System.out.print("Preço da gasolina: R$ ");
		 double gasolina = teclado.nextDouble();
		 
		 System.out.print("Preço do álcool: R$ ");
		 double alcool = teclado.nextDouble();
		 
		 System.out.println("");
		 System.out.println("---------------------------------");
		 System.out.println("");
		 
		 double vantagem = gasolina * 0.7;
		 
		 if (vantagem < alcool) {
			 System.out.println("No momento, é mais vantajoso abastecer com GASOLINA.");
		 } else {
			 System.out.println("No momento, é mais vantajoso abastecer com ÁLCOOL.");
		 }

	}

}
