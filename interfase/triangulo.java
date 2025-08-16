public class triangulo implements figurageometrica{
    public String nomeFigura;
    public int base;
    public int altura;
    public int ladoA;
    public int ladoB;
    public int ladoC;

    @Override
    public String getNomeFigura() {
        return  this.nomeFigura;
    }
    @Override
    public int getarea() {
        return (this.altura*this.base)/2;
    }
    @Override
    public int getperimetro() {
        return this.ladoA+this.ladoB+this.ladoC;
    }
    
}
