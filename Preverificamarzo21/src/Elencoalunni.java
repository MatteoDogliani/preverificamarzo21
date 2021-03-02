import java.util.ArrayList;

public class Elencoalunni extends ArrayList <Alunno> {
	public ArrayList<Alunno> Elencoalunni(){
		ArrayList<String> l=new ArrayList<String>();
		for(int i=0;i<this.size();i++) {
			l.add(this.get(i).toString());
		}
		return l;
}
