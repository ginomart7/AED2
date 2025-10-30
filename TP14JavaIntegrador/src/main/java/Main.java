import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ArrayList<Curso> cursos = new ArrayList<Curso>();
    Scanner in = new Scanner(System.in);
    int opcion;

    do{
        System.out.println("=== MENÚ ===");
        System.out.println("1. Crear nuevo curso");
        System.out.println("2. Asignar profesor a un curso");
        System.out.println("3. Inscribir estudiante a un curso");
        System.out.println("4. Buscar estudiante por DNI en todos los cursos");
        System.out.println("5. Mostrar información completa de un curso");
        System.out.println("6. Mostrar listado de todos los cursos");
        System.out.println("0. Salir");
        opcion = in.nextInt();
        in.nextLine();

        switch(opcion){
            case 1:
                System.out.println("ingrese el codigo del curso: ");
                int codigo = in.nextInt();
                in.nextLine();
                System.out.println("ingrese el nombre del curso: ");
                String nomCurso = in.nextLine();
                Curso nuevoCurso = new Curso(codigo,nomCurso);
                cursos.add(nuevoCurso);
                System.out.println("se creo el curso correctamente.");
                break;
            case 2:
                System.out.println("ingrese el codigo del curso al cual quiere asignarle profesor: ");
                int codigoCursoProf = in.nextInt();
                in.nextLine();

                boolean cursoEncontradoProf = false;

                for(Curso c : cursos){
                    if(c.getCodigo()==codigoCursoProf){
                        cursoEncontradoProf = true;

                        System.out.println("ingrese el dni del profesor: ");
                        int dniProf = in.nextInt();
                        in.nextLine();
                        System.out.println("ingrese el nombre del profesor: ");
                        String nombreProf = in.nextLine();

                        Profesor profe = new Profesor(dniProf,nombreProf);

                        c.asignarProfesor(profe);

                        System.out.println("profesor: " + nombreProf + " , asignado correctamente al curso: " + c.getNombre());
                        break;
                    }
                }

                if (!cursoEncontradoProf){
                    System.out.println("no existe un curso con ese codigo.");
                }
                break;
            case 3:
                System.out.println("ingrese el codigo del curso al que quiere ingresar un estudiante: ");
                int codCursoAddEst = in.nextInt();
                in.nextLine();

                boolean cursoEncontradoEst = false;

                for(Curso c : cursos){
                    if(c.getCodigo()==codCursoAddEst){
                        cursoEncontradoEst = true;

                        System.out.println("ingrese el nombre del estudiante: ");
                        String nombEst = in.nextLine();
                        System.out.println("ingrese el dni del estudiante: ");
                        int dniEst  = in.nextInt();
                        in.nextLine();

                        Estudiante est = new Estudiante(dniEst,nombEst);

                        c.agregarEstudiante(est);
                        System.out.println("el estudiante: "+nombEst+" con dni: "+dniEst+ " ha sido añadido correctamente. ");
                        System.out.println("ahora pertenece al curso: " + c.getNombre());
                        break;
                    }
                }

                if(!cursoEncontradoEst){
                    System.out.println("no existe un curso con ese codigo.");
                }
                break;
            case 4:
                System.out.println("ingrese el dni del alumno que desea concocer su curso: ");
                int dniABuscar = in.nextInt();
                in.nextLine();

                for(Curso c : cursos){
                    c.buscarEstudiantePorDni(dniABuscar);
                }
                break;
            case 5:
                System.out.println("ingrese el código del curso a mostrar: ");
                int codigoBuscado = in.nextInt();
                in.nextLine();

                boolean encontrado = false;

                for (Curso c : cursos) {
                    if (c.getCodigo() == codigoBuscado) {
                        c.mostrarCursoCompleto();
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("no existe un curso con ese código.");
                }
            case 6:
                for(Curso c : cursos){
                    System.out.println(c.getNombre());
                }
        }//fin switch
    }while (opcion!=0);
}//fin main
}//fin clase
