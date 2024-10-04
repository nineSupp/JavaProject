public class Hatchback extends Car{
    private String model;

    public void printPrice() {
        System.out.println("Hatchback Price");
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Type: %s", this.getModel(), this.getClass().getSimpleName());
    }
}
