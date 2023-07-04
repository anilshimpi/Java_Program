
public class FindMissingNo {

	public static void main(String[] args) {
		
		int arr[]= {2,4,5,6,1};
		int n=arr.length;
		
		findMissingNo(arr,n);

	}

	public static void findMissingNo(int arr[],int n) {
		
		int i;
		int temp[]=new int[n+1];
		
		for(i=0;i<=n;i++) {
			
			temp[i]=0;
		}
		for(i=0;i<n;i++) {
			
			temp[arr[i]-1]=1;
		}
		int missingNo=0;
		
		for(i=0;i<n;i++) {
			
			if(temp[i]==0)
				missingNo=i+1;
		}
		System.out.println(missingNo);
	}
}
