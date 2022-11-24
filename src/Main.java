public class Main {
    public static void main(String[] args) {
        HavingSuperAbility heroes[] = {new Medic(),new Warriror(),new Magic()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}