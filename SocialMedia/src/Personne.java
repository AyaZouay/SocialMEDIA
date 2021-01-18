import java.util.*;

public class Personne {
	private String username;
	private String Nom;
	private String Prenom;
	private Date dateNaissance;
	private String email;

	public Personne(String username, String nom, String prenom, Date dateNaissance, String email) {
		super();
		this.username = username;
		Nom = nom;
		Prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
	}

	List<Personne> amis = new ArrayList<>();
	List<Personne> InvitationEnvoyé = new ArrayList<>();
	List<Message> Mur = new ArrayList<>();
	List<Page> Pages = new ArrayList<>(); // Liker
	List<Groupe> Groupes = new ArrayList<>();

	void EnvoyerDemande(Personne p) {
		InvitationEnvoyé.add(p);
	};

	Boolean AccepterDemande(Personne p) { // Refuser
		if (AccepterDemande(p)) {
			amis.add(p);
			return true;
		} else
			return false;
	};

	void accepterDemande(Personne p) {

		amis.add(p);

	}

	void AfficherAmis() {
		for (int i = 0; i < amis.size(); i++)
			System.out.println(amis.get(i).username);
	}
	void AfficherMur() {
		for (int i = 0; i < Mur.size(); i++) {
			System.out.println(Mur.get(i).getContenu());
		}
	}

	void LikerPage(Page p) {
		Pages.add(p);
		Page.Fans.add(this);
	}

	void RejoindreGroupe(Groupe g) {
		Groupes.add(g);
		Groupe.Membres.add(this);
	}

	void PosterMessage(Personne p, Message m) { // Poster un message m sur le mur de personne p
		p.Mur.add(m);

	}

	int NombreAmis() {
		return amis.size();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
