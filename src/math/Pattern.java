package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32
		 * 
		 */
		/*int count=0;
		for (int i=100;i>; i--){
			if (i=)
			System.out.print(i+",");

	}
		for(int j=90;j>68;j--){
			if(j%2==0){System.out.print(j+",");}
		}
			for(int n=70;n>32;n--){
				n= n-3;
				System.out.print(n+",");
			}*/
		int count=0;
		int num=100;
		int decrement=1;
		while(num>0){
			System.out.println(num);
			num=num-decrement;
			count++;
		if (count>=10){
				decrement++;
			    count=0;
		}
		}
			
			 
		}

}
