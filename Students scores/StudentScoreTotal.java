import java.util.*;

public class StudentScoreTotal {


public static void main(String[] args) {
    
    // Map of student ID and their list of scores
    Map<Integer, List<Integer>> scoresMap = new HashMap<>();
    scoresMap.put(1, Arrays.asList(10, 20, 10));
    scoresMap.put(2, Arrays.asList(10, 20, 11));
    
    // Calculate total score for each student
    Map<Integer, Integer> totalScoreMap = new HashMap<>();
    for (Map.Entry<Integer, List<Integer>> entry : scoresMap.entrySet()) {
        int studentId = entry.getKey();
        List<Integer> scores = entry.getValue();
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        totalScoreMap.put(studentId, totalScore);
    }
    
    // Print the results
    for (Map.Entry<Integer, Integer> entry : totalScoreMap.entrySet()) {
        int studentId = entry.getKey();
        int totalScore = entry.getValue();
        System.out.printf("Student ID %d: Total score %d\n", studentId, totalScore);
    }
}
}
