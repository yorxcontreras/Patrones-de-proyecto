public class fabrica_circulo implements Ifabrica {
    
    @Override
    public Iforma criar() {
        return  new circulo();
    }
}
