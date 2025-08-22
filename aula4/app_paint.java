public class app_paint {
    public static void main(String[] args) {
        desenhista paint = new desenhista();
        Ifabrica fabrica = new fabrica_circulo();
        paint.desenhar(new fabrica_trianglo());
    }
}
