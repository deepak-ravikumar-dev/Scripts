import java.util.*;
class VC {
    public static void main(String[] args) {

        String str = "krishita";

        int v = 0, c = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v++;
            } else {
                c++;
            }
        }

        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
