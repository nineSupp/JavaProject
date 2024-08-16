import java.util.Random;
import java.util.Scanner;

public class l3 {
    private final String[] japVocabs = {"あかい", "いけ", "いぬ", "いろ", "うえ", "うた", "うなぎ", "うみ", "おか",
            "おとこの ひと", "おばけ", "かぞく", "かわ", "きく", "くも", "けが", "こい", "ごはん", "さけ", "さしみ", "じこ",
            "すし", "せき", "そと", "そば", "そら", "たこやき", "ちかてつ", "てんぷら", "ともだち", "とり", "とんかつ",
            "なに", "ぬる", "ぱちぱち", "はな", "はれ", "ぴかぴか", "ぷかぷか", "ぶた", "ふね", "ぺこぺこ", "へた(な)",
            "ぽかぽか", "ほね", "みそしる", "やきにく", "やま", "ゆめ", "よむ"};

    private final String[] engVocabs = {"red", "pond", "dog", "color", "top", "song", "eel", "sea", "hill",
            "man", "ghost", "family", "river", "chrysanthemum", "cloud", "injury", "carp", "rice", "sake",
            "sashimi", "accident", "sushi", "seat", "outside", "soba", "sky", "takoyaki", "subway", "tempura",
            "friend", "bird", "pork cutlet", "what", "to put", "clapping", "flower", "fine weather", "glitter",
            "sound of smoking", "pig", "ship", "very hungry", "not good at", "warm", "bone", "miso", "grilled meat",
            "mountain", "dream", "to read"};

    private final String correctFormat = "******** Correct! ********";
    private boolean isPlay;
    private int scoreCount;

    public l3() {
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
        l3 l3 = new l3();
    }
}
