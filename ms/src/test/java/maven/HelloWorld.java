package maven;

public class HelloWorld {
    public static void main(String[] args) {
		int[] arr = new int[]{8,2,1,7,0,3};
		int[] index = new int[] {2,5,4,5,3,1,5,2,3,0,2};
		String tel="";
		for (int i : index) {tel += arr[i];	}
		   System.out.println("联系方式:"+tel);
	}
}
