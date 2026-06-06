package com.pagamento.adapter;

public class MercadoPagoAdapter implements Pagamento {

    private final MercadoPagoAPI mercadoPagoAPI;

    public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
        this.mercadoPagoAPI = mercadoPagoAPI;
    }

    @Override
    public boolean realizarPagamento(double valor) {
        return mercadoPagoAPI.processarTransacao(valor);
    }
}