import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointsGamer = 0, pointsBot = 0;
        // the bot chooses one from this array
        char[] choice = {'r', 'p', 's'};
        //noinspection InfiniteLoopStatement
        while(true) {
            System.out.println("--------------------------------");
            java.util.Random random = new java.util.Random();
            int theNumberBotChose = random.nextInt(choice.length);  // decision of the "bot"
            char botsChoice = choice[theNumberBotChose];
            // the bot will chose: 's' or 'p' or 'r'
            System.out.println("Rock, paper or scissors?");
            char gamersChoice = scanner.nextLine().trim().toLowerCase().charAt(0);

            // rules of the game
            if(botsChoice == 'r' && gamersChoice == 'r') {
                System.out.println("the bot also chose rock, so it's a tie");
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 'r' && gamersChoice == 'p') {
                System.out.println("the bot chose rock and you chose paper, so.. you win!");
                pointsGamer++;
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 'r' && gamersChoice == 's') {
                System.out.println("the bot chose rock and you chose scissors, so... you lose....");
                pointsBot++;
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 'p' && gamersChoice == 'p') {
                System.out.println("the bot also chose paper, so it's a tie");
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 'p' && gamersChoice == 'r') {
                System.out.println("the bot chose paper and you chose rock, so.... you lose...");
                pointsBot++;
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if (botsChoice == 'p' && gamersChoice == 's') {
                System.out.println("the bot chose paper and you chose scissors, so.... you win!");
                pointsGamer++;
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 's' && gamersChoice == 's') {
                System.out.println("the bot also chose scissors, so it's a tie");
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 's' && gamersChoice == 'r') {
                System.out.println("the bot chose scissors and you chose rock, so.... you win!");
                pointsGamer++;
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else if(botsChoice == 's' && gamersChoice == 'p') {
                System.out.println("the bot chose scissors and you chose paper, so... you lose...");
                pointsBot++;
                System.out.println("your points: " + pointsGamer + " | points of the bot: " + pointsBot);
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            } else {
                System.out.println("something went wrong....");
                System.out.println("wanna play again? (Yes/No)");
                char next = scanner.nextLine().trim().toLowerCase().charAt(0);
                if(next == 'n') {
                    break;
                } else if(next != 'y') {
                    System.out.println("seriously?");
                    break;
                }
            }
        }
    // the results after the game has ended
    if(pointsBot > pointsGamer) {
        System.out.println(" ");
        System.out.print("the bot won");
    } else if (pointsBot == pointsGamer) {
        System.out.println(" ");
        System.out.print("it's a tie!");
    } else {
        System.out.println(" ");
        System.out.print("you won!");
    }
    }
}
