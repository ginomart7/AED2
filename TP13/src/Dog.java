// subclase dog
public class Dog extends Animal {
    public Dog(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro esta ladrando");
    }

    public void correr() {
        System.out.println("El perro esta corriendo");
    }
}