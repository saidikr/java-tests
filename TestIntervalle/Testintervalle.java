class Intervalle{
    private int x;
    private int y;    
    public Intervalle(int x,int y){
        if(x<y){
        this.setX(x);
        this.setY(y);}
        else System.out.println("y est inferieur a x");
        
    }
    public Intervalle(Intervalle l){
        this.setX(l.getX());
        this.setY(l.getY());
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int largeur(){
        int lrg;
        lrg=(this.y)-(this.x);
        return lrg;
    }
   public boolean inclus(double a){
        boolean b=false;
        if(a<=this.y && a>=this.x){
            b=true;
        }
        return b;
    }
    public boolean inclus(Intervalle v){
        boolean c=false;
        if((v.getX()>=this.x && v.getX()<=this.y ) && (v.getY()>=this.x && v.getY()<=this.y )){
            c=true;
        }
        return c;
    }


@Override
public String toString(){
    return ("Intervale [x=" + this.x + ", y" + this.y + "]");
}






public class Testintervalle{
   public static void main(String[] args) {
    int lrg;
    Intervalle i1 =new Intervalle(2, 10);
    Intervalle i2 =new Intervalle(4, 6);
    System.out.println(i1.toString());
    System.out.println(i1.largeur());
    System.out.println(i1.inclus(5));
    System.out.println(i2.inclus(i1));
    System.out.println(i2.getX());
   } 
}
}