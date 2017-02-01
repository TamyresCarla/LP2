package revisaoAv1.vetor;

public class TestaVetor {

	public static void main(String[] args) {
		Vetor2D vetor = new Vetor2D();
		Ponto pontoOrigem = new Ponto();
		
		vetor.setOrigem(pontoOrigem);
		vetor.setModulo(1);
		vetor.setAngulo(Math.PI);
		
		pontoOrigem = new Ponto(pontoOrigem.getX(), 0);
		
		vetor.setOrigem(pontoOrigem);
		
		System.out.println("X origem: " + vetor.getOrigem().getX());
		System.out.println("Y origem: " + vetor.getOrigem().getY());
		System.out.println("M�dulo: " + vetor.getModulo());
		System.out.println("�ngulo: " + vetor.getAngulo());

	}

}
