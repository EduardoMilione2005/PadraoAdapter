package com.pagamento.adapter;

public class Main {

    public static void main(String[] args) {

        Pagamento paypal =
                new PayPalAdapter(new PayPalAPI());

        Pagamento mercadoPago =
                new MercadoPagoAdapter(new MercadoPagoAPI());

        paypal.realizarPagamento(150.00);

        mercadoPago.realizarPagamento(250.00);
    }
}