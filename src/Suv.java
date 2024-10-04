public class Suv extends Car {
    @Override
    public void printPrice() {
        System.out.println("SUV Price");
    }

    @Override
    public String getModel() {
        return super.getModel() + "(SUV Model)";
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
