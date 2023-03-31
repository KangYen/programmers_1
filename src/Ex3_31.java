public class Ex3_31 {
     public boolean solution(int x) {
         int mox = x;
         int sum = 0;
         while (x!=0) {

             sum += x%10;
             x /= 10;
         }
         return mox%sum == 0 ? true : false;
     }

    public static void main(String[] args) {
        Ex3_31 T = new Ex3_31();
        System.out.println(T.solution(11));
    }
}

