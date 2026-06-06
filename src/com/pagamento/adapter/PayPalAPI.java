package com.pagamento.adapter;

public class PayPalAPI {

    public boolean enviarPagamento(double valor) {
        System.out.println("Pagamento realizado via PayPal: R$ " + valor);
        return true;
    }
}