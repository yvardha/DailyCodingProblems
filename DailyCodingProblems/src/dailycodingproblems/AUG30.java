package dailycodingproblems;

public class AUG30 {
	
	public static int[] solution(int[] arr,int len) {
		int sol[]= new int[len];
		int temp=1;
		if(len == 1) {
			arr[0]=0;
			return arr;
		}
		else {
			for(int i=0;i<len;i++) {
				sol[i]=1;
			}
			// left array also leftmost element =1
			for(int i=0;i<len;i++) {
				sol[i]=temp;
				temp = temp*arr[i];
			}
			
			temp =1;
			//right array also rightmost element =1
			for(int i=len-1;i>=0;i--) {
				sol[i] = sol[i]*temp;
				temp = temp*arr[i];
			}
		}
		return sol;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5}; 
		int len = arr.length;
		int sol[] = new int[len];
		sol = solution(arr,len);
		for(int i=0;i<sol.length;i++) {
			System.out.println(sol[i]);
		}
	}
}
