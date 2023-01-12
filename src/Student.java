public class Student extends Person {
    private int studentNumber;
    private int averageMark;
    private int seminarsTaken = 0;

    public Student(String name, String phoneNumber, String emailAddress, int studentNumber, int averageMark) {
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll(String course) {
        // implementation to check if student is eligible to enroll in the course
        System.out.println(this.getName()+" is eligible to enroll in "+course);
        return true;
    }

    public int getSeminarsTaken() {
        return seminarsTaken;
    }

    public void attendSeminar() {
        this.seminarsTaken += 1;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }
}
