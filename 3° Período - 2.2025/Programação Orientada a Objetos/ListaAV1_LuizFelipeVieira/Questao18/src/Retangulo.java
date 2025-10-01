public class Retangulo {
    
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaR() {
        return base * altura;
    }

    public double calcularPerimetroR() {
        return (base + altura) * 2;
    }
    
}
