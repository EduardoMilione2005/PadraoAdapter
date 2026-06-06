package com.pagamento.adapter;

public class PayPalAdapter implements Pagamento {

    private final PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public boolean realizarPagamento(double valor) {
        return payPalAPI.enviarPagamento(valor);
    }
}