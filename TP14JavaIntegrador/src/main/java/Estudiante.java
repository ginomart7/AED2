public class Estudiante extends Persona{
    private String carrera;
    //const
    public Estudiante(String carrera, int dni, String nombre) {
        super(dni, nombre);
        this.carrera = carrera;
    }

    public Estudiante(int dni, String nombre) {
        super(dni, nombre);
    }

    public String getCarrera() {
        return carrera;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("nombre: " + this.getNombre() + " dni: " + this.getDni() + " carrera: " + carrera);
    }
}
