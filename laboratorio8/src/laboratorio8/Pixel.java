package laboratorio8;

public class Pixel extends Ponto2D {
	private int cor;

	public Pixel(double x, double y, int cor) {
		super(x, y);
		this.cor = cor % 100;
	}
	public Pixel() {
		super();
		this.cor = 0;
	}

	public int getCor() {
		return this.cor;
	}

	public void mudaCor(int cor) {
		this.cor = cor;
	}

	public void deslocaPixel(double x, double y) {
		super.desloca(x, y);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Cor: " + this.cor;
	}

	@Override
	public Pixel clone() {
		return new Pixel(super.getX(), super.getY(), this.cor);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pixel)) {
			return false;
		} else {
			Pixel obj = (Pixel) o;
			if (obj.getX() == this.getX() && obj.getY() == this.getY() && obj.getCor() == this.cor) {
				return true;
			}
			return false;
		}
	}
}
