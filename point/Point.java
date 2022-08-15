public class Point{
    //declaration des attribue
     private int x;
     private int y;
     Point []t;
    private static double d;
    //declaration des constructeurs 
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    } 
    public Point(int x ,int y){
         this.x=x;
         this.y=y;
         
     }
    public Point(){
        t=new Point[4];
    }
    public double distance(Point p){
    double d;
    d=Math.sqrt((this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()));
    return(d);
    }
    //declaration des methode
    int lentab(){
        return this.t.length;
    }
void initTable(){
            t[0]=new Point(12,5);
            t[1]=new Point(15,2);

}

    void afficher(){
        System.out.println("Point : [x="+x+", y="+y+"]");
    }
    void afficher(Point p){
        System.out.println("Point : [x="+p.x+", y="+p.y+"]");
    }
void afficherEltab(){
    for(int i=0;i<2;i++){

        System.out.println("Point : [x=" + t[i].getX() +", y=" + t[i].getY() +"]");
    }
}
    void deplacer(int dx,int dy){
        x=x+dx;
        y=y+dy;
    }
public static double distance(Point p1,Point p2){
    double d;
    d=Math.sqrt((p1.getX()-p2.getX())*(p1.getX()-p2.getX())+(p1.getY()-p2.getY())*(p1.getY()-p2.getY()));
    return(d);
}
    //main
    public static void main(String[] args) {

//         Point P1 =new Point(4,4);
//         Point P2= new Point(6,7);
//         P1.afficher();
//         P1.afficher(P2);
//         P2.deplacer(4, 3);
//         P2.afficher();
// //        d = P1.distance(P2);
// d=distance(P1, P2);
// System.out.println(d);
Point tab= new Point();
tab.initTable();
tab.t[2]=new Point(100,45);
//int k=tab.t[0].getX();

System.out.println(tab.lentab());
tab.afficherEltab();
//tab.t[0].t[0]=new Point(5, 5);
//tab.t[0].t[1]=new Point(4, 4);    
//tab.t[0].afficherEltab();
    }
}