import  java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //punto 1 y 2
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("gino");
        nombres.add("pedro");
        nombres.add("lautaro");
        nombres.add("matias");
        nombres.add("julian");
        for(int i = 0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        System.out.println("ingrese el nombre a buscar: ");
        String nombreABuscar = in.next();
        System.out.println(nombres.contains(nombreABuscar));

        nombres.set(2,"agustin");
        nombres.addFirst("geronimo");
        if(nombres.contains("geronimo")){
            System.out.println("--------------nombres antes de eliminar a geronimo-----------");
            for(int i = 0;i<nombres.size();i++) {
                System.out.println(nombres.get(i));
            }
            nombres.remove("geronimo");
        }
        System.out.println("-----------------nombre geronimo eliminado---------------");
        for(int i = 0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        nombres.remove(1);
        System.out.println("elementos de la lista: " + nombres.size());
        // punto 3
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(1);
        notas.add(4);
        notas.add(7);
        notas.add(9);
        notas.add(3);
        notas.add(2);
        notas.add(9);
        notas.add(8);
        notas.add(4);
        notas.add(10);

        for(int i = 0;i<notas.size();i++){
            System.out.println(notas.get(i));
        }

        double totalNotas = 0;

        for(Integer nota : notas){
            totalNotas+=nota;
        }

        double promedio = totalNotas / notas.size();
        System.out.println("promedio: " + promedio);

        int aprobados = 0;
        for(Integer nota : notas){
            if(nota>6){
                aprobados += 1;
            }
        }
        System.out.println("aprobados: "+ aprobados);
        //punto 4
        ArrayList<String> prodSuper = new ArrayList<String>();
        prodSuper.add("Leche");
        prodSuper.add("Pan");
        prodSuper.add("Azucar");
        prodSuper.add("Fideos");
        prodSuper.add("Yerba");
        System.out.println("productos: ");
        for(String i : prodSuper){
            System.out.println(i);
        }

        prodSuper.removeIf(prods -> prods.charAt(0) == 'A');

        System.out.println("productos con a eliminados: ");
        for(String p : prodSuper){
            System.out.println(p);
        }
        //punto 5
        ArrayList<String> listaTareas = new ArrayList<String>();
        int opcion;
        System.out.println("---------menu administrador de tareas----------");
        do {
            System.out.println("---------seleccione una opcion---------");
            System.out.println("1. agregar tarea");
            System.out.println("2. mostrar tarea");
            System.out.println("3. eliminar tarea");
            System.out.println("4. marcar tarea");
            System.out.println("0. salir");
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion){
            case 1:
                System.out.println("ingrese la tarea");
                String tarea = in.nextLine();
                agregarTarea(tarea,listaTareas);
                break;
            case 2:
                System.out.println("lista de tareas: ");
                mostrarTarea(listaTareas);
                break;
            case 3:
                System.out.println("ingrese el numero de tarea que desea eliminar");
                int numero = in.nextInt();
                eliminarTarea(listaTareas,numero);
                System.out.println("nueva lista de tareas: ");
                mostrarTarea(listaTareas);
                break;
            case 4:
                System.out.println("ingrese el numero de la tarea que desea marcar como finalizada: ");
                int numTarea = in.nextInt() - 1;
                marcarTarea(listaTareas,numTarea);
                mostrarTarea(listaTareas);
                break;
            case 0:
                System.out.println("saliendo");
                break;
            }
        } while (opcion != 0);

    }//fin main
    public static void agregarTarea(String tarea,ArrayList<String> lista){
        lista.add(tarea);
        System.out.println("tarea agregada con exito.");
    }

    public static void mostrarTarea(ArrayList<String> lista){
        int i = 0;
        for(String l : lista){
            i += 1;
            System.out.println(i + "- " + l);
        }
    }

    public static void eliminarTarea (ArrayList<String> lista, int num){
        lista.remove(num-1);
        System.out.println("tarea removida con exito.");
    }

    public static void marcarTarea (ArrayList<String> lista, int num) {
        if (num >= 0 && num < lista.size()) {
            String tareaAMarcar = lista.get(num);
            tareaAMarcar = tareaAMarcar + " ✔";
            lista.set(num,tareaAMarcar);
            System.out.println("tarea marcada como finalizada. ");
        }else{
            System.out.println("numero de tarea invalido");
        }
    }

}//fin class