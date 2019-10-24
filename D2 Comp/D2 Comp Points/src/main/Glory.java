package main;

public class Glory {
	
	int glory, sGlory;
	int[] gloryRank = {40, 110, 200, 370, 665, 1050, 1260, 1625, 2100, 1380, 2870, 3500, 3880, 4545, 5450};
	String[] sGloryRank = {"Guardian I", "Guardian II", "Guardian III", "Brave I", "Brave II", "Brave III", 
			"Heroic I", "Heroic II", "Heroic III", "Fabled I", "Fabled II", "Fabled III", "Mythic I", "Mythic II", "Mythic III",
			"Legend"};
	
	public Glory(int gloryIn) {
		glory = gloryIn;
		for(int i = 0; i < gloryRank.length; i++) {
			if(glory < gloryRank[i] && glory >= gloryRank[i-1]) {
				sGlory = i - 1;
			}
			if(glory < 40) {
				sGlory = 0;
			}
		}
	}
	
	public String getSGlory() {
		return sGloryRank[sGlory];
	}
	
}
