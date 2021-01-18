
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static Date parseDate(String date) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

	public static void main(String args[]) {
		Date myDate = parseDate("2014-02-14");

		Personne p1 = new Personne("aya1", "aya", "zouay", myDate, "aya@gmal.com");
		Personne p2 = new Personne("Chaima1", "Chaima", "zouay", myDate, "Chaima@gmal.com");
		Personne p3 = new Personne("Amino", "amine", "zouay", myDate, "Chaima@gmal.com");
		Page page1= new Page("News",p1);
		Groupe groupe1=new Groupe("News grp",p1);
		Message msg1 = new Message(myDate,"Happy birthday !!!");
		
		
		p1.EnvoyerDemande(p2);
	//	if(p2.AccepterDemande(p1)) {System.out.println("in accepté");}
		p2.accepterDemande(p1);
		p2.accepterDemande(p3);
		p2.AfficherAmis();
		
		p2.LikerPage(page1);
		
		p2.RejoindreGroupe(groupe1);
		p2.PosterMessage(p1, msg1);
		p1.AfficherMur();
		
		
		

	}

}
