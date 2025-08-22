public class fabrica_trianglo implements Ifabrica {

    @Override
    public Iforma criar() {
        return  new triangulo();
    }
    
}
