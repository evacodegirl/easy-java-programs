public class StringManipulation {
    public static void main(String[] args) {
        String paralelogram = "paralelogram";
        String substr2 = paralelogram.substring(4, 10);
        System.out.println(substr2);

        String cutString = "mary had a little lamb";
        String newString = cutString.replace(" had a", "");
        System.out.println(newString);

        String characterIndex = "SpringBoot";
        char result = characterIndex.charAt(4);
        System.out.println(result);

        String firstString = "Java";
        String secondString = "Java";
        System.out.println(firstString.compareTo(secondString)); //It will return 0 if they are equal;

        String lowerUpperCase = "My name is Helena";
        System.out.println(lowerUpperCase.toUpperCase());
        System.out.println(lowerUpperCase.toLowerCase());
    }
}