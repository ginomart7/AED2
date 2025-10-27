// subclase fish
public class Fish extends Animal {
    public Fish(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez hace burbujas");
    }

    public void nadar() {
        System.out.println("El pez esta nadando");
    }
}