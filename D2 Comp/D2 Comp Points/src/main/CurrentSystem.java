package main;

public class CurrentSystem {
	
	int glory, winStreak;
	boolean win;
	WinStreak ws;
	
	public CurrentSystem(int gloryIn, boolean isWin, int winStreakIn) {
		glory = gloryIn;
		win = isWin;
		winStreak = winStreakIn;
		ws = new WinStreak(glory, win, winStreak);
	}
	
	public int getGlory() {
		return glory;
	}
	
	public void match() {
		glory += ws.pointGain();
		if(win) {
			winStreak++;
		}
		else {
			winStreak = 0;
		}
	}
}
