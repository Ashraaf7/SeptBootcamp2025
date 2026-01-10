package SessionOne.FIFA2026;

public class FIFAWithOOP {

    public static void main(String[] args) {
        Player ronaldo = new Player("Ronaldo",38,99.7,7,"El-Nasr","FW",'R');
        Player moSalah = new Player("Mohamed Salah",36,10,11,"Liverpool", "RW",'L');



        //ronaldo.playerTeam = "Real-M";
        ronaldo.getPlayerInfo();
        System.out.println(ronaldo.favLeg);
        moSalah.getPlayerInfo();


        Player ahmed = new Player();
        ahmed.getPlayerInfo();
        ahmed.playerName = "Ahmed";
    }
}
