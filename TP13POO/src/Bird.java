// subclase bird
public class Bird extends Animal {
    public Bird(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro esta cantando");
    }

    public void volar() {
        System.out.println("El pajaro esta cantando");
    }
}