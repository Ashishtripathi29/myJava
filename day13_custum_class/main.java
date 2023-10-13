package day13_custum_class;

class Empolyee {
    int id;
    String name;
    int sallary;
    int age;
    String gender;

    public void printDetails() {
        System.out.println("empolyee id : " + id);
        System.out.println("name : " + name);
        System.out.println("sallary : " + sallary);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("starting our custum class in java\n");

        // make object of the empolyee class
        Empolyee aman = new Empolyee();
        aman.id = 1;
        aman.name = "aman";
        aman.sallary = 12000;
        aman.age = 18;
        aman.gender = "male";
        aman.printDetails();
        System.out.println("\n");

        // now starting to create array of data
        String empollyData[][] = { { "1", "tunnu", "50000", "25", "male" }, { "2", "munnu", "25000", "20", "male" },{ "3", "aman", "12000", "34", "male" } };

        for (String[] data : empollyData) {
            
                Empolyee emp = new Empolyee();
                emp.id = Integer.parseInt(data[0]);
                emp.name = data[1];
                emp.sallary = Integer.parseInt(data[2]);
                emp.age = Integer.parseInt(data[3]);
                emp.gender = data[4];
                emp.printDetails();
                System.out.println("\n");
            
        }
    }
}
