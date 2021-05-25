import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1, c2, c3;
		c1 = (int)(Math.random()*9) + 1;
		
		do {
			c2 = (int)(Math.random()*9) + 1;
		}while(c1 == c2);
		
		do {
			c3 = (int)(Math.random()*9) + 1;
		}while((c1 == c2)&&(c3 == c2));
		//System.out.println(c1 + " " + c2 + " " + c3);
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int you = 0, you2 = 0, you3 = 0;
		while(true) {
			count++;
			System.out.print("첫번째 정수를 입력하세요: ");
			you = scan.nextInt();
			System.out.print("두번째 정수를 입력하세요: ");
			you2 = scan.nextInt();
			System.out.print("마지막 정수를 입력하세요: ");
			you3 = scan.nextInt();
			if((c1 == you2)||(c1 == you3)||(c2 == you)||(c2 == you3)||(c3 == you)||
				(c3 == you2)) { 
				System.out.println("1B"); 
			}else if((c1 == you2 || c1 == you3)&&(c2 == you || c2 == you3)&&
				(c3 == you || c3 == you2)) { 
				System.out.println("2B");
			}else if((c1 == you2 || c1 == you3)&&(c2 == you || c2 == you3)&&
				(c3 == you || c3 == you2)) {
				System.out.println("3B");
			}else if((c1 == you)||(c2 == you2)||(c3 == you3)) {
				System.out.println("1S");
			}else if((c1 == you && c2 == you2)||(c2 == you2 && c3 == you3)||
					(c1 == you && c3 == you3)) {
				System.out.println("2S");
			}else {
				System.out.println("정답입니다!"); break;
			}
			System.out.println(count + "번 만에 맞추셨습니다!");
		}
	}

}
