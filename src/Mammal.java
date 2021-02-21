public abstract class Mammal implements Animal{

    protected String group;
    protected String name;
    protected String outerCovering;
    protected String species;
    protected String food;

    public Mammal(){
        this.group = "Mammals";
        this.name = "Mammal";
        this.outerCovering = "Fur / Hair";
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
        System.out.println("This mammal moves somehow.");
    }

    public void move(int speed){
        System.out.println("This mammal moves " + speed + " km/h");
    }

    public void eat() {
        System.out.println("This mammal eats " + food + ".");
    }
}
