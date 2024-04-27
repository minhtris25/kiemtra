package ktra;

public class ktra2 {
	public static int demChan(int[]arr) {
		   int count = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }
	public static boolean sapXep(int[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] < arr[i - 1]) {
	            return false;
	        }
	    }
	    return true;
	}
	 public static int tu4And12(int[] arr) {
	        int count = 0;
	        for (int num : arr) {
	            if (num >= 4 && num <= 12) {
	                count++;
	            }
	        }
	        return count;
	 }
	 public static int tongPT(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }
	  public static int tongPTle(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            if (num % 2 != 0) {
	                sum += num;
	            }
	        }
	        return sum;
	    }
	 public static void xapXeptangdan(int[] arr) {
		  int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1]) {
	                    // hoán đổi arr[j+1] và arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	
	 public static int giatriLonNhat(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {3, 8, 2, 5, 10, 7, 12, 4, 9, 6};

	        // a. Đếm số lượng phần tử chẵn trong mảng
	        System.out.println("Số lượng phần tử chẵn trong mảng: " + demChan(array));

	        // b. Kiểm tra mảng có được sắp xếp tăng dần hay không
	        System.out.println("Mảng được sắp xếp tăng dần? " + sapXep(array));

	        // c. Đếm số lượng phần tử có giá trị từ 4 đến 12 trong mảng
	        System.out.println("Số lượng phần tử có giá trị từ 4 đến 12: " + tu4And12(array));

	        // d. Tính tổng các phần tử của mảng
	        System.out.println("Tổng các phần tử của mảng: " + tongPT(array));

	        // e. Tính tổng các phần tử có giá trị lẻ
	        System.out.println("Tổng các phần tử có giá trị lẻ: " + tongPTle(array));

	        // f. Sắp xếp tăng dân giải thuật nổi bot
	        xapXeptangdan(array);
	        System.out.println("Mảng đã được sắp xếp tăng dần:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println("");
	        // g. Tìm giá trị lớn nhất trong mảng
	        System.out.println("Giá trị lớn nhất trong mảng là: " + giatriLonNhat(array));
	}

}
