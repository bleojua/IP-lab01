public class Owl extends Bird {

    public Owl() {
        this.name = "OwlName";
        this.outerCovering = "Feather";
        this.species = "Owl";
        this.food = "rodent-like mammals";
    }

    public Owl(String name) {
        this.name = name;
        this.outerCovering = "Feather";
        this.species = "Owl";
        this.food = "rodent-like mammals";
    }

    public Owl(String name, String food) {
        this.name = name;
        this.outerCovering = "Feather";
        this.species = "Owl";
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("This owl flies.");
    }

    public void move(int speed){
        System.out.println("This owl flies " + speed + " km/h");
    }

    public void eat() {
        System.out.println("This owl eats " + this.food + ". ");
    }

}
