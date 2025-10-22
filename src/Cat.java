// subclase cat
public class Cat extends Animal {
    public Cat(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato esta maullando");
    }

    public void araniar() {
        System.out.println("El perro esta araniando");
    }
}
