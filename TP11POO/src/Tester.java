import java.util.ArrayList;
import java.util.Scanner;
public class Tester {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    public static void main(String[] args) {

        /*
        System.out.println("ingrese el legajo del empleado: ");
        int legajo = in.nextInt();

        System.out.println("ingrese las cant de horas del empleado: ");
        int cantHoras = in.nextInt();

        System.out.println("ingrese el valor por hora del empleado: ");
        double valorHora = in.nextDouble();

        Empleado emp = new Empleado(legajo, cantHoras, valorHora);
        System.out.println("legajo: " + emp.getLegajo() + " sueldo: " + emp.obtenerSueldo());

        Empleado emp = new Empleado(legajo);

        emp.setCantHoras(cantHoras);
        emp.setValorHora(valorHora);

        System.out.println("nuevo legajo: " + emp.getLegajo() + " nuevo sueldo: " + emp.obtenerSueldo());

        System.out.println("ingrese cuantos empleados desea cargar: ");
        int cantEmpleados = in.nextInt();
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        for(int i = 0;i<cantEmpleados;i++){
            System.out.println(" ingrese el legajo del empleado: ");
            int legajo = in.nextInt();
            System.out.println(" ingrese la cantidad de horas del empleado: ");
            int cantHoras = in.nextInt();
            System.out.println(" ingrese el valor de hora del empleado: ");
            double valorHora = in.nextDouble();

            Empleado emp = new Empleado(legajo,cantHoras,valorHora);
            listaEmpleados.add(emp);
        }

        System.out.println("lista Empleados: ");
        for (Empleado i : listaEmpleados){
            System.out.println("legajo: " + i.getLegajo() + " sueldo: " + i.obtenerSueldo());
        }
        double totalSueldos = 0;
        for (Empleado i : listaEmpleados){
            totalSueldos+=i.obtenerSueldo();
        }
        System.out.println("total de sueldos a pagar: "+  totalSueldos);
        boolean encontrado = false;
        System.out.println(" ingresar el legajo a buscar: ");
        int nuevoLegajo = in.nextInt();
        for (Empleado i : listaEmpleados){
            if (i.getLegajo() == nuevoLegajo){
                encontrado = true;
                break;
            }
        }// fin for

        if (encontrado) {
            System.out.println("el empleado se encuentra en la lista ");
        }else{
            System.out.println("el empleado no se encuentra en la lista ");
        }

        System.out.println("ingrese el legajo del empleado a modificar: ");
        int legajoModificar = in.nextInt();
        System.out.println("ingrese las nuevas horas trabajadas: ");
        int nuevasHoras = in.nextInt();
        System.out.println( "ingrese el valor por hora nuevos: ");
        double nuevosValores = in.nextDouble();
        Empleado eNuevo = null;
        for(Empleado i : listaEmpleados){
            if(i.getLegajo()==legajoModificar){
               encontrado = true;
               eNuevo = i;
               break;
            }
        }
        if(encontrado){
            eNuevo.setValorHora(nuevosValores);
            eNuevo.setCantHoras(nuevasHoras);
        }else{
            System.out.println("no se ha encontrado el empleado a modificar. ");
        }

        System.out.println("ingrese el legajo del usuario al cual quiere eliminar: ");
        int legajoEliminar = in.nextInt();

        boolean eliminado = false;
        for(Empleado i : listaEmpleados){
            if (i.getLegajo()==legajoEliminar){
                listaEmpleados.remove(i);
                eliminado = true;
                break;
            }
        }
        if (eliminado){
            System.out.println("se ha eliminado correctamente");
        }else{
            System.out.println("no se ha encontrado el legajo.");
        }

        System.out.println("ingrese el legajo del empleado a actualizar: ");
        int legajoActualizarSueldo = in.nextInt();
        System.out.println("ingrese las nuevas horas trabajadas: ");
        int nuevasHorasSueldo = in.nextInt();

        Empleado empleadoActualizar = null;
        for(Empleado i : listaEmpleados){
            if(i.getLegajo()==legajoActualizarSueldo){
                empleadoActualizar = i;
                break;
            }
        }

        if(empleadoActualizar != null){
            empleadoActualizar.setCantHoras(nuevasHorasSueldo);
            System.out.println("nuevo sueldo: " + empleadoActualizar.obtenerSueldo());
        }else{
            System.out.println("no se ha encontrado el empleado a actualizar. ");
        }

        */

