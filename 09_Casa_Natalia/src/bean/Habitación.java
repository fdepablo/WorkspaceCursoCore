package bean;

public class Habitaci�n {
	
	private double superficie;
	private String tipo;
	
	
	public Habitaci�n(double superficie, String tipo) {
		super();
		this.superficie = superficie;
		this.tipo = tipo;
		
	}
		
		public Habitaci�n() {
			super();
		}

		
		
		
		public double getSuperficie() {
			return superficie;
		}

		public void setSuperficie(double superficie) {
			this.superficie = superficie;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return "\n Habitaci�n [superficie=" + superficie + ", tipo=" + tipo + "]";
		}
		
		
	


	


	
	
	
	
	
	

}



