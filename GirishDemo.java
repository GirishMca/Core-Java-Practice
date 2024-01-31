
public class GirishDemo {

	// public static void main(String[] args)
	// {
	// Iphone ip = new Iphone();
	// Oneplusc2 Op=new Oneplusc2();
	// ip.showConfig();

	// show(obj);

	// }
	public static void show() {
		// obj.showConfig();
		System.out.println("2 gb,IOS 9.3");

	}

	abstract class Phone {
		public abstract void showConfig();
	}

	class Iphone extends Phone {
		public void showConfig() {
			System.out.println("2 gb,IOS 9.3");
		}
	}

	class Oneplusc2 extends Phone {
		public void showConfig() {
			System.out.println("2 gb ,Lolipoop");
		}
	}

	public static void main(String[] args) {
		//GirishDemo gd = new GirishDemo();
		//gd.show();
		Phone p = new Phone();
	}
}
