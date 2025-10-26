public class Empleado {
    //atributos
    private int legajo;
    private int cantHoras;
    private double valorHora;

    //constructores
    public Empleado(int legajo){
        this.legajo=legajo;
    }

    public Empleado(int legajo, int cantHoras, double valorHora){
        this.legajo=legajo;
        this.cantHoras=cantHoras;
        this.valorHora=valorHora;
    }

    //getters
    public int getLegajo() {
        return legajo;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    //setters
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    //metodos
    public double obtenerSueldo(){
        return cantHoras*valorHora;
    }

}//fin clase
