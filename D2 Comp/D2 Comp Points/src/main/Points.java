package main;

public class Points {
	
	int kills, assists, deaths, obj, glory, winstreak;
	boolean win;
	WinStreak ws;
	
	public Points (int gloryIn, int killsIn, int assistsIn, int deathsIn, int objIn, boolean isWin, int winstreakIn) {
		glory = gloryIn;
		kills = killsIn;
		assists = assistsIn;
		deaths = deathsIn;
		obj = objIn;
		win = isWin;
		winstreak = winstreakIn;
		ws = new WinStreak(glory, win, winstreak);
	}
	
	public int getGlory() {
		return glory;
	}
	
	public void match() {
		glory += (3 * kills) + assists + (2 * obj);
		glory += ws.pointGain();
		if(win) {
			winstreak++;
		}
		else {
			winstreak = 0;
		}
		glory -= deaths;
	}
	
}
