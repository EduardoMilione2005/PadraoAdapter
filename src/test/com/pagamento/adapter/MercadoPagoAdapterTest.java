package test.com.pagamento.adapter;

import com.pagamento.adapter.MercadoPagoAPI;
import com.pagamento.adapter.MercadoPagoAdapter;
import com.pagamento.adapter.Pagamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoPagoAdapterTest {

    @Test
    void deveRealizarPagamentoViaMercadoPago() {

        MercadoPagoAPI api = new MercadoPagoAPI();
        Pagamento pagamento = new MercadoPagoAdapter(api);

        assertTrue(pagamento.realizarPagamento(200.0));
    }
}