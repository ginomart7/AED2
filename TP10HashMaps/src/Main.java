import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // punto 1
        HashMap<String,Integer> alumnosEdades = new HashMap<String,Integer>();

        alumnosEdades.put("gino",21);
        alumnosEdades.put("agustin",31);
        alumnosEdades.put("pedro",17);
        alumnosEdades.put("juan",52);
        alumnosEdades.put("andres",13);

        System.out.println(alumnosEdades);

        alumnosEdades.put("gino",22);
        System.out.println("lista actualizada: ");
        System.out.println(alumnosEdades);

        alumnosEdades.remove("gino");
        System.out.println("lista actualizada sin gino: ");
        System.out.println(alumnosEdades);

        System.out.println("ingrese el nombre del alumno que quiere verificar si existe: ");
        String estaAlu = in.next();

        if(alumnosEdades.containsKey(estaAlu)){
            System.out.println("esta en el hash");
        }else{
            System.out.println("no esta en el hash");
        }
        int cantAlum = alumnosEdades.size();
        System.out.println("cantidad de alumnos almacenados: " + cantAlum);


        //punto 2


        String [] array = {"java", "hashmap", "java", "map", "hashmap", "java"};
        HashMap<String,Integer> resultado = contarFrecuencias(array);

        System.out.println(resultado);


        //punto 3
        RegistroAsistencia registro = new RegistroAsistencia();

        registro.registrarAsistencia("gino", true);
        registro.registrarAsistencia("matias", false);
        registro.registrarAsistencia("julian", true);
        registro.registrarAsistencia("agustin", false);

        registro.mostrarAsistencia();

        registro.obtenerPresentes();

        registro.obtenerAusentes();



    }//fin main

    public static HashMap<String, Integer> contarFrecuencias(String[] arrayPalabras) {
        HashMap<String,Integer> frecuencias = new HashMap<>();
        for(String palabra : arrayPalabras){
            if(frecuencias.containsKey(palabra)){
                frecuencias.put(palabra,frecuencias.get(palabra)+1);
            }else{
                frecuencias.put(palabra,1);
            }
        }
        return frecuencias;
    }//fin metodo contarFrecuencias
}//fin class