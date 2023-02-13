package cat;

public class Cat {

	private String name;
	private int age;
	private double kilos;
	private Size size;
	
	Cat(String name, int age, double kilos){
		this.name = name;
		this.age = age;
		this.kilos = kilos;
		setSize();
	}
	
	Size getSize() {
		return size;
	}
	
	void setSize() {
			if(0.5<kilos && kilos<1)
				size = Size.XS;
			else if(1<=kilos && kilos<1.5)
				size = Size.S;
			else if(1.5<=kilos && kilos<2)
				size = Size.M;
			else if(2<=kilos && kilos<2.5)
				size = Size.L;
			else if(2.5<=kilos && kilos<3)
				size = Size.XL;
			else if(3<=kilos)
				size = Size.XXL;
	}
	
	@Override
	public String toString() {
		return "Cat info: "
				+ "\n   Name:" + name
				+ "\n   Age:" + age
				+ "\n   Kilos:" + kilos
				+ "\n   Size:" + size;
	}
}
