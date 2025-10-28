import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // punto 1
        HashSet<String> nombres = new HashSet<String>();
        nombres.add("gino");
        nombres.add("matias");
        nombres.add("gino");
        nombres.add("julian");
        nombres.add("agustin");

        for(String i : nombres){
            System.out.println(i);
        }
        System.out.println("ingresa el nombre a buscar:");
        String nombreABuscar = in.next();
        if(nombres.contains(nombreABuscar)){
            System.out.println("se encuentra");
        }else{
            System.out.println("no se encuentra");
        }

        System.out.println("ingresa el nombre a eliminar:");
        String nombreAEliminar = in.next();
        if (nombres.contains(nombreAEliminar)){
            nombres.remove(nombreAEliminar);
            System.out.println("se elimino " + nombreAEliminar);
            for(String i : nombres) {
                System.out.println(i);
            }
        }else{
            System.out.println("no se pudo eliminar");
        }

        System.out.println("tamaño actual del set: " + nombres.size());
        //punto 2
        HashSet<String> nombres = new HashSet<String>();
        nombres.add("gino");
        nombres.add("matias");
        nombres.add("gino");
        nombres.add("julian");
        nombres.add("agustin");

        System.out.println("---HashSet---");

        for(String i : nombres){
            System.out.println(i);
        }

        ArrayList<String> nombresAL = new ArrayList<String>();
        nombresAL.add("gino");
        nombresAL.add("matias");
        nombresAL.add("gino");
        nombresAL.add("julian");
        nombresAL.add("agustin");

        System.out.println("---ArrayList---");

        for(String i : nombresAL){
            System.out.println(i);
        }
        //punto 3
        HashSet<String> correosEstudiantes = new HashSet<String>();
        String ingresar;
        do{
            System.out.println("ingrese el correo del estudiante. Para finalizar escriba 'fin'.");
            ingresar = in.next();
            correosEstudiantes.add(ingresar);
        }
        while(!ingresar.equalsIgnoreCase("fin"));
        correosEstudiantes.remove("fin");

        System.out.println("lista de correos: ");
        for(String i : correosEstudiantes){
            System.out.println(i);
        }

        HashSet<Integer> randomNums = new HashSet<Integer>();
        Random random = new Random();

        while (randomNums.size()<10) {
            int num = random.nextInt(20)+1;
            randomNums.add(num);
        }

        for(Integer i : randomNums){
            System.out.println(i);
        }

        if(randomNums.contains(7)){
            System.out.println("contiene el numero 7.");
        }else{
            System.out.println("no contiene el numero 7.");
        }
        // punto 4
        HashSet<String> cursoA = new HashSet<String>();
        HashSet<String> cursoB = new HashSet<String>();

        cursoA.add("Ana");
        cursoA.add("Juan");
        cursoA.add("Pedro");

        cursoB.add("Pedro");
        cursoB.add("Lucia");
        cursoB.add("Ana");

        System.out.println("curso A: " + cursoA);
        System.out.println("curso B: " + cursoB);

        Set<String> union = new HashSet<>(cursoA);
        union.addAll(cursoB);
        System.out.println("union: "+ union);

        Set<String> interseccion = new HashSet<>(cursoA);
        interseccion.retainAll(cursoB);
        System.out.println("interseccion: " + interseccion);

        Set<String> soloA = new HashSet<>(cursoA);
        soloA.removeAll(cursoB);
        System.out.println("solo A: " + soloA);

        // punto 5
        HashSet<String> registroVisitas = new HashSet<>();
        String nombre;

        do {
            System.out.println("ingrese su nombre. Escribi 'fin' para terminar: ");
            nombre = in.nextLine();

            if (!nombre.equalsIgnoreCase("fin")) {
                if (registroVisitas.contains(nombre)) {
                    System.out.println("Este visitante ya fue registrado.");
                } else {
                    registroVisitas.add(nombre);
                    System.out.println("Visitante registrado correctamente.");
                }
            }

        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println("lista de visitantes unicos:");
        for (String i : registroVisitas) {
            System.out.println(i);
        }

        HashSet<String> matsLabo = new HashSet<String>();
        System.out.println("--- menu ---");
        int opcion;
        do{
            System.out.println("--- ingrese la opcion que desee: ---");
            System.out.println("1 • Agregar un elemento al conjunto.");
            System.out.println("2 • Eliminar un elemento.");
            System.out.println("3 • Listar elementos.");
            System.out.println("4 • Verificar si existe un elemento.");
            System.out.println("0 • Salir. ");
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
               case 1:
                    System.out.println("ingrese el elemento a agregar: ");
                    String newElem = in.nextLine();
                    matsLabo.add(newElem);
                    System.out.println("agregado correctamente.");
                    break;
               case 2:
                   System.out.println("ingrese el elemento a eliminar: ");
                   String delElem = in.nextLine();
                   if (matsLabo.contains(delElem)){
                       matsLabo.remove(delElem);
                       System.out.println(delElem + " fue eliminado correctamente.");
                   }else{
                       System.out.println(delElem + " no se encuentra disponible para eliminar");
                   }
                   break;
               case 3:
                   System.out.println("lista de elementos de laboratorio: ");
                   for(String i : matsLabo){
                       System.out.println(i);
                   }
                   break;
               case 4:
                   System.out.println("ingrese el elemento que desea verificar que existe: ");
                   String exisElem = in.nextLine();
                   if(matsLabo.contains(exisElem)){
                       System.out.println(exisElem + " existe.");
                   }else{
                       System.out.println(exisElem + " no existe.");
                   }
                   break;
               case 0:
                   System.out.println("saliendo");
                   break;
            }//fin switch
        }while(opcion!=0);
    }//fin main
}//fin class