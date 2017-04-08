/*
 * 
 * @ Harmanak Singh
 * 
 */


import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Athlete  {
	
	Database db;
	private int athleteID;
	private String athletename;
	private int athleteage;
	private String athletestate;
	private char athletetype;
	Athlete currentAthlete;
	private int athletepoints;
	
	// Athlete Constructor
	
	public Athlete(int athleteID, String athletename, int athleteage,String athletestate,char athletetype,int athletepoints) {
		this.athleteID = athleteID;
		this.athletename = athletename;
		this.athleteage = athleteage;
		this.athletestate = athletestate;
		this.athletetype=athletetype;
		this.athletepoints=athletepoints;
	}

	public Athlete getCurrentAthlete() {
		return currentAthlete;
	}

	public int getAthletepoints() {
		return athletepoints;
	}
	
	public void setAthletepoints(int athletepoints) {
		this.athletepoints = athletepoints;
	}

	public int getAthleteID() {
		return athleteID;
	}

	public void setAthleteID(int athleteID) {
		this.athleteID = athleteID;
	}

	public String getAthletename() {
		return athletename;
	}

	public void setAthletename(String athletename) {
		this.athletename = athletename;
	}

	public int getAthleteage() {
		return athleteage;
	}

	public void setAthleteage(int athleteage) {
		this.athleteage = athleteage;
	}

	public String getAthletestate() {
		return athletestate;
	}

	public void setAthletestate(String athletestate) {
		this.athletestate = athletestate;
	}

	public char getAthletetype() {
		return athletetype;
	}

	public void setAthletetype(char athletetype) {
		this.athletetype = athletetype;
	}

	public void setCurrentAthlete(Athlete currentAthlete) {
		this.currentAthlete = currentAthlete;
	}
	/* Method Plays the GAME 
	 * Method generates Random Players and Sorts the List to find the Winners.
	 */
	
	public void compete(int max, int min)
	{
		int [] time = new int[20];
		int temp;
		int a=0;
		Random r =new Random();	
			for(int i=0;i<db.gameList.size();i++){
				time[i] = r.nextInt((max-min)+1)+min;
				}
			
			for(int i=0;i<=db.gameList.size();i++){
				int len = db.gameList.size();
				
					for(int j = len-1;j>=0;j--){		
						if(time[j] > time[j+1]){
							temp=time[j];
							time[j]=time[j+1];
							time[j+1]=temp;
							}
						else
							continue;
						}
				}

				System.out.println("GAME FINISHED");
				System.out.println("PLease find below the SCORE BOARD");
				Iterator it = db.gameList.iterator();
				System.out.println("ID            Name           Time");
				System.out.println("------------------------------------");
					while(it.hasNext()){
						currentAthlete = (Athlete)it.next();
						a++;
						System.out.println("");
						System.out.print(currentAthlete.getAthleteID()+ "   -      ");
						System.out.print(currentAthlete.getAthletename()+ "   -    ");
						System.out.println(time[a]);
					}
					System.out.println("");
			}
	}


	

	
	



