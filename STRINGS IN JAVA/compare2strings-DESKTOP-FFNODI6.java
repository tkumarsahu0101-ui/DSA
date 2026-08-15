import java.util.*;

public class compare2strings {

    public static void main(String[] args) {
        

        String names1 = "Trilok";

        String names2 = "Trilok";

        if(names1.equals(names2)){

            System.out.println("They are the same Strings");
        }else{
            System.out.println("They are diff Strings");
        }

        // do not use == check for equlity
        // gives correct answer here

        if(names1 == names2){
             System.out.println("They are the same Strings");

        }else{

             System.out.println("They are diff Strings");
        }

        // gives icorrect answer here

        if(new String(names1) == new String(names2)){

            System.out.println("They are the same Strings");
        }else{

            System.out.println("They are diff Strings");
        }
    }
}