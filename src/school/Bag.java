package school;

/**
 * Created by User on 25.10.2017.
 */
public class Bag {
    private Diary diary;
    private Penal penal;

    public Bag(Diary diary, Penal penal){
        this.diary = diary;
        this.penal = penal;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public Penal getPenal() {
        return penal;
    }

    public void setPenal(Penal penal) {
        this.penal = penal;
    }
}
