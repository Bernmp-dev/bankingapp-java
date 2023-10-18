package bankingapp;

import java.math.BigDecimal;

public class Validations {

    public static boolean validarNumero(int numero) {
        return Integer.toString(numero).length() >= 4;
    }

    public static boolean validarAgencia(String agencia) {
        return agencia != null && !agencia.trim().isEmpty()
          && agencia.replaceAll("[^0-9]", "").length() >= 4;
    }

    public static boolean validarNomeCliente(String nomeCliente) {
        return nomeCliente != null && !nomeCliente.trim().isEmpty();
    }

    public static boolean validarSaldo(BigDecimal saldo) {
        return saldo != null && saldo.compareTo(BigDecimal.ZERO) >= 0;
    }
}
