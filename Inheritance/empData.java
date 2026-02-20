package Inheritance;
class Person {
    private String name;
    private int age;
    public void setName(String nm){
        name = nm;
    }
    public void setAge(int ag){
        age = ag;
    }
    public String getName(){
        return(name);
    }
    public int getAge(){
        return(age);
    }
}
class Employee extends Person {
    private String empID;
    public void setempID(String id){
        empID = id;
    }
    public String getempID(){
        return(empID);
    }
}
public class empData {
    public static void main(String[] args) {
        Employee edata = new Employee();
        edata.setName("Prabin Yadav");
        edata.setAge(21);
        edata.setempID("EMP001");
        System.out.println("Employee Name: " + edata.getName());
        System.out.println("Employee Age: " + edata.getAge());
        System.out.println("Employee ID: " + edata.getempID());
    }
}