public class Animals {
    private static Animals animal;
    private String name;

    private Animals(String name) {
        this.name = name;
        System.out.println("Create of instance");
    }

    public static Animals getAnimal() {
        if (animal == null) {
            animal = new Animals("");
        }
        return animal;
    }

    public void printAnimal(String name) {
        this.name = name;
        System.out.println("Animal: " + name);
    }


}
