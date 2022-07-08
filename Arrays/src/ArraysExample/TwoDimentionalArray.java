package ArraysExample;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int [] [] arry = new int[3][3];
		int count =10;
		for(int i=0;i<arry.length;i++) {
			for(int j =0;j<arry.length;j++) {
				arry[i][j]=count;
				count=count+10;
			}
		}
		for(int i =0;i<arry.length;i++) {
			for(int j=0;j<arry[i].length;j++) {
				System.out.print(arry[i][j]+" ");
			}
			System.out.println();
				
		}
		
	}

}
