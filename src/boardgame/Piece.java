package boardgame;

public class Piece {
	
	protected Position position; //Não Pode ser visivel no programa por isso é protected
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Enfatizando que ela não retorna valor algum (não obrigatório)
	}

	protected Board getBoard() { //Somente classes do msm pacote e subclasses que podem acessar o tabuleiro das peças
		return board;
	} //Apagar o set para  que ele não seja alterado

	
	
	
	
	
	

}
