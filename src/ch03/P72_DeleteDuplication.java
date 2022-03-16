package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P72_DeleteDuplication {
    
    public static void main(String[] args) {
        int[] list = {2,5, 11, 1, 85, 23, 52, 1, 5, 25, 55, 1, 1, 1, 85, 55, 55, 55};
        deleteDuplication(list);
        System.out.println(" ");
        deleteDuplicationBook(list);
    }
    
    // 정렬되지 않은 정수 리스트가 주어졌을 때 모든 중복된 값을 제거한 새로운 리스트를 리턴하는 함수를 만들어라.
    static int[] deleteDuplication(int[] list){
        Arrays.sort(list);
        
        for(int item: list) {
            System.out.print(item + " ");
        }
        
        System.out.println(" ");
        
        ArrayList<Integer> resultIntArray = new ArrayList<>();
        resultIntArray.add(list[0]);
        for(int i = 1; i < list.length; i++) {
            if(resultIntArray.get(resultIntArray.size()-1) != list[i]) {
                resultIntArray.add(list[i]);
            }
        }
        
        int[] returnArray = new int[resultIntArray.size()];
        for(int i=0; i < resultIntArray.size(); i++) {
            returnArray[i] = resultIntArray.get(i);
        }
        
        for(int item : returnArray) System.out.print(item + " ");
        System.out.println(" ");
        return returnArray;
    }
    
    /*  ** 책 해답가이드를 보고**
     Map의 특성을 이요해서 list의 값을 Map에 넣는다.
     자동으로 중복 제거가 된다.
     그 후 int[]으로 변환 후 return
     대신 순서는 지켜지지 않는다.
    */
    static int[] deleteDuplicationBook(int[] list){
        HashMap<Integer, Integer> deletedMap = new HashMap<>();
        for(int item: list) deletedMap.put(item, 0);
        System.out.println(deletedMap.toString());
        
        int[] resultInt = new int[deletedMap.size()];
        int i=0;
        
        for(Map.Entry<Integer, Integer> entry : deletedMap.entrySet()) {
            resultInt[i++] = entry.getKey();
        }
        
        for(int item : resultInt) System.out.print(item + " ");
        return resultInt;
    }

}
