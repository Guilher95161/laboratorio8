package laboratorio8;

public class Ponto2D {
	private double x;
	private double y;

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ponto2D() {
		this(0.0, 0.0);
	}

	public Ponto2D(Ponto2D p) {
		this(p.getX(), p.getY());
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void desloca(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public Ponto2D somaPonto(double x, double y) {
		return new Ponto2D(this.x + x, this.y + y);
	}

	public Ponto2D somaPonto(Ponto2D p) {
		return new Ponto2D(this.x + p.getX(), this.y + p.getY());
	}

	@Override
	public String toString() {
		return "Ponto X: " + this.x + "\n" + "Ponto Y: " + this.y;
	}

	@Override
	public Ponto2D clone() {
		return new Ponto2D(this);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Ponto2D)) {
			return false;
		} else {
			Ponto2D obj = (Ponto2D) o;
			if (obj.getX() == this.getX() && obj.getY() == this.getY()) {
				return true;
			}
			return false;
		}
	}
}
