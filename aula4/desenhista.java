public class desenhista {

    public void desenhar(Ifabrica fabrica){
        // fabrica.criar().desenhar();
        Iforma forma = fabrica.criar();
        forma.desenhar();
    }
    
}
