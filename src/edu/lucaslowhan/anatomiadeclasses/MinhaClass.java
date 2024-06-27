package edu.lucaslowhan.anatomiadeclasses;

import java.util.Scanner;

public class MinhaClass {
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Olá, digite o primeiro numero:");
        num1 = s.nextInt();
        System.out.println("Olá, digite o segundo numero:");
        num2 = s.nextInt();
        soma = somar(num1,num2);
        System.out.println("A soma dos dois numeros é " + soma);
        }


}
