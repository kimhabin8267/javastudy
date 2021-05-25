
public class Study_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이차원 배열 정리
//		int table[][] = new int[3][4];
//		table[0][0] = 10; 
//		table[1][1] = 20; 
//		table[2][2] = table[0][0] + table[1][1];
		
//		System.out.println(table[0][0]);
//		System.out.println(table[1][1]);
//		System.out.println(table[2][2]);
		
//		for(int i = 0; i < table.length; i++) {
//			for(int j = 0; j < table[i].length; j++) {
//				System.out.print(table[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int table[][] = {{1,2}, {3,4,5}, {6,7,8,9},{10,11,12,13,14,15,16,17,18,19,20}};
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}

}
