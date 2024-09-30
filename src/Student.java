/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.2.2: Student.java
 *
 * ==================================================================================
 * Instruction: Implement class Student.java with the these attributes
 * ==================================================================================
 */


public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student() {
        super("", "");
        this.program = "";
        this.year = 0;
        this.fee = 0.0;
        System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
        System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }

    public String getProgram() { return this.program; }

    public int getYear() { return this.year; }

    public double getFee() { return this.fee; }

    public void setProgram(String program) { this.program = program; }

    public void setYear(int year) { this.year = year; }

    public void setFee(double fee) { this.fee = fee; }

    @Override
    public String toString() {
        return String.format("Student[%s, program=%s, year=%d, fee=%f]",
                super.toString(), program, year, fee);
    }
}
