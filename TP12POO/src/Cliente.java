public class Cliente {
    private String nombre;
    private double pagos;

    //constructor
    public Cliente(String nombre, double pagos) {
        this.nombre = nombre;
        this.pagos = pagos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPagos() {
        return pagos;
    }

    //metodos

    public void registrarNuevoPago(double monto){
        pagos+=monto;
    }

    public double actualizarTotalPagos(){
        return pagos;
    }
}
