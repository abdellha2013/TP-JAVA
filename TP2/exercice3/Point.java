package exercice3;
public  class Point{
    public String nom;
    private float abscisse;
    private float ordonnee;
    Point(){
        this.nom = "O";
        this.abscisse=0;
        this.ordonnee=0; 
    }
    Point(String nom, float abscisse, float ordonnee){
        this.nom = nom;
        this.abscisse=abscisse;
        this.ordonnee=ordonnee; 
    }

    //getersses setersses
    public float getSbscisse(){
        return this.abscisse;
    }
    public float getOrdonnee(){
        return this.ordonnee;
    }
    public String getNom(){
        return this.nom;
    }
    //---------------------------------------------------------
    public void deplacerX(int longueur){
        this.abscisse += longueur;
    }
    public void deplacerY(int longueur){
        this.ordonnee += longueur;
    }
    @Override
    public String toString(){
        return this.nom+"("+this.abscisse+" , "+this.ordonnee+")";
    }

    //----------------------------------------------------------
    public double distance(Point p){
            return Math.sqrt(Math.pow((this.abscisse-p.abscisse), 2)+Math.pow(this.ordonnee-p.ordonnee, 2));
    }



    


}
