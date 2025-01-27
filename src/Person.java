public class Person {
    private final String name;
    private final int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }
}