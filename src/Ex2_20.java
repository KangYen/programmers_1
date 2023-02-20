public class Ex2_20 {
    boolean solution(String s) {
       int countP = 0, countY = 0;
       String[] array = s.toLowerCase().split("");

       for(int i = 0; i < array.length; i++) {
           if("p".equals(array[i])) {
               countP++;
           } else if ("y".equals(array[i])) {
               countY++;
           }
       }
       if (countP != countY) {
           return false;
       }
       return true;
    }
}
