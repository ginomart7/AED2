public class Tester {
    public static void main(String[] args) {
        Veterinaria Animalia = new Veterinaria();
        Animal perro = new Dog("Noah", 5);
        Animal gato = new Cat("Atun", 3);
        Animal pajaro = new Bird("Rio", 4);
        Animal pez = new Fish("Nemo",10);

        Animalia.agregarAnimal(perro);
        Animalia.agregarAnimal(gato);
        Animalia.agregarAnimal(pajaro);
        Animalia.agregarAnimal(pez);

        Animalia.mostrarAnimales();




    }
}
