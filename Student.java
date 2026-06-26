public class Student extends Person {
    private final String major;

    public Student(String name, int birthYear, String major) {
        super(name, birthYear);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student[name=" + getName() + 
               ", birthYear=" + getBirthYear() + 
               ", major=" + major + "]";
    }
}
