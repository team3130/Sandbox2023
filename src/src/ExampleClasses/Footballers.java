package ExampleClasses;

public class Footballers {
    public String footballerName;
    public int primeYear;
    public String primeClub;
    public int championsLeagues;
    public int goals;
    public int assists;
    public String nationalTeam;

    public Footballers(String name, int Goals, int Assists, String Nation, int UCL, int PrimeYear, String PrimeClub) {
        this.footballerName = name;
        this.goals = Goals;
        this.assists = Assists;
        this.nationalTeam = Nation;
        this.championsLeagues = UCL;
        this.primeYear = PrimeYear;
        this.primeClub = PrimeClub;
    }

    public String getFootballerName() {
        return footballerName;
    }
    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getChampionsLeagues() {
        return championsLeagues;
    }

    public int getPrimeYear() {
        return primeYear;
    }

    public String getPrimeClub() {
        return primeClub;
    }

    public static void main(String [] args) {
        Footballers Neymar = new Footballers("Neymar Jr.", 434, 238, "Brazil", 1, 2015, "Barcelona");
        Footballers Messi = new Footballers("Lionel Messi", 704, 318, "Argentina", 4, 2012, "Barcelona");
        Footballers Ronaldo = new Footballers("Cristisano Ronaldo", 827, 257, "Portugal", 5, 2017, "Real Madrid");
    }
}


