package PK24;

public class GenericPrinter<T extends Material>{

	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
