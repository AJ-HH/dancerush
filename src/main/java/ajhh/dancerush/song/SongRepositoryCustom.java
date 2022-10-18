package ajhh.dancerush.song;

import java.util.List;


public interface SongRepositoryCustom {
    List<Song> findAdvanced(String song, String artist, List<String> genre, int[] bpm, int[] easy, int[] normal, boolean unlocked);
}
