
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Crear nueva figura");
            System.out.println("4. Calcular área y perímetro de una figura");
            System.out.println("5. Mover figura");
            System.out.println("6. Dibujar figura");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del estudiante: ");
                    String nombre = scanner.next();
                    System.out.print("Número de identificación: ");
                    int id = scanner.nextInt();
                    System.out.print("Calificación: ");
                    double calificacion = scanner.nextDouble();
                    escuela.agregarEstudiante(new Estudiante(nombre, id, calificacion));
                }

                case 2 -> {
                    System.out.print("Número de identificación del estudiante a buscar: ");
                    int buscarId = scanner.nextInt();
                    Estudiante estudiante = escuela.buscarEstudiante(buscarId);
                    if (estudiante != null) {
                        System.out.println("Estudiante: " + estudiante.getNombre() + ", Calificación: " + estudiante.getCalificacion());
                    }
                }

                case 3 -> {
                    System.out.println("Elija la figura a crear:");
                    System.out.println("1. Círculo");
                    System.out.println("2. Rectángulo");
                    System.out.println("3. Triángulo");
                    int figura = scanner.nextInt();
                    switch (figura) {
                        case 1 -> {
                            System.out.print("Radio del círculo: ");
                            double radio = scanner.nextDouble();
                            Circulo circulo = new Circulo(radio);
                            circulo.dibujar();
                        }

                        case 2 -> {
                            System.out.print("Base del rectángulo: ");
                            double base = scanner.nextDouble();
                            System.out.print("Altura del rectángulo: ");
                            double altura = scanner.nextDouble();
                            Rectangulo rectangulo = new Rectangulo(base, altura);
                            rectangulo.dibujar();
                        }

                        case 3 -> {
                            System.out.print("Base del triángulo: ");
                            double baseTriangulo = scanner.nextDouble();
                            System.out.print("Altura del triángulo: ");
                            double alturaTriangulo = scanner.nextDouble();
                            Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                            triangulo.dibujar();
                        }

                        default ->
                            System.out.println("Opción no válida.");
                    }
                }

                case 4 ->
                    System.out.println("Funcionalidad de cálculo de área y perímetro aún no implementada.");

                case 5 ->
                    System.out.println("Funcionalidad de mover figura aún no implementada.");

                case 6 ->
                    System.out.println("Funcionalidad de dibujar figura aún no implementada.");

                case 7 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                }

                default ->
                    System.out.println("Opción no válida.");
            }
        }
    }
}
