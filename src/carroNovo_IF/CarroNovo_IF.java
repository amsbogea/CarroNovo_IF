package carroNovo_IF;

import java.util.Scanner;

public class CarroNovo_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double custoConsumidor, custoFabrica;
		
		System.out.println("Informe o custo de fábrica do carro.");
		custoFabrica = input.nextDouble();
		
		if (custoFabrica <= 12000.00) {
			custoConsumidor = custoFabrica + custoFabrica * 0.05;
			System.out.println("O custo ao consumidor será "+ custoConsumidor);
		}else if (custoFabrica > 12000.00 && custoFabrica <=25000.00) {
			custoConsumidor = custoFabrica + (custoFabrica * 0.1) + (custoFabrica * 0.15);
			System.out.println("O custo ao consumidor será "+ custoConsumidor);
		}else if (custoFabrica > 25000.00) {
			custoConsumidor = custoFabrica + (custoFabrica * 0.15) + (custoFabrica * 0.2);
			System.out.println("O custo ao consumidor será "+ custoConsumidor);
		}
		
		input.close();
	}

}