        //EJ 4 -- MENU.
        int opcion;
        do{
        System.out.println("ingrese la opcion que desee: ");
        System.out.println("1 • Cargar empleado");
        System.out.println("2 • Listar empleados");
        System.out.println("3 • Buscar empleado por legajo");
        System.out.println("4 • Modificar datos de un empleado");
        System.out.println("5 • Eliminar empleado");
        System.out.println("6 • Mostrar total de sueldos");
        System.out.println("7 • Mostrar el empleado con sueldo más alto");
        System.out.println("8 • Mostrar promedio de sueldos");
        System.out.println("0 • Salir");
        opcion = in.nextInt();
        switch (opcion) {
            case 1: cargarEmpleado(); break;
            case 2: listarEmpleados(); break;
            case 3: buscarEmpleado(); break;
            case 4: modificarEmpleado(); break;
            case 5: eliminarEmpleado(); break;
            case 6: mostrarTotalSueldos(); break;
            case 7: mostrarEmpleadoConSueldoMaximo(); break;
            case 8: mostrarSueldoPromedio(); break;
            case 0: System.out.println("Saliendo "); break;
        }
    } while (opcion != 0);
}//fin main

    //metodo para cargar empleado
    static void cargarEmpleado(){

        System.out.println(" ingrese el legajo del empleado: ");
        int legajo = in.nextInt();
        System.out.println(" ingrese la cantidad de horas del empleado: ");
        int cantHoras = in.nextInt();
        System.out.println(" ingrese el valor de hora del empleado: ");
        double valorHora = in.nextDouble();

        Empleado emp = new Empleado(legajo,cantHoras,valorHora);
        listaEmpleados.add(emp);
    }

    //metodo para listar empleados
    static void listarEmpleados(){
        System.out.println("lista Empleados: ");
        for (Empleado i : listaEmpleados) {
            System.out.println("legajo: " + i.getLegajo() + " sueldo: " + i.obtenerSueldo());
        }
    }

    //metodo para buscar empleado
    static void buscarEmpleado(){
        boolean encontrado = false;
        System.out.println(" ingresar el legajo a buscar: ");
        int nuevoLegajo = in.nextInt();
        for (Empleado i : listaEmpleados){
            if (i.getLegajo() == nuevoLegajo){
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("el empleado se encuentra en la lista ");
        }else{
            System.out.println("el empleado no se encuentra en la lista ");
        }
    }

    //metodo para modificar datos de un empleado (cantidad de horas y valor de horas trabajadas)
    static void modificarEmpleado(){
        boolean encontrado = false;
        System.out.println("ingrese el legajo del empleado a modificar: ");
        int legajoModificar = in.nextInt();
        System.out.println("ingrese las nuevas horas trabajadas: ");
        int nuevasHoras = in.nextInt();
        System.out.println( "ingrese el valor por hora nuevos: ");
        double nuevosValores = in.nextDouble();
        Empleado eNuevo = null;
        for(Empleado i : listaEmpleados){
            if(i.getLegajo()==legajoModificar){
                encontrado = true;
                eNuevo = i;
                break;
            }
        }

        if(encontrado){
            eNuevo.setValorHora(nuevosValores);
            eNuevo.setCantHoras(nuevasHoras);
        }else{
            System.out.println("no se ha encontrado el empleado a modificar. ");
        }
    }

    //metodo para eliminar un empleado
    static void eliminarEmpleado(){
        System.out.println("ingrese el legajo del usuario al cual quiere eliminar: ");
        int legajoEliminar = in.nextInt();

        boolean eliminado = false;

        for(Empleado i : listaEmpleados){
            if (i.getLegajo()==legajoEliminar){
                listaEmpleados.remove(i);
                eliminado = true;
                break;
            }
        }

        if (eliminado){
            System.out.println("se ha eliminado correctamente");
        }else {
            System.out.println("no se ha encontrado el legajo.");
        }

    }

    //metodo para mostrar el total de sueldos a pagar
    static void mostrarTotalSueldos(){
        double totalSueldos = 0;
        for (Empleado i : listaEmpleados){
            totalSueldos+=i.obtenerSueldo();
        }
        System.out.println("total de sueldos a pagar: "+  totalSueldos);
    }

    //metodo para mostrar al empleado con sueldo maximo
    static void mostrarEmpleadoConSueldoMaximo(){

        Empleado maximo = listaEmpleados.getFirst();

        for(Empleado i : listaEmpleados){
            if(i.obtenerSueldo()> maximo.obtenerSueldo()){
                maximo = i;
            }
        }
        System.out.println("el empleado de mayor sueldo es: " + maximo.getLegajo() + " con un sueldo de: " + maximo.obtenerSueldo());
    }

    static void mostrarSueldoPromedio(){
        int totalEmpleados = listaEmpleados.size();
        double totalSueldos = 0;

        for (Empleado i : listaEmpleados){
            totalSueldos+=i.obtenerSueldo();
        }

        double promedio = totalSueldos/totalEmpleados;

        System.out.println("el sueldo promedio de los empleados es de: " + promedio);
    }
}//fin clase