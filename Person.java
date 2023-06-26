public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int salary;

    public Person(String name, int age, int s) {
        this.name = name;
        this.age = age;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person other) {
        // Compare by age
        return Integer.compare(salary, other.salary);
    }
}