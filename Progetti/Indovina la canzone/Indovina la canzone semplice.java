import javax.sound.sampled.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class SimpleSongGuess {

    // Elenco delle canzoni disponibili.
    private static final String[] songs = {
        "C:\\Users\\W\\Desktop\\JAVA\\Progetti\\Indovina la canzone\\Canzoni\\mother.wav",
        // Aggiungi qui altri percorsi di canzoni
    };

    public static void main(String[] args) {
        try {
            // Seleziona una canzone a caso.
            String selectedSong = selectRandomSong();
            File songFile = new File(selectedSong);
            
            if (!songFile.exists()) {
                System.err.println("Il file della canzone non esiste.");
                return; // Termina il programma se il file non esiste.
            }
            
            // Prepara e avvia la riproduzione della canzone.
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(songFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Riproduzione: " + selectedSong);
            
            // Imposta un timer per limitare il tempo di risposta a 10 secondi.
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    try {
                        clip.stop(); // Ferma la riproduzione.
                        System.out.println("Tempo scaduto! Inserisci il nome della canzone:");
                        
                        // Leggi la risposta dell'utente.
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        String userGuess = reader.readLine().trim().toLowerCase();
                        
                        // Verifica se la risposta è corretta.
                        if (userGuess.equals(songFile.getName().toLowerCase().replace(".wav", ""))) {
                            System.out.println("Corretto!");
                        } else {
                            System.out.println("Sbagliato. Era: " + songFile.getName());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }, 10000);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace(); // Stampa l'errore se qualcosa va storto durante la riproduzione.
        }
    }

    // Metodo per selezionare una canzone casuale dall'array.
    private static String selectRandomSong() {
        return songs[new Random().nextInt(songs.length)];
    }
}
