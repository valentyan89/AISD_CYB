import java.util.Scanner;

class StudentForList {
    private final String name; private int age; private int course;

    public StudentForList(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static StudentForList readStudentFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.print("Course: ");
        int course = scanner.nextInt();

        return new StudentForList(name, age, course);
    }

    public void printStudent() {
        System.out.printf("Name - %s\nAge - %d\nCourse - %d\n", name, age, course);
    }
}
