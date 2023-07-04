package com.javapractise.findmissingnum;

public class FindMissNum {

	public static void main(String[] args) {
		
		int arr[]= {1,4,7,6,8,2,3};
		int n=arr.length;
		
		
		findMissingNum(arr,n);

	}

	public static void findMissingNum(int arr[],int n) {
		
		
		int i;
		int[] temp=new int[n+1];
		
		for(i=0;i<=n;i++) {
			
			temp[i]=0;
		//	System.out.print(temp[i]+" ---");
		}
		for( i=0;i<n;i++) {//{1,4,7,6,8,2,3}
			
			temp[arr[i]-1] =1;
			//System.out.print(temp[i]+" ");
		}
		
		int missingNo=0;
		
		for(i=0;i<n;i++) {
			
			if(temp[i]==0)
				missingNo=i+1;//2,3,5
		}
		
		System.out.println(missingNo);
	}
}
