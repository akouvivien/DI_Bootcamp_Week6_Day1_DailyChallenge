public class Person {
    public String name;
    public int age;
    public double salary ;
    //genere un constructeur par defaut
    public Person() {
    }
// classe qui prend trois arguments (nom, âge et salaire) et les affecte aux propriétés correspondantes. 
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // Créez un troisième constructeur qui prend deux arguments (nom et âge) et les affecte aux propriétés correspondantes, définit le salaire sur -1
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary= -1;
        if (this.salary== -1) {
            System.out.println("Salary not provided");
        }
    }
    // méthode displayInfo
    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
    }
    
}