import java.util.Scanner;

public class Quiz_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7���� �������� �Է¹޾�, �迭�� �ְ� 
		//����������, �ִ밪, �ּҰ��� ����Ͻÿ�.
		int num[] = new int[7];
		int max = num[0];
		int min = num[0];
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 7���� �Է��ϼ���: ");
		for(int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
			if(i == 0) {
				min = num[i];
			}
			if(max < num[i]) {
				max = num[i];
			}else if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.print("���������� : ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}

}
