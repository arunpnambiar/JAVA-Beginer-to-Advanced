import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String checker = null;
        do {
            System.out.println("enter something...");
            checkType(scan.next());
        }while(checker == null);
    }
    static void checkType(Object obj){
        System.out.println(obj);
        if(obj instanceof Byte){
            System.out.println("It is a byte data type: range from -128 to 127");
        }else if(obj instanceof Short){
            System.out.println("It is a short data type: range from -32768 to 32767");
        }else if(obj instanceof Integer){
            System.out.println("It is a Integer data type: range from -32768 to 32767");
        }
    }
}
