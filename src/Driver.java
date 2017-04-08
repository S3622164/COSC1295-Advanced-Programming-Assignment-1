/*
 * @ Seby Tom Sebastian
 */

import java.util.*;
public class Driver {

	static Athlete currentAthlete;
	public Database db=new Database();	
	Random ran=new Random();
	static String firstPlace=null,secondPlace=null,thirdPlace=null;
	static char gametype;
	public int predictionplayer;
	Set <Athlete> gameList= new HashSet <Athlete>();
	public static  HashMap<Integer, String> hmaprecord=new HashMap<Integer, String>();
	public static HashMap<Integer, String> hmaprecord2=new HashMap<Integer, String>();
	
	// Main Method
	public static void main(String [] args){
			Driver dr=new Driver();
			dr.mainoption();
		}
	
	// Method functions as User Interface
	
	public void mainoption(){
			PlayerRecord pr=new PlayerRecord();
			System.out.println("Ozlympic Game");
			System.out.println("================================================");
			System.out.println(" ");
			System.out.println("1.	Select a game to run");
			System.out.println("2.	Predict	the winner of the game ");
			System.out.println("3.	Start the game");
			System.out.println("4.	Display	the final results of all games");
			System.out.println("5.	Display	the points of all athletes");
			System.out.println("6.	Exit");
			System.out.println("");
			System.out.println("Enter an option: _");
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
						List currentList = new ArrayList(db.gameList);
						
						// Loop that add appropriate points with respect to the Winners in each game
						
						for(int i=0;i<db.getAthletedetails().length;i++){
							
							if(firstPlace==db.getAthletedetails()[i].getAthletename()){
								int pointSum= db.getAthletedetails()[i].getAthletepoints();
								pointSum=db.getAthletedetails()[i].getAthletepoints()+5;
								db.getAthletedetails()[i].setAthletepoints(pointSum);
								}
							if(secondPlace==db.getAthletedetails()[i].getAthletename()){
								int pointSum= db.getAthletedetails()[i].getAthletepoints();
								pointSum=db.getAthletedetails()[i].getAthletepoints()+2;
								db.getAthletedetails()[i].setAthletepoints(pointSum);
								}
							if(thirdPlace==db.getAthletedetails()[i].getAthletename()){
								int pointSum= db.getAthletedetails()[i].getAthletepoints();
								pointSum=db.getAthletedetails()[i].getAthletepoints()+1;
								db.getAthletedetails()[i].setAthletepoints(pointSum);
							}
						}
				
						for(int j =0;j<db.getAthletedetails().length;j++){
							System.out.println("Athlete ID:"+db.getAthletedetails()[j].getAthleteID() +" Athlete Name: "+ db.getAthletedetails()[j].getAthletename() + " Points: " + db.getAthletedetails()[j].getAthletepoints());
						}
						mainoption();
						break;
					case 6:
						System.out.println("Exit");
						System.exit(0);
						break;
					}
				}
	
	// Method to Select the Game
			
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
	// Method for User Prediction
	
	public void prediction(){
		
		if(gametype == 'R'){
			System.out.println("EVENT RUNNING");
			System.out.println("------------------------------------");
		}
		else if(gametype == 'S'){
			System.out.println("EVENT SWIMMING");
			System.out.println("------------------------------------");
		}
		else if(gametype == 'C'){
			System.out.println("EVENT CYCLING");
			System.out.println("------------------------------------");
		}
		System.out.println("PLease predict the WINNER ID from the following List of Players");
		System.out.println("The LIST:");
		
		int numberAthlete= ran.nextInt((8-4)+1)+4;
		if(numberAthlete>=4 && numberAthlete<=8)
			{
				db.athleteAdd(gametype,numberAthlete);
				System.out.println("Number of Athletes Participating are "+db.getGameList().size());
				gameListDisplay(db.getGameList());
				System.out.println("");
				System.out.println("Enter the ID number");
				Scanner pre = new Scanner(System.in);
				predictionplayer=pre.nextInt();
				System.out.print("Predicted player is ");
				List currentList = new ArrayList(db.gameList);
				Athlete currentAthlete = (Athlete)currentList.get(predictionplayer);
				System.out.println("Name of Predicted player is "+currentAthlete.getAthletename());
				System.out.println("");
				System.out.println("You will be redirected to the MAIN MENU");
				mainoption();
			}
		else{
				System.out.println("Try again Not Enough Athletes Participaing");
				mainoption();
			}
	}
	
	public void gameListDisplay(Set gameList)
	{
		int a=0;
		for(Athlete at:db.gameList){
			System.out.print(a+") "+"Athlete Name: "+at.getAthletename()+" Athlete State: "+ at.getAthletestate());
			System.out.println(" Athlete Type: " + at.getAthletetype());
			a++;
		}
	}

	// Method for Starting the Game
	
	public void startgame(){
		PlayerRecord play=new PlayerRecord();
			OfficialDatabse od = new OfficialDatabse();
			System.out.println("THE GAME BEGINS");
			char typeathlete ;
			play.listmake();
			hmaprecord=play.getHmaprecord();

			if(gametype=='R')
				{
					typeathlete = 'R';
					od.offdisplay();
					Running run = new Running();
					int flag=0;
					int flag2=0;
					
						for(Athlete at:db.gameList){
							if(flag2==0){
								firstPlace=at.getAthletename();
							flag2++;
							}
							else if(flag2==1 && flag2!=0){
								secondPlace=at.getAthletename();
								
								flag2++;
							}
							else if(flag2==2 && flag!=0 && flag2!=1){
								thirdPlace=at.getAthletename();
								flag2++;
							}
							if(flag==0){
							at.compete(run.getMaxTime(),run.getMinTime());
							flag++;
							}
							}
						
						play.athletewinners(typeathlete,firstPlace, secondPlace, thirdPlace);
						mainoption();
						}
					

			if(gametype == 'S')
			{
					typeathlete = 'R';
					od.offdisplay();
					Swimming run = new Swimming();
					int flag=0;
					int flag2=0;
					
						for(Athlete at:db.gameList){
							if(flag2==0){
							firstPlace=at.getAthletename();
							flag2++;
							}
							else if(flag2==1 && flag2!=0){
								secondPlace=at.getAthletename();
								
								flag2++;
							}
							else if(flag2==2 && flag!=0 && flag2!=1){
								thirdPlace=at.getAthletename();
								flag2++;
							}
							if(flag==0){
							at.compete(run.getMaxTime(),run.getMinTime());
							flag++;
							}
							}
						play.athletewinners(typeathlete,firstPlace, secondPlace, thirdPlace);
						mainoption();
						}
					
				if(gametype=='C')
				{
					typeathlete = 'R';
					od.offdisplay();
					Cycling run = new Cycling();
					int flag=0;
					int flag2=0;
					
						for(Athlete at:db.gameList){
							if(flag2==0){
							firstPlace=at.getAthletename();
							flag2++;
							}
							else if(flag2==1 && flag2!=0){
								secondPlace=at.getAthletename();
								
								flag2++;
							}
							else if(flag2==2 && flag!=0 && flag2!=1){
								thirdPlace=at.getAthletename();
								flag2++;
							}
							if(flag==0){
							at.compete(run.getMaxTime(),run.getMinTime());
							flag++;
							}
							}
						play.athletewinners(typeathlete,firstPlace, secondPlace, thirdPlace);
						mainoption();
					}
				}
			}