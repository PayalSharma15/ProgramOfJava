class MyEmployee{
    //string name;
    int id;
    String name ;
    int age;
    double salary;


    public void printDetails(){
        System.out.println("My ID is : " + id);
        System.out.println("and my name is : " + name);
        System.out.println(" , my age is : " + age );
        System.out.println(" and salary is : " + salary);
    }
    public double getsalary() {
        return salary;
    }
}

public class OwnClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        MyEmployee amit = new MyEmployee();
        MyEmployee rohan = new MyEmployee();
        //1
        amit.id = 24;
        amit.name = "Amit johar";
        amit.age=45;
        amit.salary= 20000;
        //2
        rohan.id = 25;
        rohan.salary=15000;
        rohan.name = "Rohan johar";
        //print details
        amit.printDetails();
        rohan.printDetails();
        double salary = amit.getsalary();
    }
}
