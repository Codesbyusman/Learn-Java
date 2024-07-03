import java.util.Arrays;

public class Lesson10 {

    public static void main(String[] args)
    {

        Monster.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName[4];

        Monster[] Monsters = new Monster[4];

        // MonsterTwo(int health, int attack, int movement, String name)

        Monsters[0] = new Monster(1000, 20, 1, "Frank");
        Monsters[1] = new Monster(500, 40, 2, "Drac");
        Monsters[2] = new Monster(1000, 20, 1, "Paul");
        Monsters[3] = new Monster(1000, 20, 1, "George");

        Monster.redrawBoard();

    }


}
