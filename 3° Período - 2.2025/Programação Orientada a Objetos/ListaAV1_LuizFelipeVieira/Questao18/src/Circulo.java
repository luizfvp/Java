public class Circulo {
    
    public double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularAreaC() {
        return Math.PI * raio * raio;
    }


    public double calcularPerimetroC() {
        return 2 * Math.PI * raio;
    }

}
