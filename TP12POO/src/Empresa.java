import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    //constructor
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }


    //getters

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //metodos

    public void agregarEmpleado(Empleado emp){
        empleados.add(emp);
    }

    public void agregarCliente(Cliente cli){
        clientes.add(cli);
    }

    public void mostrarInfoCliente(String nomCliente){
        for(Cliente i : clientes){
            if(i.getNombre().equalsIgnoreCase(nomCliente)){
                System.out.println("Cliente: " + i.getNombre() + " Total Pagos: $" + i.getPagos());;
            }else{
                System.out.println("ese nombre no pertenece a ninguno de los clientes");
            }
        }
    }

    public double gastoTotalSueldos(){
        double totalSueldos = 0;
        for(Empleado i : empleados){
            totalSueldos+=i.getSueldo();
        }
        return totalSueldos;
    }

    public void aumentarSueldos(double porcentaje){
        for(Empleado i : empleados){
            double sueldoActual = i.getSueldo();
            double nuevoSueldo = sueldoActual + sueldoActual*(porcentaje/100);
            i.setSueldo(nuevoSueldo);
        }
    }

    public double calcularIngresosClientes(){
        double totalIngresos = 0;
        for(Cliente i : clientes){
            totalIngresos+=i.getPagos();
        }
        return totalIngresos;
    }

    public double balance(){
        return calcularIngresosClientes() - gastoTotalSueldos();
    }


}
