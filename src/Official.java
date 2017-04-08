/*
 * Harmanak Singh
 */

	import java.util.Set;

	public class Official {

		private String OfficialID;
		private String Officialname;
		private int Officialage;
		private String Officialstate;
		
		Set<Athlete> OffList;
		Athlete currentOfficial;

		public String getID(){
			return OfficialID;
		}
		
		public String getName(){
			return Officialname;
		}
		
		public int getAge(){
			return Officialage;
		}
			
		public String getState(){
			return Officialstate;
		}
		
//	Official Constructor

	public Official(String OffID, String Offname, int Offage, String Offstate) {
			// TODO Auto-generated constructor stub
		OfficialID=OffID;
		Officialname=Offname;
		Officialage=Offage;
		Officialstate=Offstate;

		}

	
		
	}



