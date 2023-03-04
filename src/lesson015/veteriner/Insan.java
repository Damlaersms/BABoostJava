package lesson015.veteriner;

public abstract class Insan {
	
	private String name;
	private String tc;

	public Insan(String name, String tc) {
		super();
		this.name = name;
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}
	
	public abstract void bilgileriGoster();

	@Override
	public String toString() {
		return "Insan [name=" + name + ", tc=" + tc + "]";
	}
	
	

}
