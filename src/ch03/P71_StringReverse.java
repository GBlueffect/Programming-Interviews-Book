package ch03;

public class P71_StringReverse {

    public static void main(String[] args) {
        StringReverseF("String123");
        StringReverseFBook("String123");

    }
    
    // 라이브러리 함수를 쓰지 않고 문자열을 뒤집는 함수를 만들어라.
    private static void StringReverseF(String originString) {

        int lastIndex = originString.length();
        char originStringArray[] = originString.toCharArray(); 
        String reverseString = "";
        
        for(int i = 0; i < lastIndex; i++) {
            reverseString += originStringArray[lastIndex -1 -i];
        }
        
        System.out.println(reverseString);
    }
    
    // 책 해답
    private static void StringReverseFBook(String originString) {

        String out = "";
        for(int i= originString.length()-1; i >=0 ; --i) {
            out += originString.charAt(i);
        }
        System.out.println(out);
    }

}
