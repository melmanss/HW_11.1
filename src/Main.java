
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        System.out.println();
        System.out.println();

        Person person4 = new Person("Alice", 28, "Архітектор");
        person4.displayInfo();

        person4.setProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        person4.displayInfo();
    }
}
