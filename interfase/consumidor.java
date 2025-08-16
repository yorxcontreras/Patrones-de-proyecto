public class consumidor {
    public static void main(String[] args) {
        cuadrado c = new cuadrado();
        c.NomeFigura = "Cuadrado Azul";
        c.lado = 2;

        triangulo t = new triangulo();
        t.nomeFigura = "Triangulo alvi verde";
        t.altura=6;
        t.base=4;
        t.ladoA=3;
        t.ladoB=3;
        t.ladoC=3;

        deseista deseista = new deseista();
        deseista.desenhar(t);
        System.out.println("-----");
        deseista.desenhar(c);

    }
}
