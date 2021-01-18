import java.util.*;
public class Message {

	private Date dateCreation;
	private String Contenu;
	Personne auteur;
	
	
	public Message(Date dateCreation, String contenu) {
		super();
		this.dateCreation = dateCreation;
		Contenu = contenu;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getContenu() {
		return Contenu;
	}
	public void setContenu(String contenu) {
		Contenu = contenu;
	}
	
	
	
}
