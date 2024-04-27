package ktra;

public class bai1 {
	public static int F(int n) {
		if (n<=2) {
			return 1;
			
		}else {
			return F(n-2)+F(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F = F(8);
		System.out.println(F);
	}

}
