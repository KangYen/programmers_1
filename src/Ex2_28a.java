public class Ex2_28a {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);

        if(Math.pow(x,2)==n) {
            return (long)Math.pow(x+1, 2);
        }else return  -1;
    }

    public static void main(String[] args) {
        Ex2_28a a = new Ex2_28a();
        System.out.println(a.solution(121));
    }
}
