package ClassRoom_Tasks;

final class Student {

    private final String name;
    private final double mark;

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }

    public Student addBonus(double bonus) {
        return new Student(name, mark + bonus);
    }
}

public class ClassRoom_Task13_ImmutableStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Arun", 80);

        Student s2 = s1.addBonus(5);

        System.out.println("Original Mark: " + s1.getMark());
        System.out.println("New Mark: " + s2.getMark());
    }
}
