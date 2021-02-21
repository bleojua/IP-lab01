public abstract class Bird implements Animal {

    protected String group;
    protected String name;
    protected String outerCovering;
    protected String species;
    protected String food;

    public Bird(){
        this.group = "Birds";
        this.name = "BirdName";
        this.outerCovering = "Feathers and scales";
        this.species = "Unknown species";
        this.food = "something";
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getOuterCovering(){
        return this.outerCovering;
    }

    public String getGroup(){
        return this.group;
    }

    public String getSpecies(){
        return this.species;
    }

    public void move(){
        System.out.println("This bird flies.");
    }

    public void move(int speed){
        System.out.println("This bird flies " + speed + " km/h");
    }

    public void eat() {
        System.out.println("This bird eats " + food + ".");
    }
}
