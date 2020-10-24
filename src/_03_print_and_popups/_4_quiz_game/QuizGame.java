package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String one = JOptionPane.showInputDialog("What is 1+1?");
				// 3.  Use an if statement to check if their answer is correct
			if(one.equals("2")) {
				score += 1;
			}
			else{
				score -= 1;
			}
				// 4.  if the user's answer was correct, add one to their score 
			
		String two = JOptionPane.showInputDialog("What is 4 x 3?");
		if(two.equals("12")) {
			score +=1;
		}
		else{
			score -= 1;
		}
		String three = JOptionPane.showInputDialog("What is 120/6");
		if(three.equals("20")) {
			score += 1;
		}
		else{
			score -= 1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		JOptionPane.showMessageDialog(null,"Your score is " + score +".");
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
