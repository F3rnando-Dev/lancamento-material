
public class Material {
	
	private int brInicial;
	private int brFinal;
	private int brTotal;
	
	private int ptInicial;
	private int ptFinal;
	private int ptTotal;
	
	private int numeroContrato;
	
	
	
	public int getBrInicial() {
		return brInicial;
	}
	public void setBrInicial(int brInicial) {
		this.brInicial = brInicial;
	}
	public int getBrFinal() {
		return brFinal;
	}
	public void setBrFinal(int brFinal) {
		this.brFinal = brFinal;
	}
	public int getBrTotal() {
		return brFinal - brInicial;
	}
	
	public int getPtInicial() {
		return ptInicial;
	}
	public void setPtInicial(int ptInicial) {
		this.ptInicial = ptInicial;
	}
	public int getPtFinal() {
		return ptFinal;
	}
	public void setPtFinal(int ptFinal) {
		this.ptFinal = ptFinal;
	}
	public int getPtTotal() {
		return ptFinal - ptInicial;
	}
	public int getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	
	
	
	
	
}
