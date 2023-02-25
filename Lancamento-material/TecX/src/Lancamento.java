
public class Lancamento {
	
	public static void main(String[] args) {
		
		Material material = new Material();
				
		material.setBrInicial(10);
		material.setBrFinal(40);
						
		System.out.println("Metragem inicial de branco: " + material.getBrInicial());
		
		System.out.println("Metragem final de branco: " + material.getBrFinal());
		
		System.out.println("Total utilizado: " + material.getBrTotal());
		
		
		material.setPtInicial(15);
		material.setPtFinal(40);
		
		System.out.println("Metragem inicial de preto: " + material.getPtInicial());
		
		System.out.println("Metragem final de preto: " + material.getPtFinal());
						
		System.out.println("TOral utilizado: " + material.getPtTotal());
		
		
		material.setNumeroContrato(123456788);
		
		System.out.println("Contrato: " + material.getNumeroContrato());
			
				
		
		
	}

}
