package test.com.pagamento.adapter;

import com.pagamento.adapter.Pagamento;
import com.pagamento.adapter.PayPalAPI;
import com.pagamento.adapter.PayPalAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalAdapterTest {

    @Test
    void deveRealizarPagamentoViaPayPal() {

        PayPalAPI api = new PayPalAPI();
        Pagamento pagamento = new PayPalAdapter(api);

        assertTrue(pagamento.realizarPagamento(100.0));
    }
}