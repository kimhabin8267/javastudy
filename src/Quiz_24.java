import java.util.Scanner;

public class Quiz_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//n��° ���� �Է� : 100, 100��° ���� ��� 1,2,2,3,3,3,4,4,4,4,5,5,5,5,5... 
//		int num = 0;
//		int count = 0;
//		int total = 0;
//		Scanner scan = new Scanner(System.in);
//		int i = 0; 
//		while(num < total) {
//			System.out.print("n��° ���� ���� �Է��ϼ���: ");
//			num = scan.nextInt();
//			i++;
//			while(i <= count) {
//				total++;
//				
//			}
//		}
//		System.out.println("")

		int count = 0;//���
		int total = 0; //�հ�
		int number = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.print("n��° ���� �Է�: ");
		int limit = sc.nextInt();//limit = �Է��ϴ� ��
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
		
		System.out.println(limit + "��° ������ ���� " + number + "�Դϴ�.");
	}

}
