public class Animals {
    private static Animals animal;

    private Animals() {
        System.out.println("Create of instance");
    }

    public static Animals getAnimal() {
        if (animal == null) {
            animal = new Animals();
        }
        return animal;
    }


}
