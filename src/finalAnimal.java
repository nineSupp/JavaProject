public class finalAnimal {
    private String name;

    public finalAnimal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Animal: Animal[name=%s]", this.name);
    }
}
