package model.entities;

import javafx.scene.control.Label;

public class ScorePanel {

	int scorexSum = 0;
	int xStreakCurrentSum = 0;
	int xStreakMaxSum = 0;
	int scoreoSum = 0;
	int oStreakCurrentSum = 0;
	int oStreakMaxSum = 0;
	int scoreDrawSum = 1;
	int numOfGames = 1;

	public void changeScorePlayer(Label scoreX, Label xStreakCurrent, Label xStreakMax, Label scoreO,
			Label oStreakCurrent, Label oStreakMax, Label scoreDraw, Label numberOfGames, int winner) {
		if (winner == 1) {
			scorexSum++;
			xStreakCurrentSum++;
			scoreX.setText(String.valueOf(scorexSum));
			xStreakCurrent.setText(String.valueOf(xStreakCurrentSum));
			oStreakCurrent.setText(String.valueOf(oStreakCurrentSum = 0));
			numberOfGames.setText(String.valueOf(numOfGames++));
			if (xStreakCurrentSum > xStreakMaxSum) {
				xStreakMaxSum++;
				xStreakMax.setText(String.valueOf(xStreakMaxSum));
			}

		} else if (winner == 2) {
			scoreoSum++;
			oStreakCurrentSum++;
			xStreakCurrent.setText(String.valueOf(xStreakCurrentSum = 0));
			scoreO.setText(String.valueOf(scoreoSum));
			oStreakCurrent.setText(String.valueOf(oStreakCurrentSum));
			numberOfGames.setText(String.valueOf(numOfGames++));
			if (oStreakCurrentSum > oStreakMaxSum) {
				oStreakMaxSum++;
				oStreakMax.setText(String.valueOf(oStreakMaxSum));
			}
		} else if (winner == 3) {
			scoreDraw.setText(String.valueOf(scoreDrawSum++));
			numberOfGames.setText(String.valueOf(numOfGames++));
		}

	}

	public void youTurn(Label youTurn, int player) {
		if (player == 1) {
			youTurn.setText("Player X, its your turn!");
		}

		else if (player == 2) {
			youTurn.setText("Player O, make your move!");
		}
	}

	public void message(Label message, int winner, boolean fault) {
		if (winner == 1) {
			message.setText(" Player X WIN !!!");
		}

		else if (winner == 2) {
			message.setText(" Player O WIN !!!");
		} else if (winner == 3) {
			message.setText(" DRAW !!!");
		} else if (fault == true) {
			message.setText("Choose an empty space !");
		} else {
			message.setText(" ");
		}
	}

	// TODO Auto-generated method stub

}
