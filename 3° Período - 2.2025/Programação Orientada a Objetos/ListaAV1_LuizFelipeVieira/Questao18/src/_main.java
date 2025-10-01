public class _main {
    public static void main(String[] args) {
        
        Circulo c = new Circulo(10);
        
        Double areaC = c.calcularAreaC();
        
        System.out.printf("\nA área do circulo é: %.2f", areaC);
        
        double perimetroC = c.calcularPerimetroC();
        
        System.out.printf("\nO perímetro do circulo é: %.2f", perimetroC);

        
        Retangulo r = new Retangulo(10.0,20.0);

        double areaR = r.calcularAreaR();
        
        System.out.printf("\nA área do retângulo é: %.2f", areaR);
        
        double perimetroR = r.calcularPerimetroR();
        
        System.out.printf("\nO perímetro do retângulo é: %.2f", perimetroR);

    }
}
