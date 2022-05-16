import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dbaker on 5/16/2022.
 */
public class Login4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        String input1 ="";
        String word1 = "create account";
        String word2 = "CREATE ACCOUNT";
        String word3 = "login";
        String word4 = "LOGIN";
        String input2="";
        String input3="";
        while (true) {
            System.out.println("Would you like to (create account) or (login)?");
            input1 = console.nextLine();
            boolean check = false;
            int i = 0;
            int i2 = 0;
            while(i<input1.length()){
                try {
                    if (input1.charAt(i) == word1.charAt(i) || input1.charAt(i) == word2.charAt(i)) {
                        i2++;
                    }
                }catch (StringIndexOutOfBoundsException ex){

                }
                i++;
            }
            if (i2==i && i!=0 && input1.length()==word1.length()) {
                check = true;
            }
            int i3 = 0;
            int i4 = 0;
            while(i3<input1.length()){
                try {
                    if (input1.charAt(i3) == word3.charAt(i3) || input1.charAt(i3) == word4.charAt(i3)) {
                        i4++;
                    }
                }catch (StringIndexOutOfBoundsException ex){

                }
                i3++;
            }
            if (i4==i3 && i3!=0 && input1.length() == word3.length()) {
                check = true;
            }
            if(!check){
                continue;
            }
            int i5 = 0;
            int i6 = 0;
            while(i5<input1.length()){
                try {
                    if (input1.charAt(i5) == word1.charAt(i5) || input1.charAt(i5) == word2.charAt(i5)) {
                        i6++;
                    }
                }catch (StringIndexOutOfBoundsException ex){

                }
                i5++;
            }
            if (i6==i5 && i5!=0 &&input1.length() == word1.length()) {
                while(true) {
                    System.out.println("Enter Username:");
                    input2 = console.nextLine();
                    System.out.println("Enter Password:");
                    input3 = console.nextLine();
                    int i7 = 0;
                    boolean a = false;
                    while (i7<l1.size()){
                        if(l1.get(i7).equalsIgnoreCase(input2)){
                            a = true;
                            break;
                        }
                        i7++;
                    }
                    if (a){
                        continue;
                    }
                    l1.add(input2);
                    l2.add(input3);
                    break;
                }
            }
            else{
                System.out.println("Enter Username:");
                input2 = console.nextLine();
                System.out.println("Enter Password:");
                input3 = console.nextLine();
                int i8 = 0;
                boolean b = false;
                while (i8<l1.size()){
                    if(l1.get(i8).equalsIgnoreCase(input2)){
                        b = true;
                        break;
                    }
                    i8++;
                }
                if (b){
                    int i9 = 0;
                    boolean c = false;
                    while (i9<l1.size()){
                        if(l2.get(i9).equals(input3) && i9==i8){
                            c = true;
                            break;
                        }
                        i9++;
                    }
                    if(c){
                        System.out.println("welcome, "+input2);
                        System.exit(1);
                    }
                }
                System.out.println("sorry account does not match records");
            }
        }
    }
}