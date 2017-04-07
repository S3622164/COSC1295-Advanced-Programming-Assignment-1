import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;




public class PlayerRecord {
	
	Driver dr =new Driver();
	public static HashMap<Integer, String> getHmaprecord() {
		return hmaprecord;
	}

	public static void setHmaprecord(HashMap<Integer, String> hmaprecord) {
		PlayerRecord.hmaprecord = hmaprecord;
	}
	static HashMap<Character, String[]> hmap = new HashMap<Character, String[]>();
	static HashMap<Integer, String> hmaprecord = new HashMap<Integer, String>();
	private String gameID;
	private String firstWinner;
	private String secindWinner;
	private String thirdWinner;
	private String Official;
	
	
//				public void tt(char type, String n1,String n2, String n3){
//				
//					hmap.put(type,new String[] {n1,n2,n3});
//					System.out.println("The Final Results fo the Games are:");
//					for(String s[]:hmap.values()){
//					System.out.println("  " + type + "   First Place: " + s[0]+" Second Place: "+s[1]+" Third PLace: "+s[2]);
//				}
//			
//			}
	
	public void tt(char type, String n1,String n2, String n3){
		
		if(type == 'R'){
			hmap.put('R',new String[] {n1,n2,n3});
		}
		if(type == 'C'){
			hmap.put('C',new String[] {n1,n2,n3});
		}
		if(type == 'S'){
			hmap.put('S',new String[] {n1,n2,n3});
		}
		
	
		
		
		
	}
	
	public void gameResultDisplay()
	{
		
		System.out.println("THE FINAL RECORD OF GAMES:");
		System.out.println("------------------------------------------");
		int a=1;
	//	int flag=0;
				Iterator i=hmap.keySet().iterator();
				
				while(i.hasNext()){
					char key=(Character) i.next();
					String[] value= hmap.get(key);
					System.out.println(a + ")" + key+" The 1st Place "+value[0]+" The 2nd Place"+value[1]+" The 3rd Place"+value[2]);
//				if(value[0] == dr.predictionplayer)
//				{
//					flag =1;
//				}
				}	
				
//				if(flag==1)
//				{
//					System.out.println("CONGRAGULATIONS");
//					System.out.println(""    );
//					System.out.println("YOU WON THE PREDICTION");
//				}
//				else{
//					System.out.println("");
//					System.out.println("BETTER LUCK NEXT TIME. THANK YOU");
//					System.out.println("");
//					
//				}
//				
				System.out.println("");
				System.out.println("");
				System.out.println("***************************");
				System.out.println("*        THE END          *");
				System.out.println("***************************");

	}
				
	public void listmake(){
		Database dat=new Database();
		int j=0;
		Athlete [] ath=dat.getAthletedetails();
		for(Athlete i:ath){
			hmaprecord.put(j, i.getName());
			j++;
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
