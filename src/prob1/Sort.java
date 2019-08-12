package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		int count2 = 0;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		while(true) {
			for(int j=0; j<count-1; j++) {
				if(array[j+1] > array[j]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			count2++;
			if(count2==(count-1)) {
				break;
			}
		}
		
		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

	}
}