package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Capturar dados dos usuários
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeUsuario = scanner.next();

        System.out.println("Insira o saldo inicial:");
        Double saldo = scanner.nextDouble();

        //Mensagem retorno

        System.out.println("Olá " + nomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo é " + saldo);

        scanner.close();



        }
}