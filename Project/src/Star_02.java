//?? ????? *****
//    *
//   ***
//  *****
//   ***
//    *
public class Star_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
			if(i >= (4-j)) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}System.out.println(" ");
			}System.out.println(" ");
		}
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 3; j++) {
				if(i < j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println(" ");
	}System.out.println(" ");
	}

}
