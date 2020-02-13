package CS_141.W11.Final;
// Doug Gilchrist - Final - Question 11
public class Q11 {
    public static void main(String[] args) {
        String[] array = {"hidden", "Java SDK", "DDD",
                "parameter", "polymorphism",
                "dictated", "dodged", "cats and dogs"};
        System.out.print(numberOfCharacters(array, 'd'));
    }
    
    public static int numberOfCharacters(String[] array, char letter) {
        int count = 0;
        for (String word: array) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter) count++;
            }
        }
        
        return count;
    }
}
