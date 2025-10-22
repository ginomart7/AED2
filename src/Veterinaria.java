import java.util.ArrayList;
public class Veterinaria {
    private ArrayList<Animal> animales;

    public Veterinaria(){
        animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal a){
        animales.add(a);
    }

    public void mostrarAnimales(){
        for (Animal a : animales){
            a.mostrarInfo();
            a.hacerSonido();
            System.out.println();
       }
    }
}
