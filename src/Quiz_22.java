import java.util.Scanner;

public class Quiz_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String �迭�� 5���� ģ���̸��� Ű����κ��� �Է¹޾� �����ϰ�,
		//¦������ �л��̸��� ȭ�鿡 ����Ͻÿ�.
		String student[] = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.print("ģ���̸��� �Է��ϼ���: ");
		
		for(int i = 0; i < student.length; i++) {
			student[i] = scan.next();
			if(i%2 == 1) {
				System.out.println("¦����° �л��̸�: " + student[i]);
			}
		}
		
	}

}
