package SessionOne.FIFA2026;

//Template - Blueprint
public class Player {
    //attributes - الصفات - variables
    //Players > name - age - skills - number - team - position

    //access modifiers > public - private - protected - none (default)

    public String playerName;
    public int playerAge;
    public double playerSkills;
    public int playerNumber;
    private String playerTeam;
    public String playerPosition;
    public char favLeg;

    //default (empty) Constructor
    public Player()
    {

    }

    //parameterized Constructor
    public Player(String playerName,int playerAge, double playerSkills, int playerNumber, String playerTeam,String playerPosition,char favLeg)
    {
        this.playerName = playerName; //ronaldo.playerName ="Ronaldo";
        this.playerAge = playerAge;
        this.playerSkills = playerSkills;
        this.playerNumber = playerNumber;
        this.playerTeam=playerTeam;
        this.playerPosition = playerPosition;
        this.favLeg = favLeg;

    }



    //methods - الأفعال (functions)

    protected void getPlayerInfo()
    {
        System.out.println("*** Player Info ***");
        System.out.println("Player Name: " + playerName );
        System.out.println("Player Age: " + playerAge );
        System.out.println("Player Skills: " + playerSkills );
        System.out.println("Player Number: " + playerNumber );
        System.out.println("Player Team: " + playerTeam );
        System.out.println("Player Position: " + playerPosition );
        System.out.println("Fav Leg: " + favLeg);
        System.out.println("//////////////////////////////////////////////");
    }
    public void shot()
    {
        System.out.println(playerName + " Shoooooot");
    }

    public void pass()
    {
        System.out.println(playerName + " Paaaaaaass");
    }


}
