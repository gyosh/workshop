public class Main{
	public static void main(String[] args){
		AClass aClass = new AClass();
		BClass bClass = new BClass();
		ABClass abClass = new ABClass();
	
		System.out.println("A:");
		aClass.doSomething();

		System.out.println("B:");
		bClass.doSomething();

		System.out.println("AB:");
		abClass.doSomething();
	}
}