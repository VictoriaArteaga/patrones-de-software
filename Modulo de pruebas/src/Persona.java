public class Persona {

    private String name = "Sofia";
    private int age = 25;

    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
