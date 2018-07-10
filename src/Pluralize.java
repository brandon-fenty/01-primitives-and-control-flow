public class Pluralize {
    public static void main(String[] args) {
        // Pseudo Tests
        pluralize(2, "dog");
        pluralize(1, "cat");
        pluralize(0, "cow");
    }

    public static void pluralize(int animalCount, String animalType) {

        if (animalCount == 0 || animalCount >= 2) {
            System.out.println("I own " + animalCount + " " + animalType + "'s.");
        } else {
            System.out.println("I own " + animalCount + " " + animalType + ".");
        }
    }
}
