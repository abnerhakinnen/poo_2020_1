
package papelaria;

public class Lapiseira {
    public String marca;
	public double ponta;
	public Grafitte grafite;
	
	public Lapiseira(double ponta, String marca) {
		super();
		this.ponta = ponta;
		this.marca = marca;
	}
	
	public void escrever(int qtd) {
		if(this.grafite.tamanhoGrafite <0) {
			grafite = null;
			System.out.println("fail: nao tem grafite");
			return;
		}
		if(this.grafite.tamanhoGrafite > 0)
			this.grafite.tamanhoGrafite -= qtd;
		System.out.println("Escrevendo");
	}
	
	public void colocarGrafite(Grafitte grafite) {
		if(this.ponta == ponta) {
			this.grafite = grafite;
		}else {
			System.out.println("fail: ponta incompativel");
		}
	}
		
	
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamanhoGrafite() {
		return grafite.tamanhoGrafite;
	}
	public void setTamanhoGrafite(int tamanhoGrafite) {
		this.grafite.tamanhoGrafite = tamanhoGrafite;
	}
	
	@Override
	public String toString() {
		return "marca:" + this.marca + ", ponta:" + this.ponta + ", gtam:" + this.grafite.tamanhoGrafite;
	}
	
	
	public static void main(String[] args) {
		Grafitte faber = new Grafitte (10, 0.7);
		Lapiseira pentel = new Lapiseira(0.7, "Pentel");
		pentel.escrever(4);
		pentel.colocarGrafite(faber);
		pentel.escrever(2);
		System.out.println(pentel);
	}
}
