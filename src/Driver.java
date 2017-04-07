import java.util.*;
public class Driver {

	static Athlete currentAthlete;
	public Database db=new Database();	
	static Ozlympics oz=new Ozlympics();
	static String n1=null,n2=null,n3=null;
	static char gametype;
	String predictionplayer;
	
	public static  HashMap<Integer, String> hmaprecord=new HashMap<Integer, String>();
	public static HashMap<Integer, String> hmaprecord2=new HashMap<Integer, String>();
	
	
	public void mainoption()
	{
		
		
		
		PlayerRecord pr=new PlayerRecord();
		
			System.out.println("");
			System.out.println("");
			System.out.println("INSTRUCTIONS BELOW: Press the options to proceed");
			System.out.println(" ");
			System.out.println("1.	Select a game to run");
			System.out.println("2.	Predict	the winner of the game ");
			System.out.println("3.	Start the game");
			System.out.println("4.	Display	the final results of all games");
			System.out.println("5.	Display	the points of all athletes");
			System.out.println("6.	Exit");
			System.out.println("");
			
			
			Scanner sc1=new Scanner(System.in);
			int option1=sc1.nextInt();
				
			switch(option1)
			{
			
			
				case 1: 
					
					gameselect();
				
					break;
				case 2:
					System.out.println("Predict	the winner of the game");
					prediction();
					break;
				case 3:
					System.out.println("Start the game");
					startgame();
					break;
				case 4:
					System.out.println("Display	the final results of all games");
					pr.gameResultDisplay();	
					break;
				case 5:
					System.out.println("Display	the points of all athletes");
					
					for(int i=0;i<db.getAthletedetails().length;i++){
						
						if(n1==db.getAthletedetails()[i].getName()){
							int x= db.getAthletedetails()[i].getpoints();
							x=db.getAthletedetails()[i].getpoints()+5;
							db.getAthletedetails()[i].setAthletepoints(x);
							
						}
						if(n2==db.getAthletedetails()[i].getName()){
							int x= db.getAthletedetails()[i].getpoints();
							x=db.getAthletedetails()[i].getpoints()+2;
							db.getAthletedetails()[i].setAthletepoints(x);
							
						}
						if(n3==db.getAthletedetails()[i].getName()){
							int x= db.getAthletedetails()[i].getpoints();
							x=db.getAthletedetails()[i].getpoints()+1;
							db.getAthletedetails()[i].setAthletepoints(x);
						}
					}
					
					for(int j =0;j<db.getAthletedetails().length;j++)
					{
					System.out.println("Athlete ID:"+db.getAthletedetails()[j].getID() +" Athlete Name: "+ db.getAthletedetails()[j].getName() + " Points: " + db.getAthletedetails()[j].getpoints());
					}
					mainoption();
					oz.main(null);
							break;
				case 6:
					System.out.println("Exit");
					System.exit(0);
					break;
			}
			}
			
	public void gameselect(){
	
		System.out.println(" Please select the type of game you would like to play");
		System.out.println("1. Running");
		System.out.println("2. Swimming");
		System.out.println("3. Cycling");
		
		Scanner sc3= new Scanner(System.in);
		int option3 = sc3.nextInt();
		
		switch(option3){
		case 1:
			
			System.out.println("Your selection: EVENT RUNNING");
			System.out.println("");
			System.out.println("You will be redirected to the MAIN MENU for further proceedings");
			gametype = 'R';
			mainoption();
			break;
			
		case 2:
			
			System.out.println("Your selection: EVENT SWIMMING");
			System.out.println("");
			System.out.println("You will be redirected to the MAIN MENU for purther proceedings");
			gametype = 'S';
			mainoption();
			break;
			
		case 3:
			
			System.out.println("Your selection: EVENT CYCLING");
			System.out.println("");
			System.out.println("You will be redirected to the MAIN MENU for purther proceedings");
			gametype = 'C';
			mainoption();
			break;
		}
		
	}
	
