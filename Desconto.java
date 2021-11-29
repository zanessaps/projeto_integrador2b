package projetoIntegradorParte1;

public class Desconto {
	
	public double AdicionarDescontoDebito(double valor) {
		return valor - (valor * 0.025);
	}
	
	public double AdicionarDescontoPix(double valor) {
		return valor - (valor * 0.05);
	}
}
