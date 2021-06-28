package proj;

public class Room {
	int type;
	int quant;
	double valor;

	public Room(int type, int quant, double valor) {
		super();
		this.type = type;
		this.quant = quant;
		this.valor = valor;
	}

	public void getreserva() {
		quant--;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