	public void prediction(){
		
		if(gametype == 'R'){
			System.out.println("GAME RUNNING");
			System.out.println("------------------------------------");
		}
		else if(gametype == 'S'){
			System.out.println("GAME SWIMMING");
			System.out.println("------------------------------------");
		}
		else if(gametype == 'C'){
			System.out.println("GAME CYCLING");
			System.out.println("------------------------------------");
		}
		System.out.println("");
		
		System.out.println("PLease predict the WINNER ID from the following List of Players");
		System.out.println("");
		System.out.println("The LIST:");
		
		
		db.athleteDisplay(gametype);
		System.out.println("");
		System.out.println("Enter the ID number");
		
		Scanner pre = new Scanner(System.in);
		predictionplayer=pre.next();
		
		System.out.println("Thank you for the Prediction.");
		System.out.println("You will be redirected to the MAIN MENU");
		mainoption();
		
	}
	

	
	public void startgame(){
		Random ran=new Random();
		Database db=new Database();
		PlayerRecord play=new PlayerRecord();
		 
		System.out.println("The game is about to begn");
		System.out.println("Enter the no of participants for the Game");
		Scanner sc2 = new Scanner(System.in);
		int option2=sc2.nextInt();
		
		if(option2<4){
			System.out.println("PLease enter the number of participants more than 4");
		}
		else{
			System.out.println("The Game begins");
		
			char typeathlete ;
			play.listmake();
			hmaprecord=play.getHmaprecord();
			
			
			if(gametype=='R')
				{
					typeathlete = 'R';
					
					db.gameList=db.athleteLoad(typeathlete, option2);
					System.out.println("Gamesize" + db.gameList.size());
					System.out.println("---------");
					System.out.println("Game Starting...");
					Running run = new Running();
	
					int flag=0;
					int flag2=0;
					
						for(Athlete at:db.gameList){
							if(flag2==0){
							n1=at.getName();
							flag2++;
							}
							else if(flag2==1 && flag2!=0){
								n2=at.getName();
								
								flag2++;
							}
							else if(flag2==2 && flag!=0 && flag2!=1){
								n3=at.getName();
								flag2++;
							}
							if(flag==0){
							at.compete(run.getMaxTime(),run.getMinTime());
							flag++;
							}
							}
						
						play.tt(typeathlete,n1, n2, n3);
						mainoption();
						}
					

			if(gametype == 'S')
			{
					typeathlete = 'R';
					db.gameList=db.athleteLoad(typeathlete, option2);
					System.out.println("Gamesize" + db.gameList.size());
					System.out.println("---------");
					System.out.println("Game Starting...");
					Running run = new Running();
		
					int flag=0;
					int flag2=0;
					
						for(Athlete at:db.gameList){
							if(flag2==0){
							n1=at.getName();
							flag2++;
							}
							else if(flag2==1 && flag2!=0){
								n2=at.getName();
								
								flag2++;
							}
							else if(flag2==2 && flag!=0 && flag2!=1){
								n3=at.getName();
								flag2++;
							}
							if(flag==0){
							at.compete(run.getMaxTime(),run.getMinTime());
							flag++;
							}
							}
						play.tt(typeathlete,n1, n2, n3);
						mainoption();
						}
					
				if(gametype=='C')
				{
					typeathlete = 'R';
					db.gameList=db.athleteLoad(typeathlete, option2);
					System.out.println("Gamesize" + db.gameList.size());
					System.out.println("---------");
					System.out.println("Game Starting...");
					Running run = new Running();
		
					int flag=0;
					int flag2=0;
					
						for(Athlete at:db.gameList){
							if(flag2==0){
							n1=at.getName();
							flag2++;
							}
							else if(flag2==1 && flag2!=0){
								n2=at.getName();
								
								flag2++;
							}
							else if(flag2==2 && flag!=0 && flag2!=1){
								n3=at.getName();
								flag2++;
							}
							if(flag==0){
							at.compete(run.getMaxTime(),run.getMinTime());
							flag++;
							}
							}
						play.tt(typeathlete,n1, n2, n3);
						mainoption();
				}
		}
	}
}