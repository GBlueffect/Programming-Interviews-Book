package ch03;

public class P70_FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz();
        FizzBuzzByBook();
    }
    
    /**
    1에서 100까지 숫자를 출력하는 프로그램을 만들어라. 
    숫자가 3으로 나누어 떨어지면 그 숫자 대신 Fizz를. 
    5로 나누어 떨어지면 그 숫자 대신 Buzz를, 3과 5 모두로 나누어떨어지면 그 숫자 대신 FizzBuzz를 출력한다.
    **/
    private static void FizzBuzz() {
        
        for(int i=1; i <=100; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
        
        
    }
    
    // 책에서 제공하는 답
    private static void FizzBuzzByBook() {
        
        for(int i=1; i <=100; ++i) {
            boolean divByTree = ( i % 3 == 0);
            boolean divByFive = ( i % 5 == 0);
            if( divByTree && divByFive) System.out.println("FizzBuzz");
            else if(divByTree) System.out.println("Fizz");
            else if(divByFive) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

}
