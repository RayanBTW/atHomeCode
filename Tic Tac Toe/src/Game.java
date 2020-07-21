import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        char[] position = {' ', ' ', ' ' , ' ', ' ', ' ', ' ', ' ', ' ' };
        char[] reference = {'1', '2', '3' , '4', '5', '6', '7', '8', '9' };

        Scanner sc = new Scanner(System.in);
        int input;
        char turn = 'X';

        System.out.println(" " + reference[6] + " | " + reference[7] + " | " + reference[8] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + reference[3] + " | " + reference[4] + " | " + reference[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + reference[0] + " | " + reference[1] + " | " + reference[2] + " ");

        // if spot taken will keep repeating until non occupied spot is chosen
        while (true) {
            do {
                System.out.print("Enter a position: ");
                input = sc.nextInt();
            } while (position[input - 1] == 'X' || position[input-1] == 'O');

            position[input-1] = turn;

            System.out.println(" " + reference[6] + " | " + reference[7] + " | " + reference[8] + " " + "\t");
            System.out.println("---+---+---");
            System.out.println(" " + reference[3] + " | " + reference[4] + " | " + reference[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + reference[0] + " | " + reference[1] + " | " + reference[2] + " ");

            System.out.println("         ");
            //prints the board
            System.out.println(" " + position[6] + " | " + position[7] + " | " + position[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + position[3] + " | " + position[4] + " | " + position[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + position[0] + " | " + position[1] + " | " + position[2] + " ");





           // WINNER DECISION
            if (position[0] == turn && position[1] == turn && position[2] == turn
            || position[3] == turn && position[4] == turn && position[5] == turn
            || position[6] == turn && position[7] == turn && position[8] == turn
            || position[6] == turn && position[3] == turn && position[0] == turn
            || position[7] == turn && position[4] == turn && position[1] == turn
            || position[8] == turn && position[5] == turn && position[2] == turn
            || position[6] == turn && position[4] == turn && position[2] == turn
            || position[8] == turn && position[4] == turn && position[0] == turn) {
                System.out.println(turn + " is the WINNER!!!!");
                break;
            }
            //ALTERNATES THE TURNS
            if (turn == 'X') {
                turn = 'O';
            }
            else if (turn == 'O') {
                turn = 'X';
            }
        }


    }
}


//    |    |
//--------------
//    |    |
//--------------
//    |    |
