public class Komplex {
    public int x;   // reelteil
    public int y; // immaginer teil

    public Komplex(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void addiere(Komplex z){
        x = x + z.x;
        y = y + z.y;
    }
    public void print(){
        System.out.println("z:" + x +"+"+y+"i");
    }

    public void multipliziere(Komplex z){
        Komplex temp = new Komplex(0,0);

        temp.x = x*z.x - y*z.y;
        temp.y = x*z.y + y*z.x;

        x = temp.x;
        y = temp.y;
    }

    @Override
    public String toString(){
        return "z:" + x +"+"+y+"i";
    }
    public double getBetrag(){
        return Math.sqrt(x*x + y*y);
    }

/*
    public Komplex[] getWurzel(){

    }
*/


}
