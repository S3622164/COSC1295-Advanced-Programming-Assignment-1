import java.util.*;
public class Driver {

	static Athlete currentAthlete;
	public Database db=new Database();	
	static Ozlympics oz=new Ozlympics();
	static String n1=null,n2=null,n3=null;
	
	
	public static  HashMap<Integer, String> hmaprecord=new HashMap<Integer, String>();
	public static HashMap<Integer, String> hmaprecord2=new HashMap<Integer, String>();
	
	
	public void mainoption()
	{
		
		
		PlayerRecord pr=new PlayerRecord();
		
		
			System.out.println("Ozlympic Game");
			System.out.println("======================");
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
					
					selectgame();
				
					break;
				case 2:
					System.out.println("Predict	the winner of the game");
					break;
				case 3:
					System.out.println("Start the game");
					break;
				case 4:
					System.out.println("Display	the final results of all games");
					
					pr.ttdisplay();	
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
							x=db.getAthletedetails()[i].getpoints()+3;
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
			
	
	
	public static void selectgame(){
		Random ran=new Random();
		Database db=new Database();
		PlayerRecord play=new PlayerRecord();
		 
		

		System.out.println("Enter the no of participants for the Game");
		Scanner sc2 = new Scanner(System.in);
		int option2=sc2.nextInt();
		
		System.out.println(" Please select the type of game you would like to play");
		System.out.println("1. Running");
		System.out.println("2. Swimming");
		System.out.println("3. Cycling");
		char typeathlete;
		
		Scanner sc3= new Scanner(System.in);
		int option3 = sc3.nextInt();
		play.listmake();
		hmaprecord=play.getHmaprecord();
	
			switch(option3)
			{
			case 1:
			//Running game
				
				
				 typeathlete = 'R';
			
				System.out.println("The Running Game has been selected");
				if(option2 >= 4)
				{
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
}

				
				
				play.tt(typeathlete,n1, n2, n3);
				oz.main(null);
				break;
				
			case 2:
				//swimming
				 typeathlete = 'S';
				System.out.println("The Running Game has been selected");
				if(option2 >= 4)
				{
					db.gameList=db.athleteLoad(typeathlete, option2);
					System.out.println("Gamesize" + db.gameList.size());
					System.out.println("---------");
					
					Swimming run = new Swimming();
					int flag=0;
					int flag2=0;
					for(Athlete at:db.gameList){
						if(flag2==0){
						n1=at.getName();
						flag2++;
						}
						else if(flag2==1 && flag!=0){
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
					
				}
				
				play.tt(typeathlete,n1, n2, n3);
				break;
				
			case 3:
				//cycling
				 typeathlete = 'C';
					System.out.println("The Running Game has been selected");
					
					
					if(option2 >= 4)
					{
						db.gameList=db.athleteLoad(typeathlete, option2);
						System.out.println("Gamesize" + db.gameList.size());
						System.out.println("---------");
						
						Cycling run = new Cycling();
						int flag=0;
						int flag2=0;
						for(Athlete at:db.gameList){
							if(flag2==0){
							n1=at.getName();
							flag2++;
							}
							else if(flag2==1 && flag!=0){
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
						
					}
					
					play.tt(typeathlete,n1, n2, n3);
					break;
			default:
				System.out.println("Please enter a valid number");
			}
			oz.main(null);
			
		}
		
	}
	




