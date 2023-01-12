public class Main {
    public static void main(String[] args) {
        // Print person.
        Person person1 = new Person("Jane Doe", "555-555-5555", "jane.doe@example.com");

        System.out.println("Person Name: " + person1.getName());
        System.out.println("Phone Number: " + person1.getPhoneNumber());
        System.out.println("Email Address: " + person1.getEmailAddress());

        // Print professor.
        Professor professor1 = new Professor("John Smith", "555-555-5556", "john.smith@example.com", 80000, 123456, 15, 2);
        System.out.println("Professor Name: " + professor1.getName());
        System.out.println("Phone Number: " + professor1.getPhoneNumber());
        System.out.println("Email Address: " + professor1.getEmailAddress());
        System.out.println("Salary: " + professor1.getSalary());
        System.out.println("Staff Number: " + professor1.getStaffNumber());
        System.out.println("Years of Service: " + professor1.getYearsOfService());
        System.out.println("Number of Classes: " + professor1.getNumberOfClasses());


        // Students
        Student student1 = new Student("Mike Brown", "555-555-5557", "mike.brown@example.com", 123456, 85);
        Student student2 = new Student("Emily Davis", "555-555-5558", "emily.davis@example.com", 123457, 90);
        Student student3 = new Student("David Wilson", "555-555-5559", "david.wilson@example.com", 123458, 95);

        System.out.println("Name: " + student1.getName());
        System.out.println("Phone Number: " + student1.getPhoneNumber());
        System.out.println("Email Address: " + student1.getEmailAddress());
        System.out.println("Student Number: " + student1.getStudentNumber());
        System.out.println("Average Mark: " + student1.getAverageMark());

        System.out.println("Name: " + student2.getName());
        System.out.println("Phone Number: " + student2.getPhoneNumber());
        System.out.println("Email Address: " + student2.getEmailAddress());
        System.out.println("Student Number: " + student2.getStudentNumber());
        System.out.println("Average Mark: " + student2.getAverageMark());

        System.out.println("Name: " + student3.getName());
        System.out.println("Phone Number: " + student3.getPhoneNumber());
        System.out.println("Email Address: " + student3.getEmailAddress());
        System.out.println("Student Number: " + student3.getStudentNumber());
        System.out.println("Average Mark: " + student3.getAverageMark());
    }
}

