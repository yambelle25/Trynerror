public class StudentScanner {
    
        private String name;
        private int[]scores = new int [3]; // Array for Math, Science, and English scores
        private double averageScore;
    
     
        public StudentScanner(String name, int mathscore, int sciencescore, int englishscore) {
            this.name = name;
            this.scores[0] = mathscore;
            this.scores[1] = sciencescore;
            this.scores[2] = englishscore;
        }
    
    
        public String getName() {
            return name;
        }
    
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int[] getScores() {
            return scores;
        }
    
    
        public void setScores(int[] scores) {
            this.scores = scores;
        }
    
    
        public double calculateAverage() {
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            this.averageScore = sum / scores.length;
            return this.averageScore;
        }
    
        // assign a grade 
        public char assignGrade() {
            if (averageScore >= 90) {
                return 'A';
            } else if (averageScore >= 80) {
                return 'B';
            } else if (averageScore >= 70) {
                return 'C';
            } else if (averageScore >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        }
    }
    

