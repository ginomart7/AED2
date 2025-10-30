public class Profesor extends Persona{
    String especialidad;
    String antiguedad;
    public Profesor(String especialidad, String antiguedad, int dni, String nombre) {
        super(dni, nombre);
        this.especialidad = especialidad;
        this.antiguedad = antiguedad;
    }

    public Profesor(int dni, String nombre) {
        super(dni, nombre);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("nombre: " + this.getNombre() + " dni: " + this.getDni());
        System.out.println("especialidad: " + especialidad + " antiguedad: " + antiguedad);
    }
}//fin clase
