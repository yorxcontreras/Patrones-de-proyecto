public class cuadrado implements figurageometrica {

    public String NomeFigura;
    public int lado;

    @Override
    public String getNomeFigura() {
        return this.NomeFigura;
    }

    @Override
    public int getarea() {
        return this.lado*this.lado;
    }

    @Override
    public int getperimetro() {
        return this.lado * 4;
    }
}
