import java.util.Scanner;
class Player{
	Scanner sc= new Scanner(System.in);
	int num;
	public void guess() {
		System.out.println("Enter the number between 1 to 10");
		num = sc.nextInt();
	}	
}
class Game{
	Player p1;
	Player p2;
	Player p3;
	void StartGame(){
		p1= new Player();
		p2= new Player();
		p3= new Player();
		int guessp1;
		int guessp2;
		int guessp3;
		//boolean p1isRight=false;
		//boolean p2isRight=false;
		//boolean p3isRight=false;
		int target =(int)(Math.random()*10)+1;
		System.out.println("I am thinking a number.............");
		int i=3;
	
	while (i>0) {
		//System.out.println("Number to be guessed "+target);
		p1.guess();
		p2.guess();
		p3.guess();
		guessp1=p1.num;
		System.out.println("Player 1 => "+guessp1);
		
		i--;
		if(target==guessp1) {
			//p1isRight=true;
			System.out.println("Player 1 won!!! ");
			break;}
		else if(guessp1<=0||guessp1>10) {
			System.out.println("You have to guess the number between 1 and 10 ,but your number not in the range.");
		}
		else if(target>=guessp1) {
			System.out.println("Guess some bigger number than this.....");
		}
		else if(target<=guessp1) {
			System.out.println("Guess some smaller number than this.....");
		}
		
		guessp2=p2.num;
		System.out.println("Player 2 => "+guessp2);
		if(target==guessp2) {
			//p2isRight=true;
			System.out.println("Player 2 won!!! ");
			break;
		}
		else if(guessp2<=0||guessp2>10) {
			System.out.println("You have to guess the number between 1 and 10 ,but your number not in the range.");
		}
		else if(target>=guessp2) {
			System.out.println("Guess some bigger number than this.....");
		}
		else if(target<=guessp2) {
			System.out.println("Guess some smaller number than this.....");
		}
		
		guessp3=p3.num;
		//i--;
		System.out.println("Player 3 => "+guessp3);
		if(target==guessp3) {
			//p3isRight=true;
			System.out.println("Player 3 won!!! ");
			break;
			}
		else if(guessp3<=0||guessp3>10) {
			System.out.println("You have to guess the number between 1 and 10 ,but your'r number not in the range.");
		}
		else if(target>=guessp3) {
			System.out.println("Guess some bigger number than this.....");
		}
		else if(target<=guessp3) {
			System.out.println("Guess some smaller number than this.....");
		}
		
		/*if(p1isRight) {
			System.out.println("Player 1 won ");
			break;
			}
		if(p2isRight) {
			System.out.println("Player 2 won ");
			break;
		}
		if(p3isRight) {
			System.out.println("Player 3 won ");
			break;
		}*/
		
			
		
		   if(i==0) {
			System.out.println("your chances are over,Computer won");
			System.out.println("Number to be guessed was "+target);}
		   else {
			   System.out.println("Try Again");
				
		   }
		   System.out.println("********************************************");
		
		}
		
	}
}

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game ga=new Game();
		ga.StartGame();

	}

}
