public class finalMammal extends finalAnimal{
    public finalMammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Mammal: Mammal[%s]", super.toString());
    }
}
