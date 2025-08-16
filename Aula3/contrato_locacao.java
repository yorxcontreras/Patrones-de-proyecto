public class contrato_locacao extends contrato{
    public double valor;

    @Override
    public boolean Salvar(){
        return this.situacao.equals("ativo");
    }

}
