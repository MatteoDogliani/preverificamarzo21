import javax.swing.ImageIcon;

public class Alunno {
	private String nome;
	private String cognome;
	private String classe;
	private ImageIcon im;
	private String path;
	public Alunno(String nome, String cognome, String classe, ImageIcon im,String path) {
		this.nome=nome;
		this.cognome=cognome;
		this.classe=classe;
		this.im=im;
		this.path=path;
	
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public ImageIcon getIm() {
		return im;
	}
	public void setIm(ImageIcon im) {
		this.im = im;
	}
	public String toString() {
		return cognome+","+nome+","+classe+""
				+ "path";
	}
	
}
