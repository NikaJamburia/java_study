package nika;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        players.add(new Player(10, "Nika", 21));
        players.add(new Player(5, "Beqa", 24));
        players.add(new Player(15, "Irakli", 18));
        players.add(new Player(0, "Gio", 22));

        //Collections.sort(players);    //sort with Comparable, default

        //sort with Comparator
        PlayerAgeComparator ageComp = new PlayerAgeComparator();
        PlayerRankComparator rankComp = new PlayerRankComparator();
        //Collections.sort(players, ageComp);
        //Collections.sort(players, rankComp);

        //Comparator with lambda

        Comparator<Player> byRank = (Player p1, Player p2) -> p1.getRanking() - p2.getRanking();
        //Comparator<Player> byRank = Comparator.comparingInt(Player::getRanking);   //--alternate
        Comparator<Player> byAge = (Player p1, Player p2) -> p1.getAge() - p2.getAge();

        Comparator<Player> byName = (Player p1, Player p2) -> p1.getName().compareTo(p2.getName());
        //Comparator<Player> byName = Comparator.comparing(Player::getName);

        Comparator<Player> byNameLen = (Player p1, Player p2) -> p1.getName().length() - p2.getName().length();

        //Collections.sort(players, byRank);
        //or
        players.sort(byNameLen);

        for(Player i : players){
            System.out.println(i.toString());
        }

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Nika", "Jamburia"));
        persons.add(new Person("Levan", "Jamburia"));
        persons.add(new Person("Beqa", "Arabidze"));
        persons.add(new Person("Nika", "Zandukeli"));
        persons.add(new Person("Giorgi", "Krawashvili"));

        Collections.sort(persons);

        System.out.println("///////////////////");
        System.out.println();

        for(Person i : persons){
            System.out.println(i.toString());
        }
    }
}
