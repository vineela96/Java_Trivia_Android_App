public class AndroidOS {
    public AndroidOS() {
        System.out.println("AndroidOS Booting Up...");
    }

    public void runQuizApp() {
        // Create three questions here
        Question question1 = new Question( 921238, "How tall is the Eiffel tower?","1024 ft","1063 ft","1124 ft","1163 ft",1);

        System.out.println("Question 1: " + question1.questionText);
        System.out.println("1 ." + question1.answer0);
        System.out.println("2 ." + question1.answer1);
        System.out.println("3 ." + question1.answer2);
        System.out.println("4 ." + question1.answer3);
         
    }

    public static void main(String[] args) {
        System.out.println("Starting: AndroidOS");
        AndroidOS androidOS = new AndroidOS();
        androidOS.runQuizApp();
      
    }
}
