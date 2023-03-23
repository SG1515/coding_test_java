import java.util.Scanner;

public class cord1546 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Integer
        int A[] = new int[N]; //A[] < Integer

        for(int i=0; i<A.length; i++){ // N까지도 가능
            A[i] = sc.nextInt(); //배열에 입력
        }

        long sum = 0; //총합
        long max = 0;

        for(int i=0; i<N; i++){
            if (A[i] > max){ //최고 점수
                max = A[i];
            }

            sum += A[i]; //총합
        }

        // 한 과목과 관련된 수식을 총합한 후 관련된 수식으로 변환해 로직이 간단함
        System.out.print(sum * 100.0 / max / N);
    }
}
