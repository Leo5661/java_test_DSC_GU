import java.io.*;
import java.util.*;

public class Solution  {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int k = 0; k < n; k++) {
			int m = in.nextInt();
			int flavourIndex = in.nextInt();
			int array[] = new int[flavourIndex];
			for (int j = 0; j < flavourIndex; j++) {
				array[j] = in.nextInt();
			}
			for(int j = 0 ; j < flavourIndex; j++){
				for(int i = j+1 ; i< flavourIndex ; i++){
					if(array[j]+array[i]==m) System.out.println((j+1)+" "+(i+1));
				}
			}
		}

	}
}