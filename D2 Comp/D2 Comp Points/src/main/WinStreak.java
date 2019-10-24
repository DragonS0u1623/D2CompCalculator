package main;

public class WinStreak {
	
	int glory, winStreak, pointG, index1, index2; boolean win;
	String sG;
	Glory GR;
	int[][] winStreakV = {
			{-60, 80, 100, 120, 140, 16},
			{-60, 68, 88, 108, 136, 148},
			{-52, 60, 80, 100, 128, 140},
			{-60, 40, 60, 80, 108, 120},
			{-68, 40, 60, 80, 108, 120},
	};
	
	
	public WinStreak(int gloryIn, boolean isWin, int winStreakIn) {
		glory = gloryIn;
		win = isWin;
		winStreak = winStreakIn;
		GR = new Glory(glory);
		sG = GR.getSGlory();
	}
	
	public int pointGain() {
		getGains();
		pointG = winStreakV[index1][index2];
		return pointG;
	}
	
	public void getGains() {
		if(sG.contains("Guardian")) {
			index1 = 0;
		}
		if(sG.contains("Brave")) {
			index1 = 1;
		}
		if(sG.contains("Heroic")) {
			index1 = 2;
		}
		if(sG.contains("Fabled")) {
			index1 = 3;
		}
		else {
			index1 = 4;
		}
		if(win) {
			if(winStreak <= 1) {
				index2 = 1;
			}
			if(winStreak == 2) {
				index2 = 2;
			}
			if(winStreak == 3) {
				index2 = 3;
			}
			if(winStreak == 4) {
				index2 = 4;
			}
			if(winStreak >= 5) {
				index2 = 5;
			}
		}
		else {
			index2 = 0;
		}
	}
	
}
