package ch03;

import java.util.Stack;

public class P74_NestingBracket {

    public static void main(String[] args) {

        System.out.println(nestingBracket("(1+2)*("));
        System.out.println(nestingBracket("(1+2)*(3+3)"));
        System.out.println(nestingBracket("(1+2)*(3+3))"));
        System.out.println(nestingBracket("((1+2)*(3+3))"));
        System.out.println(nestingBracket("(((1+2)*(3+3))"));
        
    }
    
    /*
     * Q) 왼쪽과 오른쪽 괄호 문자가 포함된 문자열이 주어졌다. 
     * 괄호가 제대로 중첩되어 있는지 판단하는 코드를 작성하라. 
     * 예를 들어 (()) 와 ()()에서는 괄호가 제대로 중첩돼 있지만 (()() 나 )( 에서는 그렇지 않다.
     */
    /*
     * 주요 로직 : stack 에 왼괄호를 저장하고 오른 괄호가 나올 경우 이전에 저장한 괄효를 체크하여 판단
     */
    private static boolean nestingBracket(String sample) {
        Stack<Character> bracket = new Stack<>();
        
        boolean returnVal = true;
        for(char item : sample.toCharArray()) {
            if(item == '(' ) {
                bracket.add(item);
            }else if(item == ')' ) {
                
                if(bracket.isEmpty()) {
                    returnVal = false;
                    break;
                }
                
                if((char)bracket.pop() != '(') {
                    returnVal = false;
                    break;
                }
            }
        }
        
        if(!bracket.isEmpty()) returnVal = false;
        
        return returnVal;
    }
    
    /* 책의 답
     * 로직 : 괄호의 개수를 가지고 카운터 
     */
    private static boolean checkNesting(String s) {
        int count = 0;
        
        for(int i=0; i <s.length(); ++i) {
            char ch = s.charAt(i);
            if( ch == '(') ++count;
            else if(ch == ')') {
                --count;
                if(count < 0 ) return false;
            }
        }
        
        return count ==0;
    }
}
