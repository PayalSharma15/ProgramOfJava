class Employee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Employee rohan = new Employee();
        rohan.setName("Rohan johar");
        System.out.println(rohan.getName());
        rohan.setId(45);
        System.out.println(rohan.getId());
    }
}
