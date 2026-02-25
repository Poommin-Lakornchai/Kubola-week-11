/*class Fullname {
    private String firstname;
    private String lastname;

    public void setName(String fn,String ln) {
        this.firstname = fn;
        this.lastname = ln;
    }
    public String showName () {
        return firstname + " " + lastname;
    }
}
class Employee {
    private int id;
    private Fullname name;
    private double salary;

    public void setId (int id) {
        this.id = id;
    }
    public int getId () {
        return id;
    }
    public void name (Fullname name) {
        this.name = name;
    }
    public Fullname getName() {
        return name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Customer {
    private int id;
    private Fullname name;
    private String tel;

    public void setId (int id) {
        this.id = id;
    }
    public int getId () {
        return id;
    }
    public void name (Fullname name) {
        this.name = name;
    }
    public Fullname getName() {
        return name;
    }
    public void setTelephone(String tel) {
        this.tel = tel;
    }
    public String getTelephone () {
        return tel;
    }
}
public class Lab11_7 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Customer c1 = new Customer();
        Fullname f1 = new Fullname();
        Fullname f2 = new Fullname();

        f1.setName("Jane","Smith");
        f2.setName("Robert","Peterson");

        e1.name(f2);
        e1.setId(111);
        e1.setSalary(20000);

        c1.name(f1);
        c1.setId(101);
        c1.setTelephone("0879208767");

        System.out.println(c1.getId() + " " + c1.getName().showName() + " " + c1.getTelephone());
        System.out.println(e1.getId() + " " + e1.getName().showName() + " " + e1.getSalary());
    }
}*/




