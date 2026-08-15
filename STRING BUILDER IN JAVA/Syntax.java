public class Syntax {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Trilok");

        System.out.println(sb);

        // get a character from Index 

        System.out.println(sb.charAt(3));

        // set a character at index

        sb.setCharAt(0, 'p');

        System.out.println(sb);

        // Isert a character at some index

        sb.insert(2, 'd');

        System.out.println(sb);
        
        // delete char at some index

        sb.delete(0, 2);

        System.out.println(sb);

        //append a char

        sb.append("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        System.out.println(sb);

        System.out.println(sb.length());
    }
}