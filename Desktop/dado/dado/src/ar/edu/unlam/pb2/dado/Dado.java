package ar.edu.unlam.pb2.dado;

public class Dado {

	private Integer caras;
	
	public Dado() {
		
	}
	
	public Dado(Integer caras) {
		this.caras = caras;
	}

	public Integer lanzar() {
		return (int) (Math.random() * caras) + 1;
	}
}
