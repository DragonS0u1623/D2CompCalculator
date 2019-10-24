package main;

import javax.swing.JOptionPane;

public class MainComp {
	
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Current or Fixed System?"), 
				g = JOptionPane.showInputDialog("Current Glory rank in Numbers"), GR;
		Glory sGR;
		int tGlory = 0;
		if(n.equalsIgnoreCase("current")) {
			String w = JOptionPane.showInputDialog("Win or Lose?"),
					s = JOptionPane.showInputDialog("Win streak");
			int glory = Integer.parseInt(g), streak = Integer.parseInt(s);
			boolean win;
			if(w.equalsIgnoreCase("win")) {
				win = true;
				streak++;
			}
			else {
				win = false;
				streak--;
			}
			CurrentSystem c = new CurrentSystem(glory, win, streak);
			tGlory = glory;
			sGR = new Glory(tGlory);
			GR = sGR.getSGlory();
			JOptionPane.showMessageDialog(null, "Your current glory rank is: " + GR + ": " + tGlory);
			c.match();
			tGlory += c.getGlory() - glory;
			sGR = new Glory(tGlory);
			GR = sGR.getSGlory();
			JOptionPane.showMessageDialog(null, "Your current glory rank is: " + GR + ": " + tGlory);
			JOptionPane.showMessageDialog(null, "Your win streak is: " + streak);
			
		}
		else {
			String k = JOptionPane.showInputDialog("Kills per match."),
					a = JOptionPane.showInputDialog("Assists per match."),
					d = JOptionPane.showInputDialog("Deaths per match."),
					o = JOptionPane.showInputDialog("Objective points per match."),
					w = JOptionPane.showInputDialog("Win or Lose?"),
					s = JOptionPane.showInputDialog("Win streak");
			int glory = Integer.parseInt(g), kills = Integer.parseInt(k), assists = Integer.parseInt(a), 
					deaths = Integer.parseInt(d), obj = Integer.parseInt(o), streak = Integer.parseInt(s);
			boolean win;
			if(w.equalsIgnoreCase("win")) {
				win = true;
				streak++;
			}
			else {
				win = false;
				streak = 0;
			}
			Points p = new Points(glory, kills, assists, deaths, obj, win, streak);
			tGlory = glory;
			sGR = new Glory(tGlory);
			GR = sGR.getSGlory();
			JOptionPane.showMessageDialog(null, "Your current glory rank is: " + GR + ": " + tGlory);
			p.match();
			tGlory += p.getGlory() - glory;
			sGR = new Glory(tGlory);
			GR = sGR.getSGlory();
			JOptionPane.showMessageDialog(null, "Your current glory rank is: " + GR + ": " + tGlory);
			JOptionPane.showMessageDialog(null, "Your win streak is: " + streak);
		}
	}
}