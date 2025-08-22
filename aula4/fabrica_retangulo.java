public class fabrica_retangulo implements Ifabrica {

    @Override
    public Iforma criar() {
        return  new retangulo();
    }
    
}
