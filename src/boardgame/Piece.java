package boardgame;

public class Piece {
	
	protected Position position; //N�o Pode ser visivel no programa por isso � protected
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Enfatizando que ela n�o retorna valor algum (n�o obrigat�rio)
	}

	protected Board getBoard() { //Somente classes do msm pacote e subclasses que podem acessar o tabuleiro das pe�as
		return board;
	} //Apagar o set para  que ele n�o seja alterado

	
	
	
	
	
	

}
