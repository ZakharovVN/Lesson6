public class Cat {
    private String name;
    private String color;
    private int age;

    Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    String voice() {
        return "meow";
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + age;
    }
}
