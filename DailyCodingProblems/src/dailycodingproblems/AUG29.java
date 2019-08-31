package dailycodingproblems;
import java.util.HashSet;
import java.util.Set;

public class AUG29 {
	
	public static boolean solution(int[] arr , int n) {
		Set<Integer> s1 = new HashSet<Integer>();
		
		for (Integer integer : arr) {
			int remaining = n-integer;
			if(s1.contains(remaining)) {
				return true;
			}
			s1.add(integer);
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {10,15,3,2};
		
		boolean ans = solution(arr,13);
		System.out.println(ans);
	}
}