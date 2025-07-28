package inversionofcontrol;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Vodafone is calling");

	}

	@Override
	public void data() {
		System.out.println("Vodafone data is using");

	}

}
