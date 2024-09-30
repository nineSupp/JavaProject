/*
 * (Lab 10)
 * Name: Suppatouch Srinual (Nine)
 * ID: 2420210037
 * L10.2.4: TestRun.java
 *
 * ==================================================================================
 * Instruction: To test the objects of Person, Student, and Staff. Also test for the
 * getter and setter.
 * ==================================================================================
 */


public class TestRun {
    public static void main(String[] args) {
        System.out.println("========================== Staff ============================");
        Staff ck = new Staff("Chanakarn Kingkaew", "85/1 PIM Nonthaburi", "PIM", 1_000_000);
        System.out.println(ck);

        System.out.println();

        System.out.println("========================== Student ============================");
        Student cv = new Student("Kim Taeyeon", "85/1 PIM Nonthaburi", "CPE", 2558, 50000);
        System.out.println(cv);

        System.out.println();

        // Testing getter and setter.
        System.out.println("========================== Student # 2============================");
        Student test1 = new Student();
        test1.setName("Steve Roger");
        test1.setAddress("Avenger Tower");
        test1.setProgram("Kill Thanos 101");
        test1.setYear(2020);
        test1.setFee(200_000_000);
        System.out.println(test1);

        System.out.println();

        System.out.println("========================== Student # 3 ============================");
        Student test2 = new Student("Tom", "TomNJerry Hourse", "How To Catch Jerry 101", 2001
                , 0);
        System.out.println(test2.getName());
        System.out.println(test2.getAddress());
        System.out.println(test2.getProgram());
        System.out.println(test2.getYear());
        System.out.println(test2.getFee());

        System.out.println();

        System.out.println("========================== Person # 1 ============================");
        Person p1 = new Person("Micky Mouse", "Disney World");
        System.out.println(p1.getName());
        System.out.println(p1.getAddress());

        System.out.println();

        System.out.println("========================== Staff # 1.1 ============================");
        System.out.println(ck.getName());
        System.out.println(ck.getAddress());
        System.out.println(ck.getSchool());
        System.out.println(ck.getPay());

        ck.setSchool("TNIC");
        ck.setPay(999_999_999);
        System.out.println(ck);

    }
}
