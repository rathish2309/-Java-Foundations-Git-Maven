package PolyMorphism.MethodOverloading;

class PlayerRating {
    private int playerPosition;
    private String playerName;
    private float criticOneRating;
    private float criticTwoRating;
    private float criticThreeRating;
    private float averageRating;
    private char category;

    public PlayerRating(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating) {
        averageRating = (criticTwoRating) + (criticOneRating - criticTwoRating) / 2;
        calculateCategory(averageRating);
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating) {
        averageRating = (criticThreeRating + criticOneRating + criticTwoRating) / 3;
        calculateCategory(averageRating);
    }

    public void calculateCategory(float averageRating) {
        if (averageRating > 8) {
            this.category = 'A';
        } else if (averageRating > 5 && averageRating <= 8) {
            this.category = 'B';
        }
        else if (averageRating > 0 && averageRating <= 5) {
            this.category = 'C';
        }
    }

    public void display(){
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Position: " + playerPosition);
        System.out.println("Category: " + category);
    }

}

//Method Overloading
public class Runner {
    public static void main(String[] args) {

        //2 critics
        PlayerRating playerRating1 = new PlayerRating(1,"Beckham");
        playerRating1.calculateAverageRating(9,9.9f);
        playerRating1.display();

        //3 critics
        PlayerRating playerRating2 = new PlayerRating(1,"Beckham");
        playerRating2.calculateAverageRating(1,1,1);
        playerRating2.display();
    }
}
