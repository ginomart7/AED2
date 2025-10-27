import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Empresa empresa = new Empresa("miEmpresa");

        int opcion;
        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Mostrar info cliente");
            System.out.println("4. Calcular gasto en sueldos");
            System.out.println("5. Aumentar sueldos");
            System.out.println("6. Calcular ingresos de clientes");
            System.out.println("7. Calcular balance");
            System.out.println("8. Registrar pago a cliente");
            System.out.println("0. Salir");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("ingrese el nombre del empleado: ");
                    String nombreE = in.next();
                    System.out.println("ingrese el sueldo del empleado: ");
                    double sueldo = in.nextDouble();
                    empresa.agregarEmpleado(new Empleado(nombreE,sueldo));
                    break;
                case 2:
                    System.out.println("ingrese el nombre del cliente: ");
                    String nombreC = in.next();
                    System.out.println("ingrese el gasto del cliente: ");
                    double pagos = in.nextDouble();

                    empresa.agregarCliente(new Cliente(nombreC,pagos));
                    break;
                case 3:
                    System.out.println("ingrese el nombre del cliente que desea conocer su informacion: ");
                    empresa.mostrarInfoCliente(in.next());
                    break;
                case 4:
                    System.out.println("gasto total en sueldos de empleados: $" + empresa.gastoTotalSueldos());
                    break;
                case 5:
                    System.out.println("ingrese el porcentaje de aumento: ");
                    empresa.aumentarSueldos(in.nextDouble());
                    break;
                case 6:
                    System.out.println("ingresos totales de los clientes: $" + empresa.calcularIngresosClientes());
                    break;
                case 7:
                    System.out.println("balance general de la empresa: $" + empresa.balance());
                    break;
                case 8:
                    System.out.println("nombre del cliente: ");
                    String nombrePago = in.next();
                    System.out.println("monto del pago: ");
                    double monto = in.nextDouble();

                    for (Cliente i : empresa.getClientes()) {
                        if(i.getNombre().equalsIgnoreCase(nombrePago)){
                            i.registrarNuevoPago(monto);
                        }
                    }
                    break;
            }//fin switch
        } while (opcion != 0);
    }//fin main
}//fin class
