package com.pagamento.adapter;

public class MercadoPagoAPI {

    public boolean processarTransacao(double valor) {
        System.out.println("Pagamento realizado via Mercado Pago: R$ " + valor);
        return true;
    }
}