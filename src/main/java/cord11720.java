import java.util.Scanner;

public class cord11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //갯수
        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String sNum = sc.next(); //개수만큼 입력받은 값을 String형에 저장
        char[] cNum = sNum.toCharArray(); //char[] 형으로 변환
        int sum = 0;
        for (int i = 0; i < cNum.length; i++){
            sum += cNum[i] - '0'; //정수형으로 변환하면서 더하기
        }
        System.out.print(sum);
    }
}

