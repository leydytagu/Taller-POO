
public class Triangulo extends Figura implements Movible, Dibujable {

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base * 3; // Suponiendo triángulo equilátero para simplificar
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        System.out.println("Triángulo movido horizontalmente " + distancia + " unidades.");
    }

    @Override
    public void moverVerticalmente(int distancia) {
        System.out.println("Triángulo movido verticalmente " + distancia + " unidades.");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }

    @Override
    public void rotable() {
        System.out.println("Rotando el triángulo.");
    }
}
