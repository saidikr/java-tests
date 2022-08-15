class Livre{
//declaration des attribue
private int code;
private String titre;
//constructor
public Livre (int code,String titre){

    this.titre=titre;
    this.code=code;
}
//getters et setters
public int getCode(){
    return(this.code);
}
public String getTitre(){
    return(this.titre);
}
public void setCode(int code) {
    this.code = code;
}
public void setTitre(String titre){
    this.titre=titre;
}
}


class Persone{
    //les attr
    private String nom;
    private int numcarte;
    private Livre li;
    public Persone(String nom,int numcarte){
        this.nom=nom;
        this.numcarte=numcarte;
    }
    //setters et getters

    public Livre getLi(){
        return this.li;
    }
    public void setLi(Livre li){
        this.li=li;
    }
    public String getNom(){
        return this.nom;
    }
    public int getNumcarte(){
        return this.numcarte;
    }

    public void setNom(String nom){
        this.nom=nom;
    }
    public void setNumcarte(int numcarte) {
        this.numcarte = numcarte;
    }

}

public class TestLivrePersone{
 public static void main(String[] args) {
    Livre L=new Livre(111,"prog poo");
    Livre L2=new Livre(122,"prog procedural");
    Persone p=new Persone("said", 0005);
    p.setLi(L);
    System.out.println(p.getLi().getTitre());



}

}