public class Animal {
    //atributos
    public String nombre;
    public int edad;

    //constructor
    public Animal() {

    }

    public Animal(String nombre, int edad){
        this.nombre= nombre;
        this.edad= edad;
    }

    //metodos
    public void hacerSonido(){
        System.out.println(" el animal hace un sonido ");
    }

    public void mostrarInfo(){
        System.out.println("nombre: " + nombre + " , edad: " + edad);
    }
}// fin clase
