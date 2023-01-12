public class Professor extends Person {
    private int salary;
    private int staffNumber;
    private int yearsOfService;
    private int numberOfClasses;

    public Professor(String name, String phoneNumber, String emailAddress, int salary, int staffNumber, int yearsOfService, int numberOfClasses) {
        super(name, phoneNumber, emailAddress);
        this.salary = salary;
        this.staffNumber = staffNumber;
        this.yearsOfService = yearsOfService;
        this.numberOfClasses = numberOfClasses;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        this.staffNumber = staffNumber;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }
    public void addClass() {
        this.numberOfClasses += 1;
    }
}
