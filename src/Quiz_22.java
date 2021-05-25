import java.util.Scanner;

public class Quiz_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 배열에 5명의 친구이름을 키보드로부터 입력받아 저장하고,
		//짝수번쨰 학생이름만 화면에 출력하시오.
		String student[] = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("친구이름을 입력하세요: ");
		
		for(int i = 0; i < student.length; i++) {
			student[i] = scan.next();
			if(i%2 == 1) {
				System.out.println("짝수번째 학생이름: " + student[i]);
			}
		}
		
	}

}
