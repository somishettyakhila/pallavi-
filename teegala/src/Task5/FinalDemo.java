package Task5;

final class Word {   
    final int number = 10;   

    final void show() {      
        System.out.println("Number = " + number);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Word w = new Word();
        w.show();
    }
}