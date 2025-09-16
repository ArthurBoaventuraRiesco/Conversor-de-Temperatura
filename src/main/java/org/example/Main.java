package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("1 - Celsius → Fahrenheit");
        System.out.println("2 - Fahrenheit → Celsius");
        System.out.print("Escolha a opção: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        if (opcao == 1) {
            double resultado = Calculadora.celsiusToFahrenheit(valor);
            System.out.println(valor + " °C = " + resultado + " °F");
        } else if (opcao == 2) {
            double resultado = Calculadora.fahrenheitToCelsius(valor);
            System.out.println(valor + " °F = " + resultado + " °C");
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}



