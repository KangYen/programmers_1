public class Ex2_20 {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter(letter ->'P'== letter).count() == s.chars().filter(letter -> 'Y' == letter).count();
    }

    public static void main(String[] args) {
        Ex2_20 a = new Ex2_20();
        boolean b = a.solution("pPpYYydg");
        System.out.println(b);
    }
}
