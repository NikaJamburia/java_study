package nika;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return (o1.getAge() - o2.getAge());
    }
}

class PlayerRankComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return (o1.getRanking() - o2.getRanking());
    }
}

class PlayerNameComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}

