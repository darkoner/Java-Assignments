/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Ravinder
 */
public class Game {

    Question[] questions = new Question[3];
    Player player = new Player();

    String[] questionsdata = {"Patanjali is well known for the compilation of –?", "What is the closest planet to Earth?", "What is the capital of Canada?"};
    String[] options1 = {"Yoga Sutra", "Saturn", "Toronto"};
    String[] options2 = {"Panchatantra", "Venus", "Ottwa"};
    String[] options3 = {"Brahma Sutra", "Mercury", "Montreal"};
    String[] options4 = {"Ayurveda", "Jupiter", "Ontario"};
    int[] answers = {4, 3, 2};

    public void initGame() {

        for (int i = 0; i < 3; i++) {
            questions[i] = new Question();
        }

        for (int i = 0; i < 3; i++) {

            questions[i].question = questionsdata[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }

    }

    public void play() {

        player.getDetails();
        for (int i = 0; i < 3; i++) {
            boolean status = questions[i].askQuestion();
            if (status == true) {
                System.out.println("Good one!!");
                player.score = player.score + 5;
            } else {
                System.out.println("Bad one!!");
                player.score = player.score - 5;
            }
        }
        System.out.println(player.name + " Your Score : " + player.score);

    }

}
