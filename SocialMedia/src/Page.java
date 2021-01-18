import java.util.ArrayList;
import java.util.List;

public class Page extends Activité {

	String Nom;
	Personne Createur;

	public Page(String nom, Personne createur) {
		super();
		Nom = nom;
		Createur = createur;
	}

	public static List<Personne> Fans = new ArrayList<>();

	void AfficherMembres() {
		for (int i = 0; i < Fans.size(); i++)
			System.out.println(Fans.get(i).getUsername());

	}
}
