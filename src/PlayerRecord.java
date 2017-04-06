import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;




public class PlayerRecord {
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
	
	public void ttdisplay()
	{
		System.out.println("The Final Results for the Games are:");
		
				Iterator i=hmap.keySet().iterator();
				while(i.hasNext()){
					char key=(Character) i.next();
					String[] value= hmap.get(key);
					System.out.println(key+"......"+value[0]+"....."+value[1]+"....."+value[2]);
				}		

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
	
//	public void PlayerReocrdDisplay(){
//		
//		for(String[] s: hmap.values())
//	}
	
}
