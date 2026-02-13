//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animals animal1 = Animals.getAnimal();
        Animals animal2 = Animals.getAnimal();

        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);
    }
}