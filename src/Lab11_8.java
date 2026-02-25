/*class Fullname {
    private String firstname;
    private String lastname;

    public void setName (String firstname,String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String display() {
        return firstname + " " + lastname;
    }
}
class Customer {
    private int id;
    private Fullname name;
    private String tel;

    public void setId (int id) {
        this.id = id;
    }
    public void setName (Fullname name) {
        this.name = name;
    }
    public void setTelephone (String tel) {
        this.tel = tel;
    }

    public void display() {
        System.out.println(id + " " + name.display() + " " + tel);
    }
}
class Employee {
    private int id;
    private Fullname name;
    private double salary;

    public void setId (int id) {
        this.id = id;
    }
    public void setName (Fullname name) {
        this.name = name;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public void display() {
        System.out.println(id + " " + name.display() + " " + salary);
    }
}

public class Lab11_8 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Customer c1 = new Customer();
        Fullname f1 = new Fullname();
        Fullname f2 = new Fullname();

        f1.setName("Jane","Smith");
        f2.setName("Robert","Peterson");

        c1.setName(f1);
        c1.setId(101);
        c1.setTelephone("0879208767");

        e1.setName(f2);
        e1.setId(111);
        e1.setSalary(20000);

        c1.display();
        e1.display();
    }
}*/