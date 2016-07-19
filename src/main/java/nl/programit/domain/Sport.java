//Hier bepaal je een nieuwe tabel in je database, welke kolommen er in moeten
package nl.programit.domain;

//persistence laag heeft te maken met het behouden van data
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//hiermee geef je aan dat het in een database moet
@Entity

public class Sport {
	//we genereren een automatisch nummer voor het id
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String land;
	private int highscore;
	private String sportNaam;
	// als je @transient gebruikt komen die velden NIET in de database
	// dus dat is voor vergankelijke informatie
	
	public int getId() {
		return id;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public int getHighscore() {
		return highscore;
	}
	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
	public String getSportNaam() {
		return sportNaam;
	}
	public void setSportNaam(String sport) {
		this.sportNaam = sport;
	}
	
	

}
