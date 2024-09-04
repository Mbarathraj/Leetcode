import java.util.HashSet;
import java.util.Set;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Direction vectors: N, E, S, W
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // Direction index: N(0), E(1), S(2), W(3)
        int directionIndex = 0;
        
        // Set to store obstacles for O(1) lookup
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }
        
        int x = 0, y = 0;
        int maxDistanceSquared = 0;
        
        for (int command : commands) {
            if (command == -1) { // Turn right
                directionIndex = (directionIndex + 1) % 4;
            } else if (command == -2) { // Turn left
                directionIndex = (directionIndex + 3) % 4; // Equivalent to -1
            } else { // Move forward
                for (int step = 0; step < command; step++) {
                    int newX = x + directions[directionIndex][0];
                    int newY = y + directions[directionIndex][1];
                    
                    // Check if the next position is an obstacle
                    if (obstacleSet.contains(newX + "," + newY)) {
                        break;
                    }
                    
                    // Move to the new position
                    x = newX;
                    y = newY;
                    
                    // Calculate the maximum distance squared
                    maxDistanceSquared = Math.max(maxDistanceSquared, x * x + y * y);
                }
            }
        }
        
        return maxDistanceSquared;
    }
}
