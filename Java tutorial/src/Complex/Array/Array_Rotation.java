package Complex.Array;

public class Array_Rotation {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		//Rotation of the above array by 2 will make array
		int n=10, m=0; 
		int[] tmpArr = new int[n];
		for(int i=0; i<intArr.length; i++){
			if(i<n){
				tmpArr[i]=intArr[i];
			}else{
				intArr[m]=intArr[i];
				m++;
			}
		}
		
		m=0;
		for(int j=intArr.length - tmpArr.length; j<intArr.length; j++){
			intArr[j] = tmpArr[m];
			m++;
		}
		
		for(int tmp : intArr){
			System.out.print(tmp+" ");
		}
		
	}

}
