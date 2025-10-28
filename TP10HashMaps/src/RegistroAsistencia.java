import java.util.HashMap;
public class RegistroAsistencia {
    private HashMap<String,Boolean> asistencia = new HashMap<String,Boolean>();

    public void registrarAsistencia(String alumno, Boolean presente){
        asistencia.put(alumno,presente);
    }

    public void mostrarAsistencia(){
        System.out.println("registro de asistencia: ");
        for(String alumno : asistencia.keySet()){
            String estado;
            if(asistencia.get(alumno)==true){
                estado = "presente";
            }else{
                estado ="ausente";
            }
            System.out.println(alumno + "," + estado);
        }
    }

    public void obtenerPresentes() {
        System.out.println("alumnos presentes: ");
        for (String alumno : asistencia.keySet()) {
            if (asistencia.get(alumno) == true) {
                System.out.println(alumno);
            }
        }
    }

    public void obtenerAusentes() {
        System.out.println("alumnos ausentes: ");
        for (String alumno : asistencia.keySet()) {
            if (asistencia.get(alumno) == false) {
                System.out.println(alumno);
            }
        }
    }


}
