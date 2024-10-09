
import java.util.HashSet;
import java.util.Set;

public class Escuela {

    private final Set<Estudiante> estudiantes;

    // Constructor
    public Escuela() {
        estudiantes = new HashSet<>();
    }

    // Método para agregar un estudiante
    public boolean agregarEstudiante(Estudiante estudiante) {
        // Validar que el número de identificación no esté repetido
        for (Estudiante e : estudiantes) {
            if (e.getNumeroIdentificacion() == estudiante.getNumeroIdentificacion()) {
                System.out.println("El estudiante con ID " + estudiante.getNumeroIdentificacion() + " ya existe.");
                return false;
            }
        }
        estudiantes.add(estudiante);
        return true;
    }

    // Método para buscar un estudiante por número de identificación
    public Estudiante buscarEstudiante(int numeroIdentificacion) {
        for (Estudiante e : estudiantes) {
            if (e.getNumeroIdentificacion() == numeroIdentificacion) {
                return e;
            }
        }
        return null;
    }

    // Método para actualizar un estudiante
    public boolean actualizarEstudiante(int numeroIdentificacion, String nuevoNombre, double nuevaCalificacion) {
        Estudiante estudiante = buscarEstudiante(numeroIdentificacion);
        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setCalificacion(nuevaCalificacion);
            return true;
        }
        return false;
    }

    // Método para eliminar un estudiante
    public boolean eliminarEstudiante(int numeroIdentificacion) {
        Estudiante estudiante = buscarEstudiante(numeroIdentificacion);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
            return true;
        }
        return false;
    }

    // Método para mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }
}
