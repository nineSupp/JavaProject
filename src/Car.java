public class Car {
    private String model;

    public void printPrice() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("Model: %s, Type: %s", this.getModel(), this.getClass().getSimpleName());
    }
}

