public class SamsungTVRunner{
	
	public static void main(String[] args){

		SamsungTV.model();
		SamsungTV.manufacturer();

		System.out.println(SamsungTV.model);
		System.out.println(SamsungTV.manufacturer);

		SamsungTV samsungTV = new SamsungTV();
		samsungTV.warranty();
		samsungTV.screensize();
		samsungTV.warranty = "2years";
		samsungTV.screensize = "55 inches";

		System.out.println(samsungTV.warranty);
		System.out.println(samsungTV.screensize);
}
}