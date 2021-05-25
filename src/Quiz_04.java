import java.util.Scanner;

public class Quiz_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number;
		int count = 1;
		while(true){
			System.out.println((int)(Math.random()*100) + 1);
			System.out.print("숫자를 입력하세요: ");
			number = scan.nextInt();
			count++;
			if((count == 1)||(count == 2)||(count == 3)||(count == 4)) {
				System.out.println(count + "번 만에 맞추셨습니다 great!");
			}else if((count == 5)||(count == 6)||(count == 7)||(count == 8)) {
				System.out.println(count + "번 만에 맞추셨습니다 good!");
			}else {
			     System.out.println(count + "번 만에 맞추셨습니다 노력하세요");
			}
			
		}

	}

}
