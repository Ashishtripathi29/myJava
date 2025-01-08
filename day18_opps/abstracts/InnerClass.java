package day18_opps.abstracts;

public class InnerClass {
    public static void main(String[] args) {
        wagnor obj2 = new wagnor();
        obj2.drive();
        wagnor.wagnor2 obj3 = obj2.new wagnor2();
        obj3.superBreak();

    }

}
