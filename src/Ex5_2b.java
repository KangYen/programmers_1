public class Ex5_2b {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex5_2b a = new Ex5_2b();
        System.out.println(a.solution(new String[]{"Kim", "kang"}));
    }
}
