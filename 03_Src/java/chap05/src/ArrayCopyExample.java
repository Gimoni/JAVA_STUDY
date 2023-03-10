import java.util.EnumSet;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// primitive type : 값이 복사
		int num1 = 100;
		int num2 = num1;
		
		// reference type : 참조 복사 , 값 복사..
		String str1 = "Hello";
		String str2 = str1; 	// 참조 복사
		String str3 = new String(str1); // 값 복사 
		
		// reference type Array copy 
		int[] nums1 =  {3, 1, 4, 7, 5}; 	// 값 목록으로 원소 초기화 / 원소의 타입 int [배열] 배열타입명 = {배열의 원소};
		int[] nums2 = new int [100]; 	// 
		
		
		
		for (int i=0; i<nums1.length; i++) {
			nums2 [10+i] = nums1[i];
		}
		
		System.arraycopy(nums1, 0, nums2, 3, 5);		// java의 특성상 array copy 는 1차원 배열만 복사가능 . 
														// 2차원 이상은 for문을 활용해서 배열 복사.
	
		
		for (int i=0; i<nums2.length; i++)				// 전통적인 for 문. / index를 구할 수 있음. 
			System.out.printf("%d,", nums2[i]);
		
		for (int v : nums2)								// 향상된 for 문 : / index를 구할 수 없음. 배열을 읽기만 할 떄...  
			System.out.println(v + ",");
		
	}

}
