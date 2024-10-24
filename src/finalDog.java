public class finalDog extends finalMammal{
    public finalDog(String name) {
        super(name);
        this.greets();
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(finalDog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return String.format("Dog: Dog[%s]", super.toString());
    }
}
