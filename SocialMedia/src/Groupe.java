import java.util.ArrayList;
import java.util.List;

public class Groupe extends Activité {

	String Nom;
	Personne Createur;

	public static List<Personne> Membres = new ArrayList<>();

	public Groupe(String nom, Personne createur) {
		super();
		Nom = nom;
		Createur = createur;
	}

	void AfficherMembres() {
		for (int i = 0; i < Membres.size(); i++)
			System.out.println(Membres.get(i).getUsername());

	}

}
