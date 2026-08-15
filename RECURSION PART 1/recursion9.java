class recursion9 {
    static String reverseString(String str) {
        // Base case - empty string या single character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        // Recursive case
        // First char को last में डालो + बाकी string को recursively reverse करो
        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        
        return reverseString(remaining) + firstChar;
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));  // olleh
        System.out.println(reverseString("java"));   // avaj
        System.out.println(reverseString("12345"));  // 54321
        System.out.println(reverseString("A"));      // A
        System.out.println(reverseString(""));       // ""
    }
}