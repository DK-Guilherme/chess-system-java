package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board); //Repassa a chamada para o construtor da superclasse
		this.color = color;
	}

	public Color getColor() {
		return color;
	}//Apaguei o set pq n�o quero que uma cor seja modificada, apenas acessada

	
	
	

}
