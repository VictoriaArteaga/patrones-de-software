public class Animals {
    private static Animals instance;

    private Animals() {
        System.out.println("Create of instance");
    }

    public static Animals getAnimal() {
        if (instance == null) {
            instance = new Animals();
        }
        return instance;
    }


}
