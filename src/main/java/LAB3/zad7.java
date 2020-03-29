package LAB3;
public class zad7 {
    public static void main(String[] args){
        
        String w1 = "Hello";
        String w2 = "World";
        char c1 = ' ';
        char c2 = '!';
        
        String sentence = w1 + c1 + w2 + c2;
        System.out.println(sentence);
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.length());
        System.out.println(sentence.substring(3, 5));
        System.out.println(w1.equals(w2));
        System.out.println(sentence.charAt(6));
        
    }
    
}
