package nika;

public class Player implements Comparable<Player> {
    private int ranking;
    private String name;
    private int age;

    public Player(int r, String n, int a){
        ranking = r;
        name = n;
        age = a;
    }

    public int getRanking(){return ranking;}
    public String getName(){return name;}
    public int getAge(){return age;}

    public void setRanking(int r){ranking = r;}
    public void setName(String n){name = n;}
    public void setAge(int a){age = a;}

    public String toString(){
        return name + " Rank: "+ ranking + " Age: " + age;
    }

    @Override
    public int compareTo(Player o) {
        return (this.getRanking() - o.getRanking());
    } //--Default
}
