public class Jhava {
    private int hitPoints = 52489112;
    private String greeting;

    public static void main(String[] args) {
        System.out.println(Hero.makeProclamation());
    }

    public String utterGreeting() {
        return "BLARGH";
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String determineFriendshipLevel() {
        return null;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
