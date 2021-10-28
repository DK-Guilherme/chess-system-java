package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board); //Repassa a chamada para o construtor da superclasse
		this.color = color;
	}

	public Color getColor() {
		return color;
	}//Apaguei o set pq não quero que uma cor seja modificada, apenas acessada
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
}
