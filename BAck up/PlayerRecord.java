/*
 * @Seby Tom Sebastian
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class PlayerRecord {
	Driver dr =new Driver();
	OfficialDatabse od = new OfficialDatabse();
	// Hash Map Declaration
	
	static HashMap<Character, String[]> hmap = new HashMap<Character, String[]>();
	static HashMap<Integer, String> hmaprecord = new HashMap<Integer, String>();
	private String gameID;
	private String firstWinner;
	private String secindWinner;
	private String thirdWinner;
	private String Official;
	
	public static HashMap<Integer, String> getHmaprecord() {
		return hmaprecord;
	}

	public static void setHmaprecord(HashMap<Integer, String> hmaprecord) {
		PlayerRecord.hmaprecord = hmaprecord;
	}

	// Method to load winners to the Hash Map
	public void athletewinners(char type, String firstPlace,String secondPlace, String thirdPlace){
		
				if(type == 'R'){
					hmap.put('R',new String[] {firstPlace,secondPlace,thirdPlace});
				}
				if(type == 'C'){
					hmap.put('C',new String[] {firstPlace,secondPlace,thirdPlace});
				}
				if(type == 'S'){
					hmap.put('S',new String[] {firstPlace,secondPlace,thirdPlace});
				}
		}
	
	// Method to Display the GAME RECORDS and displaying the User Prediction Results 
	
	public void gameResultDisplay(){
		
		System.out.println("THE FINAL RECORD OF GAMES:");
		System.out.println("------------------------------------------");
		int count=1;
		int flag=0;
				Iterator i=hmap.keySet().iterator();
				while(i.hasNext()){
					char key=(Character)i.next();
					String[] value= hmap.get(key);
					System.out.print(count + ")" + key+" The 1st Place: "+value[0]+",   The 2nd Place:"+value[1]+",   The 3rd Place: "+value[2]+ "   ");
					od.officialnamedisplay();
					
				  if(key == dr.predictionplayer){
					flag =1;
				  }
			}	
				
				if(flag==1){
					System.out.println("THE PREDICTION RESULTS:");
					System.out.println("");
					System.out.println("CONGRAGULATIONS");
					System.out.println(""    );
					System.out.println("YOUR PREDICTION IS CORRECT");
				}
				else{
					System.out.println("THE PREDICTION RESULTS:");
					System.out.println("");
					System.out.println("PREDICTION WAS WRONG");
					System.out.println("");
					System.out.println("BETTER LUCK NEXT TIME. THANK YOU");
					}
				dr.mainoption();
		}
		
	// Method to load the Values to Hash Map <Hashmap>
	
	public void listmake(){
		Database dat=new Database();
		int keyvalue=0;
		Athlete [] ath=dat.getAthletedetails();
		for(Athlete i:ath){
		
			hmaprecord.put(keyvalue, i.getAthletename());
			keyvalue++;
		}
		
	}		
	public String getGameID() {
		return gameID;
	}
	public String getFirstWinner() {
		return firstWinner;
	}
	public String getSecindWinner() {
		return secindWinner;
	}
	public String getThirdWinner() {
		return thirdWinner;
	}
	public String getOfficial() {
		return Official;
	}


	

	
}
