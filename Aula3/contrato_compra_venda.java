public class contrato_compra_venda extends  contrato{

    public String mercadoria;

    @Override 
    public boolean Salvar(){
        return !this.mercadoria.equals("alcool");
    }
    
}
