import java.io.FileWriter;
import java.io.IOException;

public  class FileWriting implements Runnable {
    int NumberOfThreads;
    public FileWriting(int a){
        NumberOfThreads = a;
    }
    public void run() {
        try {
            FileWriter F1 = new FileWriter("Deepu" + Thread.currentThread().getId()+ ".txt");
            System.out.println( "Thread "+ Thread.currentThread().getId() + ": Is Writing to the file");
            for (int  i = 1; i <= 1000000000/NumberOfThreads; i++){
                F1.write("Line " +i + "\n");
            }
            F1.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
