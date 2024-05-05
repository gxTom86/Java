import javax.sound.sampled.AudioInputStream;
//Serve per creare uno stream di input che consente al programma di leggere dati audio da un file. Questo è 
//fondamentale per poter elaborare e riprodurre file audio all'interno dell'applicazione.

import javax.sound.sampled.AudioSystem;
//Fornisce metodi utili per accedere alle risorse audio del sistema, 
//come la possibilità di ottenere un Clip per la riproduzione di un frammento audio o un AudioInputStream per leggere il file audio.

import javax.sound.sampled.Clip;
//Rappresenta un frammento audio che può essere precaricato nella memoria e riprodotto. Questo consente al programma di avviare e fermare la riproduzione di un suono in modo controllato.

import javax.sound.sampled.LineUnavailableException;
//Indica che una linea audio richiesta non è disponibile, per esempio a causa della mancanza di supporto del sistema o dell'occupazione delle risorse audio da parte di un'altra applicazione.

import javax.sound.sampled.UnsupportedAudioFileException;
//Viene lanciata quando si tenta di aprire un file audio in un formato non supportato, segnalando che il tipo di file audio è incompatibile con le capacità di decodifica audio del sistema.

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Sono utilizzati insieme per leggere l'input testuale dall'utente in modo efficiente. 
//InputStreamReader trasforma i byte dell'input stream in caratteri, mentre BufferedReader permette di leggere questi caratteri (o righe di testo) in modo efficiente.

import java.io.File;
//Rappresenta il percorso di un file o di una directory. 
//Nel contesto del programma, viene usato per specificare il percorso del file audio da riprodurre.

import java.io.IOException;
//Cattura errori di input/output che possono verificarsi durante la lettura dal file system o dall'input dell'utente, 
//garantendo che il programma possa gestire questi eventi senza arrestarsi inaspettatamente.

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class IndovinaLaCanzoneConAudio {

    private static final String[] canzoni = {
        "C:\\Users\\W\\Desktop\\JAVA\\Progetti\\Indovina la canzone\\Canzoni\\mother.wav",
        // Aggiungi altri percorsi di file qui
    };
    private static String canzoneSelezionata = ""; // Rendi la variabile accessibile a livello di classe

    public static void main(String[] args) {
        try {
            
            //Selezione e Riproduzione della Canzone

            canzoneSelezionata = selezionaCanzoneCasuale();//Questa linea chiama il metodo selezionaCanzoneCasuale() per ottenere il percorso di una canzone casuale da un array predefinito di percorsi di file musicali.
            File fileCanzone = new File(canzoneSelezionata);//Crea un oggetto File per il percorso della canzone selezionata, che verrà utilizzato per verificare l'esistenza del file e per leggerlo.
            if (fileCanzone.exists()) {//Verifica se il file della canzone esiste. Se esiste, procede con la riproduzione; altrimenti, stampa un messaggio di errore.
                
                //Gestione Audio

                AudioInputStream audioStream = AudioSystem.getAudioInputStream(fileCanzone);//Ottiene uno stream audio dal file della canzone.
                Clip clip = AudioSystem.getClip();//Ottiene un oggetto Clip che può essere utilizzato per riprodurre un audio.
                clip.open(audioStream);//Apre lo stream audio nel clip, preparandolo per la riproduzione.
                
                System.out.println("Riproduzione canzone: " + canzoneSelezionata);
                clip.start();//Avvia la riproduzione dell'audio.
                

                //Timer per Limitare il Tempo di Risposta
                
                Timer timer = new Timer();//Crea un nuovo timer.
                timer.schedule(new TimerTask() {//Programma un compito (TimerTask) da eseguire dopo 10 secondi
                    @Override
                    public void run() {
                        
                        //Gestione del TimerTask

                        clip.stop(); // Ferma la riproduzione della canzone.
                        System.out.println("Tempo scaduto! Qual era la canzone?");
                        // Attende input dell'utente dopo che il timer è scaduto
                        try {
                            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Prepara un BufferedReader per leggere l'input dell'utente dalla console.
                            System.out.println("Inserisci il nome della canzone: ");
                            String nomeCanzoneUtente = reader.readLine().trim().toLowerCase(); // Normalizza l'input dell'utente
                            
                            // Estrai il nome della canzone dal percorso del file per il confronto
                            String nomeCanzoneReale = new File(canzoneSelezionata).getName().toLowerCase().replace(".wav", "");
                            
                            if (nomeCanzoneUtente.equals(nomeCanzoneReale)) {
                                System.out.println("Complimenti! Hai indovinato.");
                            } else {
                                System.out.println("Mi dispiace, hai sbagliato. La canzone era: " + nomeCanzoneReale);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }, 10000); // 10000 millisecondi = 10 secondi
                
            } else {
                System.err.println("Il file della canzone non esiste: " + canzoneSelezionata);
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private static String selezionaCanzoneCasuale() {
        Random random = new Random();
        int indice = random.nextInt(canzoni.length);
        return canzoni[indice];
    }
}
