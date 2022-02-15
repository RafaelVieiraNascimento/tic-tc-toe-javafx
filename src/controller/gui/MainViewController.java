package controller.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import model.entities.Rules;
import model.entities.ScorePanel;

public class MainViewController {

	Rules rules = new Rules();
	ScorePanel scorePanel = new ScorePanel();

	@FXML
	Button btn00;
	@FXML
	Button btn01;
	@FXML
	Button btn02;
	@FXML
	Button btn10;
	@FXML
	Button btn11;
	@FXML
	Button btn12;
	@FXML
	Button btn20;
	@FXML
	Button btn21;
	@FXML
	Button btn22;

	@FXML
	ImageView img00;
	@FXML
	ImageView img01;
	@FXML
	ImageView img02;
	@FXML
	ImageView img10;
	@FXML
	ImageView img11;
	@FXML
	ImageView img12;
	@FXML
	ImageView img20;
	@FXML
	ImageView img21;
	@FXML
	ImageView img22;
	
	@FXML
	Label scoreX;
	@FXML
	Label xStreakCurrent;
	@FXML
	Label xStreakMax;
	@FXML
	Label scoreO;
	@FXML
	Label oStreakCurrent;
	@FXML
	Label oStreakMax;
	@FXML
	Label scoreDraw;
	@FXML
	Label numberOfGames;
	@FXML
	Label youTurn;
	@FXML
	Label message;
	

	@FXML
	public void setClickBtn00() {

		rules.setPieceOnClick(img00, 0, 0);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();

	}

	@FXML
	public void setClickBtn01() {
		rules.setPieceOnClick(img01, 0, 1);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn02() {
		rules.setPieceOnClick(img02, 0, 2);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn10() {
		rules.setPieceOnClick(img10, 1, 0);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn11() {
		rules.setPieceOnClick(img11, 1, 1);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn12() {
		rules.setPieceOnClick(img12, 1, 2);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn20() {
		rules.setPieceOnClick(img20, 2, 0);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn21() {
		rules.setPieceOnClick(img21, 2, 1);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}

	@FXML
	public void setClickBtn22() {
		rules.setPieceOnClick(img22, 2, 2);
		rules.winnerChecker();
		changeScorePlayer();
		youTurn();
		message();
		resetGame();
	}
	
	@FXML
	public void changeScorePlayer() {
		scorePanel.changeScorePlayer(scoreX, xStreakCurrent, xStreakMax, scoreO, oStreakCurrent, oStreakMax, scoreDraw, numberOfGames, rules.getWinner());
	}
	
	public void youTurn() {
		scorePanel.youTurn(youTurn, rules.getPlayer());
	}
	
	public void message() {
		scorePanel.message(message, rules.getWinner(), rules.isFault());

	}

	@FXML
	public void resetGame() {
		rules.resetGame(img00, img01, img02, img10, img11, img12, img20, img21, img22);
	}

}
