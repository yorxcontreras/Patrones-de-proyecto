public class consumidor_contratos {

    public static void main(String[] args) {
        consumidor operador = new consumidor();
        contrato_compra_venda c = new contrato_compra_venda();
        contrato_prestacao_servico s = new contrato_prestacao_servico();

        c.mercadoria = "alcool";
        operador.processar(c);
    }
    
}
