package model.entities;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rules {

	private int board[][] = new int[3][3];
	int firstToPlay = 0;
	int player = 1;
	int winner = 0;
	boolean fault = false;

	public int getPlayer() {
		return player;
	}

	public int getWinner() {
		return winner;
	}

	public boolean isFault() {
		return fault;
	}

	public void changeFirstToPlay() {

		if (firstToPlay % 2 == 0) {
			player = 1;
		} else
			player = 2;
	}

	public void changeTurn() {
		if (player == 1) {
			player = 2;
		} else {
			player = 1;
		}
	}

	public void setPieceOnClick(ImageView img, int linha, int coluna) {

		Image tempImg;
		fault = false;
		if (player == 1 && board[linha][coluna] == 0) {
			tempImg = new Image(getClass().getResourceAsStream("../../resource/images/X1.png"));
			img.setImage(tempImg);
			this.board[linha][coluna] = 1;

			changeTurn();

		} else if (player == 2 && board[linha][coluna] == 0) {
			tempImg = new Image(getClass().getResourceAsStream("../../resource/images/O1.png"));
			img.setImage(tempImg);
			this.board[linha][coluna] = -1;

			changeTurn();

		} else if (board[linha][coluna] != 0) {
			fault = true;
		}

	}

	public void winnerChecker() {

		int condition1 = 0;
		int condition2 = 0;

		for (int i = 0; i < 3; i++) {

			int soma1 = 0;
			int soma2 = 0;

			for (int j = 0; j < 3; j++) {

				soma1 += board[i][j];
				soma2 += board[j][i];

				if (soma1 == 3 || soma2 == 3) {
					condition1 = 1;
				} else if (soma1 == -3 || soma2 == -3) {
					condition1 = -1;
				}
				if (board[i][j] == 1 || board[i][j] == -1) {
					condition2++;
				}
			}
		}

		if (board[0][0] + board[1][1] + board[2][2] == 3 || board[0][2] + board[1][1] + board[2][0] == 3) {
			condition1 = 1;
		} else if (board[0][2] + board[1][1] + board[2][0] == -3 || board[0][0] + board[1][1] + board[2][2] == -3) {
			condition1 = -1;
		}

		if (condition1 == 1) {
			winner = 1;
		} else if (condition1 == -1) {
			winner = 2;
		}

		else if (condition2 == 9) {
			winner = 3;
		}

	}

	public void resetGame(ImageView img00, ImageView img01, ImageView img02, ImageView img10, ImageView img11,
			ImageView img12, ImageView img20, ImageView img21, ImageView img22) {

		if (winner == 1 || winner == 2 || winner == 3) {

			firstToPlay++;
			changeFirstToPlay();

			img00.setImage(null);
			img01.setImage(null);
			img02.setImage(null);
			img10.setImage(null);
			img11.setImage(null);
			img12.setImage(null);
			img20.setImage(null);
			img21.setImage(null);
			img22.setImage(null);

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					board[i][j] = 0;
				}
			}

			winner = 0;

		}
	}

}
