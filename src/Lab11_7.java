class Fullname {
    private String firstname;
    private String lastname;

    void getName(String fn,String ln) {
        this.firstname = fn;
        this.lastname = ln;
    }
}
class Employee {
    private int id;
    private Fullname name;
    private double salary;

    void getId (int id) {
        this.id = id;
    }
    void name (Fullname name) {
        this.name = name;
    }
    void getsalary(double salary) {
        this.salary = salary;
    }
    void displayEmployee () {
        System.out.println(this.id+" "+name+" "+this.salary);
    }
}

class Customer {
    private int id;
    private Fullname name;
    private String tel;
}

public class Lab11_7 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Customer c1 = new Customer();
        Fullname f1 = new Fullname();
        Fullname f2 = new Fullname();

        f1.getName("Jane","Smith");
        f2.getName("Robert","Peterson");

        e1.name(f2);
        e1.getId(111);
        e1.getsalary(20000);

        e1.displayEmployee();

        /*c1.id = 101;
        c1.name = f1;
        c1.tel = "0879208767";*/

    }
}




