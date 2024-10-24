public class finalCat extends finalMammal{
    public finalCat(String name) {
        super(name);
        this.greets();
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return String.format("Cat: Cat[%s]", super.toString());
    }
}
