package Encapsulation;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Age cannot be negative and zero!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setname("Prabin");
        p.setAge(21);

        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());

        p.setAge(-9);
    }
}
