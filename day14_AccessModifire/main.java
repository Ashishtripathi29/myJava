package day14_AccessModifire;

class Empollyee{
    private int id;
    private String name;
    private int sallary;
    private String post;
    private String CompanyName;
    private String city;

    public void createNewId(int id, String name,String post,int sallary,String CompanyName,String city){
        this.id=id;
        this.name=name;
        this.sallary=sallary;
        this.post=post;
        this.CompanyName=CompanyName;
        this.city=city;
    }

    public String getAccount(){
        return String.format("id:%d\nname:%s\nsallary:%d\npost:%s\nCompanyName:%s\ncity:%s",
                                    this.id,this.name,this.sallary,this.post,this.CompanyName,this.city);
    }




}

public class main {
    public static void main(String[] args) {
        
        // create object of Empollyee;
        Empollyee ashish=new Empollyee();
        // ashish.id=5;                                  // raise error because of private key 
        // System.out.println(ashish.id);

        ashish.createNewId(1, "TripathiJi", "Software Developer", 500000, "TAS", "Prayagraj");
        System.out.println(ashish.getAccount());
    }
    
}
