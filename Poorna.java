public class Poorna{
	
	public static void main(String[] args){

	int[] pagenumber = {45,57,75,89,54,34,67,88};

	for(int i = 0; i<pagenumber.length; i++){
		System.out.println(pagenumber[i]);
	}
	System.out.println(" last to first");
	for(int i = pagenumber.length-1; i>=0; i--){
	System.out.println(pagenumber[i]);

	}
	
	System.out.println("miidle to last");
	for(int i=pagenumber.length/2; i<=pagenumber.length-1; i++){
	System.out.println(pagenumber[i]);
}

	System.out.println(" first to middle");
	for(int i=0; i<=pagenumber.length/2; i++){
	System.out.println(pagenumber[i]);
}
System.out.println(" skipping");
	for(int i=0; i<pagenumber.length; i=i+2){
	System.out.println(pagenumber[i]);
}
}
}