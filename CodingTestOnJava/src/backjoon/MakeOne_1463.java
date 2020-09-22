/**
 * Backjoon - 1463. 1로 만들기
 * MakeOne_1463.java
 * @date 2020-09-22
 * @author hansolKim
 **/

package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeOne_1463 {

	private static int[] memory;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		memory = new int[N+1];
		
		System.out.println(makeOne(N));
		
	}

	private static int makeOne(int n) {
		if(n == 1) { return 0; }
		if(memory[n] > 0) {
			return memory[n];
		}
		memory[n] = makeOne(n-1) + 1;
		if(n%3 == 0) {memory[n] = Math.min(memory[n], makeOne(n/3) + 1);}
		if(n%2 == 0) {memory[n] = Math.min(memory[n], makeOne(n/2) + 1);}
		return memory[n];
	}

}
