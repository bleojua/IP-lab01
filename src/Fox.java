public class Fox extends Mammal {

    public Fox() {
        this.name = "FoxName";
        this.outerCovering = "Fur";
        this.species = "Fox";
        this.food = "something";
    }

    public Fox(String name) {
        this.name = name;
        this.outerCovering = "Fur";
        this.species = "Fox";
        this.food = "something";
    }

    public Fox(String name, String food) {
        this.name = name;
        this.outerCovering = "Fur";
        this.species = "Fox";
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("This fox moves using it's paws.");
    }

    public void move(int speed){
        System.out.println("This fox moves " + speed + " km/h");
    }

    public void eat() {
        if(!this.food.equals("something"))
            System.out.println("This fox eats " + this.food + ". " );
        else
            System.out.println("This fox is omnivore. ");
    }

}
