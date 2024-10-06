public class StringHelper {
    public String substring(String input, int index) {
        String[] newInput = input.split(" ");
        if ( input == null ) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        else if (index < 1) {
            throw new IllegalArgumentException("Index should be 1 or greater");
        }
        else if (input.split(" ").length < index) {
            throw new IllegalArgumentException("Index out of bounds: not enough words");
        }
        return input.substring(index);
    }

    public String reverse(String input) {
        if ( input == null ) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        // 26 Final
    }
}
