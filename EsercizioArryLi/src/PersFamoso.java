
public class PersFamoso {
	
	String nome;
	String cognome;
	String sesso;
	int eta;
	
	public PersFamoso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersFamoso(String nome, String cognome, String sesso, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "[" + nome + ", " + cognome + ", " + sesso + ", " + eta + "]";
	}
	  
	
	
}
