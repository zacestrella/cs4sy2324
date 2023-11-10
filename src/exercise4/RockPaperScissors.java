/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise4;
import java.util.Scanner;
/**
 *
 * @author adahestrella
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author PHOTON
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");

		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                Scanner roundsInput = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option: "
                + "\n1. Start Game \n2. Change number of rounds \n3. Exit application\n");

        Scanner settingsOption = new Scanner(System.in);
        String option = settingsOption.nextLine();
        
 switch (option) {
            case "1":
                System.out.printf("This match will be first to %d wins\n", roundsToWin);
                playRPS(roundsToWin, rock, paper, scissors);
                break;

            case "2":
                System.out.print("Enter the number of rounds youd like to play! : ");
                roundsToWin = roundsInput.nextInt();
                System.out.printf("New setting has been saved. This match will be first to %d wins\n", roundsToWin);
                playRPS(roundsToWin, rock, paper, scissors);
                break;

            case "3":
                System.out.println("Maybe next time?");
                break;

            default:
                System.out.println("This was not in the options. Please try again.");
        }
    }

    public static void playRPS(int roundsToWin, Move rock, Move paper, Move scissors) {
        int playerScore = 0;
        int computerScore = 0;
        Scanner moveInput = new Scanner(System.in);

        while (playerScore < roundsToWin && computerScore < roundsToWin) {
            int random = (int) Math.floor(Math.random() * 3) + 1;
            Move computerMove = null;
        
            switch (random) {
             case 1:
                computerMove = rock;
		break;
             case 2:
                computerMove = paper;
		break;
             case 3:
                computerMove = scissors;
            	break;
            default:
                break;
        }
            System.out.println("The computer has selected its move. Select your move:");
            System.out.println("1. Rock\n2. Paper\n3. Scissors");
            String playerMoveChoice = moveInput.nextLine();
            Move playerMove;
            
            switch (playerMoveChoice) {
                case "1":
                    playerMove = rock;
                    break;
                case "2":
                    playerMove = paper;
                    break;
                case "3":
                    playerMove = scissors;
                    break;
                default:
                    System.out.println("Invalid move. Please try again.");
                    continue;
            }
             
            int result = Move.compareMoves(playerMove, computerMove);
            
            switch (result){
                case 0:
                playerScore++;
                System.out.println("You won!");
                break; 
                
                case 1:
                computerScore++;
                System.out.println("Computer won this round!");
                break;
                
                case 2:
                System.out.println("Round is tied!");
                break;
            }

            System.out.printf("Player: %d - Computer: %d\n\n", playerScore, computerScore);
        }

        if (playerScore > computerScore) {
            System.out.println("Player wins!");
        } else if (playerScore < computerScore){
            System.out.println("Computer wins!");
        }

    }
}