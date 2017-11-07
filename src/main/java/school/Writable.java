package school;

public class Writable {
    public String lastWritten;

    public String getLastWritten() {
        return lastWritten;
    }

    public void setLastWritten(String lastWritten) {
        this.lastWritten = lastWritten;
    }

    public String write(String string){
        return "Writable's written "+string;
    }
}
