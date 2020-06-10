// Define your Question class here:

public class Question{
  // correct answer
  int correctAnswer;
 // Player's answer
  int playerAnswer;

  //id of image displayed to user
  int imageId;
 //question displayed to user
  String questionText;
  //options of question
  String answer0;
  String answer1;
  String answer2;
  String answer3;

  public Question(int imageIdentifier, String questionString, String answerZero, String answerOne, String answerTwo, String answerThree, int correctAnswerIndex){
    imageId = imageIdentifier;
    questionText = questionString;
    answer0 = answerZero;
    answer1 = answerOne;
    answer2 = answerTwo;
    answer3 = answerThree;
    correctAnswer = correctAnswerIndex;
    playerAnswer = -1;
  }
/*public static void main(String[] args){
  
}*/

}
