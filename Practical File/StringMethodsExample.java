class StringMethodsExample {
    public static void main(String[] args) {
        // Using equals() method
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));

        // Using trim() method
        String str4 = "   Hello World   ";
        String trimmedStr = str4.trim();
        System.out.println("Original string: " + str4);
        System.out.println("Trimmed string: " + trimmedStr);

        // Using length() method
        String str5 = "Hello";
        System.out.println("Length of str5: " + str5.length());

        // Using substring() method
        String str6 = "Hello World";
        String substr1 = str6.substring(6);
        String substr2 = str6.substring(0, 5);
        System.out.println("Substring from index 6: " + substr1);
        System.out.println("Substring from index 0 to 4: " + substr2);

        // Using compareTo() method
        String str7 = "apple";
        String str8 = "banana";
        String str9 = "apple";

        System.out.println("str7.compareTo(str8): " + str7.compareTo(str8));
        System.out.println("str7.compareTo(str9): " + str7.compareTo(str9));
    }
}
