public class TestPerson {
    public static void main(String[] args) {

        Person p = new Person("Alex Morgan", 1989);
        Student s = new Student("Mary Johnson", 2003, "Computer Science");
        Instructor i = new Instructor("Dr. Smith", 1975, 85000);

        System.out.println("=== Testing Person, Student, and Instructor Classes ===");
        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(i.toString());
        System.out.println("=== End of Test ===");
    }
}