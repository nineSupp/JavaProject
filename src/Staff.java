/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.2.3: Staff.java
 *
 * ==================================================================================
 * Instruction: Implement class Staff.java with the these attributes.
 * ==================================================================================
 */


public class Staff extends Person{
    private String school;
    private double pay;

    public Staff() {
        super("", "");
        this.school = "";
        this.pay = 0.0;
        System.out.println("Invoke Staff(String name, String address, String school, double pay)");
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
        System.out.println("Invoke Staff(String name, String address, String school, double pay)");
    }

    public String getSchool() { return this.school; }

    public double getPay() { return this.pay; }

    public void setSchool(String school) { this.school = school; }

    public void setPay(double pay) { this.pay = pay; }

    @Override
    public String toString() {
        return String.format("Staff[%s, school=%s, pay=%s]", super.toString(), school, pay);
    }
}
