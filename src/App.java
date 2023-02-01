public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Person person = new Person();
        Person person1 = new Person("akou",25,2000);
        person.displayInfo();
        person1.displayInfo();
        Person person3 = new Person("akou",25);
        person3.displayInfo();
    }
}
