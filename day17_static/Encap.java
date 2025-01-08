package day17_static;
class Human {
    private int age;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    
}


public class Encap {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(20);
        obj.setName("Amit");
        System.out.println("Age:"+obj.getAge()+" Name:"+obj.getName());
    }
}
