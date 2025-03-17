public class NIM {
    public static int[] createGameState (int size, int tokenMax){
        int [] gameState; 
        
        
        for (int i = 0; i < gameState.length; ++i) {
           if (gameState[i] <= tokenMax){
                gameState++;
            }
            else {
                return 0;
            }
        }
        return gameState;

    }


    public static boolean isValidMove(int[] gameState, String row, String takes){
         
    }
}
