import java.util.Random;
import java.util.Scanner;

public class L1 {
    private final String[] japVocabs = {"から　きました", "アジア", "イタリア", "インドネシア",
            "オーストラリア", "カメラ", "カンボジア", "こうぎょう", "コーヒー", "じこしょうかい",
            "シャツ", "ジュース", "シンガポール", "スポイン", "ソファー", "タイ",
            "だいがく", "大学", "タイにちこうぎょうだいがく", "タイ日こうぎょう大学", "テーブル", "です",
            "テレビ", "はじめまして", "フィリピン", "ブルネイ", "ベッド", "ベトナム",
            "マレーシア", "ミャンマー", "よろしく　おねがいします", "ラオス", "ロシア"};

    private final String[] engVocabs = {"I came from", "Asia", "Italy", "Indonesia",
            "Australia", "Camera", "Cambodia", "Industry", "Coffee",
            "Self-Introduction", "Shirt", "Juice", "Singapore", "Spain",
            "Sofa", "Thailand", "University", "University", "Thai-Nichi Institute of Technology",
            "Thai-Nichi Institute of Technology", "Table", "To be", "Television", "Nice to meet you",
            "Philippines", "Brunei", "Bed", "Vietnam", "Malaysia", "Myanmar", "Thank you for accepting me",
            "Laos", "Russia"};

    private final String correctFormat = "******** Correct! ********";
    private boolean isPlay;
    private int scoreCount;

    public L1() {
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
        L1 l1 = new L1();
    }
}
