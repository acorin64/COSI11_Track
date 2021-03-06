import java.util.Scanner;
// just need to show what letters have been guesses already

public class Hangman {
//list of words
	public static String[] words = {"terminator", "code", "computer", "miami", "github", "hangman", "software", "charger", "void", "tim" };
  //unsure below
	public static String wordToGuess = words[(int) (Math.random() * words.length)];
  // changes the word length to that length of asteriks -- change asteriks to ____
	public static String Underscore = new String(new char[wordToGuess.length()]).replace("\0", "_");

  //send count to 0
	public static int count = 0;
//set method for getting letters - convert to textio?
	public static void main(String[] args) {
    //gets input
    //System.out.println("test");
		Scanner scanner = new Scanner(System.in);
//loop to continue until loss or win
		while (count < 7 && Underscore.contains("_")) {
      //ask user for a letter
			System.out.println("Guess any letter in the word");
      //prints out how many letters there are in asteriks
			System.out.println(Underscore);
      int numLetters = wordToGuess.length();
      System.out.println("there are "+ numLetters + " letters in the word. Good Luck!");
      //ask for the guess - input is here
			String yourGuess = scanner.next();
      //uses hang method with guess
			hang(yourGuess);
		}
    //closes loop
		scanner.close(); // here
	}
//new method - for guessing
	public static void hang(String guess) {
    //set up to manipulate
		String newUnderscore = "";
    /*loop with ifs so that if a character is right then it
    changes it into the word that is right */
		for (int i = 0; i < wordToGuess.length(); i++) {
			if (wordToGuess.charAt(i) == guess.charAt(0)) {
				newUnderscore += guess.charAt(0);
			} else if (Underscore.charAt(i) != '_') {
				newUnderscore += wordToGuess.charAt(i);
			} else {
				newUnderscore += "_";
			}
		}
// if statement that changes the image if wrong
		if (Underscore.equals(newUnderscore)) {
			count++;
			hangmanImageSwitch();
      //if right, change asteriks
		} else {
			Underscore = newUnderscore;
		}
    //if win, then stop
		if (Underscore.equals(wordToGuess)) {
			System.out.println("Correct! You won! The word was " + wordToGuess);
		}
	}
//method for changing picture
	public static void hangmanImageSwitch() {
    //change so that it starts with a full thing, make sure to camelcase too
    switch(count) { // switch
      case 1: hang1(); break;
      case 2: hang2(); break;
      case 3: hang3(); break;
      case 4: hang4(); break;
      case 5: hang5(); break;
      case 6: hang6(); break;
      case 7: hang7(); break;
    }
  }
      // the switch statements for all
      //default: do i need?
		public static void hang1() {
      System.out.println("Wrong guess, try again");
      System.out.println("   ____________");
      System.out.println("   |          |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   |");
      System.out.println("   | ");
      System.out.println("___|___");
		}
		public static void hang2() {
      System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |         \\__ /");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		public static void hang3() {
      System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |         \\__ /");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		public static void hang4() {
  			System.out.println("Wrong guess, try again");
  			System.out.println("   ____________");
  			System.out.println("   |          _|_");
  			System.out.println("   |         /   \\");
  			System.out.println("   |         \\__ /");
  			System.out.println("   |           |");
  			System.out.println("   |           |");
  			System.out.println("   |            \\");
  			System.out.println("   |             \\ ");
  			System.out.println("___|___");
		}
		public static void hang5() {
      System.out.println("Wrong guess, try again!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |         \\__ /");
      System.out.println("   |           |");
			System.out.println("   |           | ");
			System.out.println("   |          / \\ ");
			System.out.println("   |         /   \\");
			System.out.println("___|___");
		}
		public static void hang6() {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |         \\__ /");
			System.out.println("   |          _|");
			System.out.println("   |         / |");
			System.out.println("   |          / \\");
			System.out.println("   |         /   \\ ");
			System.out.println("___|___");
		}
    //end code, loss at 7 guesses
		public static void hang7() {
			System.out.println("GAME OVER!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /x x\\");
			System.out.println("   |         \\__ /");
      System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("   |         /   \\");
			System.out.println("___|___");
			System.out.println("Game over! The word was " + wordToGuess);
		}
	}
// fix _ and finish commenting
