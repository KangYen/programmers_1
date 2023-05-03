import java.util.Arrays;

/*서울에서 김서방 찾기*/
class Ex5_2a {
    public String solution(String[] seoul) {

        int index = Arrays.asList(seoul).indexOf("kim");
        return "김서방은 " + index + "에 있다";
    }

    public static void main(String[] args) {
        Ex5_2a a = new Ex5_2a();
        System.out.println(a.solution(new String[]{"kang", "lee", "kim", "park"}));
    }
}
