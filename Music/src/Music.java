enum Note {
    MIDDEL_C, C_SHARP, B_FLAT;  // Etc.
}

class Instrument {
    public void play(Note n) {
        System.out.println("Instrument.play()");        
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDEL_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
