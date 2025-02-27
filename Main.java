import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner in = new Scanner(System.in);

        System.out.println("напишите факультет: ");
        String department = in.nextLine();

        System.out.println("Напишите год поступления: ");
        int entranceYear = in.nextInt();

        students[0] = new Student("Александр Васильевич Котов", "01.12.1999", "Улица Лермонтова, г. Пенза", "+79411234567", "1", "Физика");
        students[1] = new Student("Ольга Дмитриевна Петрова", "15.06.2011", "Улица Красная, г. Пенза", "+7951)9876543", "2", "История искусства");
        students[2] = new Student("Сергей Иванович Орлов", "05.05.2005", "Улица Советская, г. Пенза", "+79624567890", "3", "Математика");

        System.out.println("Перечень всех студентов:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println("Студенты факультета: " + department);
        for (Student student : students) {
            if (student.getDepartment().equals(department)) {
                System.out.println(student.getName());
            }
        }

        System.out.println("Студенты, поступившие после " + entranceYear + " года:");
        for (Student student : students) {
            int year = Integer.parseInt(student.getEnrollmentDate().substring(6));  // Извлекаем год из строки
            if (year > entranceYear) {
                System.out.println(student.getName());
            }
        }
    }
}

class Student {
    private String name;
    private String enrollmentDate;
    private String address;
    private String phoneNumber;
    private String course;
    private String department;

    public Student(String name, String enrollmentDate, String address, String phoneNumber, String course, String department) {
        this.name = name;
        this.enrollmentDate = enrollmentDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phoneNumber;
    }

    public void setPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return this.department;
    }
}
