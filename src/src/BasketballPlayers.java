public class BasketballPlayers {
    // INSATANCE VARIBLES
    String name;
    double height ;
    int careerPoints;
    int MVPs;
    // CONSTRUCTOR
    public BasketballPlayers(String n, double h, int c, int m){
        this.name = n;
        this.height = h;
        this.careerPoints = c;
        this.MVPs = m;
    }
    // METHODS
    public double getcareerPoints(){
        return careerPoints;
    }
    public int getMVPs(){
        return MVPs;
    }
    public void setHeight (double tall){
        height = tall;
    }
    public void setName (String name){
        name = playersname;
    }
    {
        System.out.println("Henry Vial is good at basketball");
    }
    {
        System.out.println("Trey is Trey is trash at basketball");
    }
    public static void main(String[] args){
             BasketballPlayers Mohnish = new BasketballPlayers("Mohnish Nanthakumar" , 4.2 , 2000000 , 0);
             BasketballPlayers Henry = new BasketballPlayers("Henry Vial" , 7.7 , 2 ,20);
             BasketballPlayers Michael = new BasketballPlayers("Michael Jordan" , 6.6 , 32292 , 5);
             BasketballPlayers Winston = new BasketballPlayers("Winston" , 2.3 , 200 , 0);
    }
}