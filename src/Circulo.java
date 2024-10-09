
public class Circulo extends Figura implements Movible, Dibujable {

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        System.out.println("Círculo movido horizontalmente " + distancia + " unidades.");
    }

    @Override
    public void moverVerticalmente(int distancia) {
        System.out.println("Círculo movido verticalmente " + distancia + " unidades.");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }

    @Override
    public void rotable() {
        System.out.println("Rotando el círculo.");
    }
}
