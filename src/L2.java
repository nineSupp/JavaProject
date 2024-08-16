import java.util.Random;
import java.util.Scanner;

public class L2 {
    private final String[] japVocabs = {"-さん", "あいさつ", "アメリカ", "ありがとう　ございます",
            "ありがとう", "いいえ", "イギリス", "いち", "一", "いって　ください",
            "いません", "おはよう　ございます", "おわりましょう", "おわります", "かいて　ください", "きいて　ください",
            "きゅう", "九", "きょうかしょ", "く", "クイズ", "ご", "五", "ごめんなさい", "こんにちは", "こんばんは",
            "さようなら", "さん", "三", "し", "四", "しずかに　してください", "しち", "七", "しつもんが　ありますか",
            "じゅう", "十", "しゅくだい", "じゅんび　してください", "すみません", "ゼロ", "零", "せんせい", "そうです",
            "ちがいます", "テスト", "に", "二", "はい", "はじめましょう", "はじめます", "はち", "八", "はなして　ください",
            "みて　ください", "もういちど　おねがいします", "ゆっくり　おねがいします", "よんで　ください", "れんしゅう　してください",
            "ろく", "六", "わかりました", "わかりましたか", "わかりません", "おぼえて　ください", "しつれえ　します", "ばい　ばい",
            "じゃあ　ね", "じゃあ　また", "また　ね", "また　あした", "いらっしゃいませ", "かんぱい", "いただきます", "いって　きます",
            "ただいま", "ごちそうさま", "ごちそうさま　でした", "いって　らっしゃい", "おかえり", "おかえり　なさい", "おやすみ",
            "おやすみ　なさい"};

    private final String[] engVocabs = {"Mr., Ms., Mrs.", "Greeting", "America", "Thank you very much", "Thank you",
            "No", "England", "1", "1", "Please speak", "Absent", "Good morning",
            "That's all for today", "That's all for today", "Please write", "Please listen", "9", "9", "Textbook",
            "9", "Quiz", "5", "5", "I'm sorry", "Good afternoon", "Good evening",
            "Goodbye", "3", "3", "4", "4", "Please be quiet", "7", "7", "Do you have any questions?",
            "10", "10", "Homework", "Please get ready", "Excuse me", "0", "0", "Teacher", "That's right",
            "That's not right", "Test", "2", "2", "Yes", "Let's begin", "Let's begin", "8", "8", "Please talk",
            "Please look", "One more time please", "Please speak slowly", "Please read", "Please practice",
            "6", "6", "I understand", "Do you understand?", "I don't understand", "Please remember",
            "Excuse me (polite)", "Bye bye", "Bye", "Bye", "Bye", "Bye", "Welcome", "Cheers", "I'll enjoy having this",
            "I'm leaving", "I'm back", "Thank you for the meal", "Thank you for the meal (Polite)", "Take care",
            "Welcome back", "Welcome back", "Goodnight", "Goodnight"};

    private final String correctFormat = "******** Correct! ********";
    private boolean isPlay;
    private int scoreCount;

    public L2() {
        this.play();
    }

    private void play() {
        this.isPlay = true;
        this.scoreCount = 0;
        this.game();
    }

    private void game() {
        System.out.println("**** If you want to quit type: quit. **** \n");
        Random rand = new Random();
        int dex = rand.nextInt(this.japVocabs.length);

        while( this.isPlay ) {
            String japWord = this.japVocabs[dex];
            String engWord = this.engVocabs[dex].toLowerCase();
            System.out.println("=".repeat(this.correctFormat.length()));
            System.out.println("Japanese Vocabulary: " + japWord);
            String uInput = this.takeInput();

            boolean isCorrect = this.checkCorrect(engWord, uInput);
            if(isCorrect) {
                this.scoreCount++;
                this.displayCorrect(japWord, engWord);
            }
            else {
                this.scoreCount--;
                this.displayWrong(japWord, engWord);
            }

            dex = rand.nextInt(this.japVocabs.length);
        }

        this.scoreCount++;
        this.displayQuit();
    }

    private String takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter romaji: ");
        String uInput = scanner.nextLine();
        System.out.println("=".repeat(this.correctFormat.length()));
        return uInput;
    }

    private boolean checkCorrect(String engWord, String uInput) {
        if (uInput.equals("quit")) { this.isPlay = false; }
        return engWord.equals(uInput);
    }

    private void displayCorrect(String japWord, String engWord) {
        System.out.println(this.correctFormat);
        System.out.println("\tYour score is: " + this.scoreCount + "\t");
        System.out.println("\t" + japWord + " = " + engWord + "\t");
        System.out.println("*".repeat(this.correctFormat.length()) + "\n");
    }

    private void displayWrong(String japWord, String engWord) {
        String wrongFormat = "********* Wrong! *********";
        System.out.println(wrongFormat);
        System.out.println("\tYour score is: " + this.scoreCount + "\t");
        System.out.println("\t" + japWord + " = " + engWord + "\t");
        System.out.println("*".repeat(wrongFormat.length()) + "\n");
    }

    private void displayQuit() {
        String quitFormat = "********** Quit **********";
        System.out.println(quitFormat);
        System.out.println("\tYour score is: " + this.scoreCount + "\t");
        System.out.println("  Thank you for playing!  ");
        System.out.println("*".repeat(quitFormat.length()) + "\n");
    }

    public static void main(String[] args) {
        L2 l2 = new L2();
    }
}
