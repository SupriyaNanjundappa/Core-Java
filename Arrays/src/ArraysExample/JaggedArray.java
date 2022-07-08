package ArraysExample;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] jarry = new int[3][];
		jarry[0] =new int[4];
		jarry[1] = new int[5];
		jarry[2] = new int[6];
		int count =10;
		for(int i =0;i<jarry.length;i++) {
			for(int j=0;j<jarry.length;j++) {
				jarry[i][j]=count;
				count=count+10;
				
			}
		}
		for(int i = 0;i<jarry.length;i++) {
			for(int j=0;j<jarry.length;j++) {
		}
	}

	}
}
