import java.util.ArrayList;

interface Animal {

    public default String getName(){
        return "Animal";
    }

    public default String getOuterCovering(){
        return "This animal's outer covering.";
    }

    public default String getGroup(){
        return "Animal's group.";
    }

    public default String getSpecies(){
        return "Animal's species.";
    }

    public default void move(){
        System.out.println("This animal moves somehow.");
    }

    public default void eat() {
        System.out.println("This animal eats something.");
    }

    public default void describeAnimal(){
        System.out.println("\n Animal's description: \n");
        System.out.println("Name: " + this.getName() );
        System.out.println("Group: " + this.getGroup() );
        System.out.println("Species: " + this.getSpecies() );
        System.out.println("Outer covering: " + this.getOuterCovering());
        this.eat();
        this.move();
        System.out.println("\n");
    }

}
