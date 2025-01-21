package week03;

public class Week03 {
    public static void main(String[] args) {
        String str1 = "Hi";
        String str2 = "Hi"; 
        if(str1 == str2) {
            System.out.println("same 1");
        }else {
            System.out.println("different 1");
        }

        String str3 = new String("Hi");
        String str4 = new String("Hi");
        if(str3 == str4) {
            System.out.println("same 2");
        } else {
            System.out.println("different 2");
        }
    }

}
