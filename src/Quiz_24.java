import java.util.Scanner;

public class Quiz_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n번째 값을 입력 : 100, 100번째 숫자 출력 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5... 
//		int num = 0;
//		int count = 0;
//		int total = 0;
//		Scanner scan = new Scanner(System.in);
//		int i = 0; 
//		while(num < total) {
//			System.out.print("n번째 수열 값을 입력하세요: ");
//			num = scan.nextInt();
//			i++;
//			while(i <= count) {
//				total++;
//				
//			}
//		}
//		System.out.println("")

		int count = 0;//계산
		int total = 0; //합계
		int number = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.print("n번째 수열 입력: ");
		int limit = sc.nextInt();//limit = 입력하는 수
		while (total < limit) {
			number++;
			count = 1;
			while(count <= number) {
				total++;
				if(total > limit) { 
					break;
				}
				
				System.out.print(number + "\t");
				count++;
				
				if(total % 10 == 0) {
					System.out.println();
				}
			}//end of in while
			
		} //end of out while
		
		System.out.println(limit + "번째 수열의 값은 " + number + "입니다.");
	}

}
