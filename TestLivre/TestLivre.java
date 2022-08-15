class Livre{
//declaration des atr
private int code;
private String title;
private String author;

public Livre(int code,String title,String author){
    
    this.author=author;
    this.code=code;
    this.title=title;

}

public void setCode(int code){
    this.code=code;
}
public int getCode() {
    return code;
}
public void setAuthor(String author) {
    this.author = author;
}
public String getAuthor() {
    return author;
}
public void setTitle(String title) {
    this.title = title;
}
public String getTitle() {
    return title;
}

}
class Personne{
    int id;
    int age;
    String nom;
    Livre li;
    public Personne(int id,int age,String nom){
        this.age=age;
        this.id=id;
        this.nom=nom;
    }
    public void setLi(Livre li) {
        this.li = li;
    }
    public Livre getLi() {
        return li;
    }
    public void afficher(){
        System.out.println("id = "+id+" age = "+age+" nom = "+nom+" Livre = "+li.getTitle());
    }


}

public class TestLivre{
   public static void main(String[] args){
    System.out.println("hello");
    Livre l1=new Livre(001, "poo java", "mouloud");
    Livre l2=new Livre(002, "poo phy", "saidou");
    Personne said=new Personne(01, 24, "said");
    said.setLi(l1);
    said.afficher();


   } 
}