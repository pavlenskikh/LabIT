package school;

public class Writable {
    public String lastWritten;

    public String getLastWritten() {
        return lastWritten;
    }

    public String write(String string){
        return "Writable's written "+string;
    }
}
