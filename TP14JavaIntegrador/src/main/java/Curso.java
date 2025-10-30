import java.util.ArrayList;

public class Curso {
    // Atributos
    private int codigo;
    private String nombre;
    private Profesor profesorTitular;
    private ArrayList<Estudiante> estudiantes;

    // Constructores
    public Curso(int codigo, String nombre, Profesor profesorTitular, ArrayList<Estudiante> estudiantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesorTitular = profesorTitular;
        if (estudiantes != null) {
            this.estudiantes = estudiantes;
        } else {
            this.estudiantes = new ArrayList<Estudiante>();
        }
    }

    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesorTitular = null;
        this.estudiantes = new ArrayList<Estudiante>();
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos
    public void asignarProfesor(Profesor p) {
        this.profesorTitular = p;
    }

    public void agregarEstudiante(Estudiante e) {
        if (this.estudiantes == null) {
            this.estudiantes = new ArrayList<Estudiante>();
        }

        boolean repetido = false;

        for (Estudiante est : estudiantes) {
            if (est.getDni() == e.getDni()) {
                repetido = true;
            }
        }

        if (!repetido) {
            estudiantes.add(e);
        } else {
            System.out.println("no se permiten alumnos repetidos.");
        }
    }

    public void buscarEstudiantePorDni(int dni){
        for(Estudiante e : estudiantes){
            if(e.getDni()==dni){
                System.out.println("alumno: "+ e.getNombre() +" nombre del curso: " + nombre + " dni: " + dni);
            }
        }
    }

    public void mostrarCursoCompleto() {
        System.out.println("Curso: " + codigo + " - " + nombre);

        if (profesorTitular != null) {
            System.out.println("Profesor titular:");
            profesorTitular.mostrarInfo();
        } else {
            System.out.println("Profesor titular: [sin asignar]");
        }

        System.out.println("Estudiantes inscriptos:");

        if (estudiantes.isEmpty()) {
            System.out.println("(sin estudiantes)");
        } else {
            for (Estudiante e : estudiantes) {
                e.mostrarInfo();
            }
        }
    }

}//fin class
