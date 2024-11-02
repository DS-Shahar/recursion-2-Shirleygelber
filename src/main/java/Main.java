package arrayRecursion;

public class Main {
	
	public static void main(String[]args) {
		
	int [] arr = {1,2,3,4,5,6,7,8,9};
	
	int sum = ex14(4, arr);
	System.out.print("sum: " + sum);
	
	int countP = ex15(8, arr);
	System.out.print(" countP: " + countP);
	
	int index = ex16(0, 4, arr);
	System.out.print(" index: " + index);
	
	boolean isRisesSerious = ex17(0, arr);
	System.out.print(" isRisesSerious: " + isRisesSerious);
	
	boolean isNotPrime = ex18(0, arr);
	System.out.print(" isNotPrime: " + isNotPrime);
	
	}
	
	
	public static int ex14(int i, int [] arr) {
		if(i==0) {
			return arr[i];
		}
			return arr[i] + ex14(i-1, arr);
	}
	
	
	public static int ex15(int i, int [] arr) {
		if (i==0) {
			if(arr[i]%2==0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		if(arr[i]%2!=0) {
			return ex15(i-1, arr);
		}
		return 1+ ex15(i-1, arr);
	}
	
	
	public static int ex16(int n, int i, int [] arr) {
		if(n==arr.length) {
			if(arr[n]==i) {
				return n;
			}
			return -1;
		}
		if(arr[n]!=i) {
			n+=1;
			return ex16(n, i, arr);
		}
		return n;
	}
	
	
	public static boolean ex17(int i, int [] arr) {
		if(i==arr.length-1) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
			return true;
		}
		if(arr[i]<=arr[i+1]) {
			i+=1;
			return ex17(i, arr);
		}
		return false;
	}
	
	public static boolean isPrime(int i, int divisor) {
		if(divisor >= i) {
			return true;
		}
		if(i%divisor==0) {
			return false;
		}
		divisor+=1;
		return isPrime(i, divisor);
	}
	
	
	public static boolean ex18(int i, int [] arr) {
		int divisor =2;
		if(i==arr.length-1) {
			if(isPrime(arr[i], divisor)==true) {
				return false;
			}
			return true;
		}
		if(isPrime(arr[i], divisor)==false) {
			return(ex18(i+1, arr));
		}
		return false;
	}
}
