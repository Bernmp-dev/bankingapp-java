package bankingapp;

import java.util.Scanner;
import java.math.BigDecimal;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);

    public static int validarNumero() {
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();
        if (!Validations.validarNumero(numero)) {
            System.out.println("Número de conta inválido!");
            return validarNumero();
        }
        return numero;
    }

    public static String validarAgencia() {
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        if (!Validations.validarAgencia(agencia)) {
            System.out.println("Número de agência inválido!");
            return validarAgencia();
        }
        return agencia;
    }

    public static String validarNomeCliente() {
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        if (!Validations.validarNomeCliente(nomeCliente)) {
            System.out.println("Nome de cliente inválido!");
            return validarNomeCliente();
        }
        return nomeCliente.toUpperCase();
    }

    public static BigDecimal validarSaldo() {
        System.out.println("Por favor, digite o saldo inicial:");
        BigDecimal saldo = scanner.nextBigDecimal();
        scanner.nextLine();
        if (!Validations.validarSaldo(saldo)) {
            System.out.println("Saldo inválido!");
            return validarSaldo();
        }
        return saldo;
    }

    public static void exibirMenu() {
        Account account = new Account();

        account.setNumero(validarNumero());
        account.setAgencia(validarAgencia());
        account.setNomeCliente(validarNomeCliente());
        account.setSaldo(validarSaldo());

        String mensagem = String.format(
          "Olá %s, obrigado por criar uma conta em nosso banco," +
            " sua agência é %s, conta %d e seu saldo %s já está disponível para saque.",
          account.getNomeCliente(),
          account.getAgencia(),
          account.getNumero(),
          account.getSaldo().toString()
        );

        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        exibirMenu();
    }
}
