package day13_practice;

class Employee {
    int sallary;
    String name;

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public int setSallary(int sallary) {
        this.sallary = sallary;
        return this.sallary;
    }

    public String getName() {
        return name;
    }

    public int getSallary() {
        return sallary;
    }
}


class cellphone{
    public void ringging(){
        System.out.println("phone is ringing...");
    }
    public void vabratting(){
        System.out.println("phone is vibratting...");
    }

    public void setAlarm(){
        System.out.println("alarm is setup");
    }

    public void calling(){
        System.out.println("calling to ankit...");
    }

    public void message(){
        System.out.println("messasing to ankuj...");
    }
}

public class main {
    public static void main(String[] args) {

        //  create object of employee and call the object 
        Employee em = new Employee();
        em.setName("ashish");
        String name=em.getName();
        System.out.println(name);

        em.setSallary(50000);
        int sallary=em.getSallary();
        System.out.println(sallary);

        // create the object of cellphone and call the object
        cellphone phone=new cellphone();
        phone.calling();
        phone.vabratting();
        phone.message();
        phone.ringging();
        phone.setAlarm();
    }

}
