public class Digit{
	private static int num=3;
	
	public Digit(){
		num=0;
	}
	
	public int test(int num){
		num=1;
		System.out.println(this.num);
		return num;
	}
}