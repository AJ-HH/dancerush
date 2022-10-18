package ajhh.dancerush.song;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Song {
    @Id
    private int id;

    private String genre;
    private String song;
    private String artist;
    private int bpm;
    private int easy;
    private int noteseasy;
    private int normal;
    private int notesnormal;
    private boolean unlocked;
    private boolean chinalocked;
    private boolean japanonly;
    private boolean koreaonly;
    private String thumbnail;
    private String easyurl;
    private String normalurl;


    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getEasyurl() {
        return easyurl;
    }

    public void setEasyurl(String easyurl) {
        this.easyurl = easyurl;
    }

    public String getNormalurl() {
        return normalurl;
    }

    public void setNormalurl(String normalurl) {
        this.normalurl = normalurl;
    }

    public String getGenre() {
        return genre;
    }

    public String getSong() {
        return song;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public int getEasy() {
        return easy;
    }

    public int getNoteseasy() {
        return noteseasy;
    }

    public int getNormal() {
        return normal;
    }

    public int getNotesnormal() {
        return notesnormal;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public boolean isChinalocked() {
        return chinalocked;
    }

    public boolean isJapanonly() {
        return japanonly;
    }

    public boolean isKoreaonly() {
        return koreaonly;
    }
}
