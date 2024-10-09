
public class Rectangulo extends Figura implements Movible, Dibujable {

    private final double base;
    private final double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        System.out.println("Rectángulo movido horizontalmente " + distancia + " unidades.");
    }

    @Override
    public void moverVerticalmente(int distancia) {
        System.out.println("Rectángulo movido verticalmente " + distancia + " unidades.");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo.");
    }

    @Override
    public void rotable() {
        System.out.println("Rotando el rectángulo.");
    }
}
