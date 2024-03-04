class StringTest {
    public static void main(String[] args) {
        String str = "     ja @v    $  a      ";
        String str1 = str.trim();
        System.out.println(str1);
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
        String str3 = str.replaceAll("[^a-zA-z]",""); //java
        System.out.println(str3.toUpperCase());
        String str4 = "programming";
        System.out.println(str3.concat(str4));
        String str5 = "java programming";
        System.out.println(str3.compareTo(str5));

    }
}