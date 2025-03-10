import javax.security.auth.spi.LoginModule;

public class Komplex {
    public double x;   // reelteil
    public double y; // immaginer teil

    public Komplex(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
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
        return x +" + "+ y + "i";
        //return String.format("%.1f, %.1fi", x,y);
    }

    public double getBetrag(){
        return Math.sqrt(x*x + y*y);
    }


    //sqrt(z) = |z| * e ^( i*theta / 2) =  r * ( cosa + i sina )
    public Komplex[] getWurzel(){
        if(x == 0 && y == 0)
            return new Komplex[]{new Komplex(0,0), new Komplex(0,0)};

        // Betrag und Argument berechnen
        double betrag = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        // Quadratwurzel des Betrags
        double sqrtBetrag = Math.sqrt(betrag);

        // Berechnung der beiden Wurzeln
        double theta1 = theta / 2;
        double theta2 = theta1 + Math.PI; // zweite Lösung um π verschoben

        Komplex w1 = new Komplex(sqrtBetrag * Math.cos(theta1), sqrtBetrag * Math.sin(theta1));
        Komplex w2 = new Komplex(sqrtBetrag * Math.cos(theta2), sqrtBetrag * Math.sin(theta2));
        return new Komplex[]{w1,w2};
    }

    public Komplex getSumme(Komplex z){
        return new Komplex(x+z.x, y+z.y);
    }

    public Komplex getProdukt(Komplex z){
        return new Komplex(x*z.x - y*z.y, x*z.y + y*z.x);
    }
}
