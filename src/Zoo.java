import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {

    public int animalsCount;
    public String zooName;
    public ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal a)
    {
        animals.add(a);
        this.animalsCount++;
    }

    public Zoo(){
        this.zooName = "Zoo";
    }

    public Zoo(String zooName){
        this.zooName = zooName;
    }

    public void makeParade(){

        System.out.println( "\n\n" + this.zooName + " has " + this.animalsCount + " animals:");
        Iterator itr = animals.iterator();
        while( itr.hasNext() ){
            Animal animal = (Animal) itr.next();
            animal.describeAnimal();
        }
    }

    public static void main(String args[]){

        Zoo zoo1 = new Zoo("UAIC's Zoo");
        Animal animal1 = new Fox("Frankie");
        Animal animal2 = new Fox();
        Animal animal3 = new Fox("Max");
        Animal animal4 = new Fox("Foxy");

        zoo1.addAnimal(animal1);
        zoo1.addAnimal(animal2);
        zoo1.addAnimal(animal3);
        zoo1.addAnimal(animal4);

        zoo1.addAnimal(new Fox("Jimmy", "Pizza"));
        zoo1.addAnimal(new Owl("Owlybowly", "hot-dog"));

        zoo1.makeParade();
    }
}
