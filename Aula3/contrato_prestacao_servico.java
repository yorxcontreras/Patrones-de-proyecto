public class contrato_prestacao_servico extends contrato{
    public String servico_contratado;

    @Override
    public boolean Salvar(){
        System.out.println("Salvamdo contrato de servicio");
        return true;
    }
    
}
