package day6_String;
public class main {
    public static void main(String[] args){
        String a=new String("Ashish");
        System.out.println(a.charAt(0));
        int len=a.length();
        System.out.println("the length of stirng is: "+len);
        String uperString=a.toUpperCase();
        System.out.println("the uppper case of string :"+uperString);
        String lowerString=a.toLowerCase();
        System.out.println("the lower case of string :"+lowerString);
        System.out.println(a.indexOf("s"));
        System.out.println(a.indexOf("s",2));
        System.out.println(a.indexOf("s",2));
        System.out.println(a.codePointAt(0));
        System.out.println(a.contains("As"));
        System.out.println(a.codePointCount(1,4));
        System.out.println(a.substring(1,4));
        System.out.println(a.startsWith("sh"));
        System.out.println(a.endsWith("sh"));
        // rest of the method can be google https://www.w3schools.com/java/java_ref_string.asp

    }
}
