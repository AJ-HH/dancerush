package ajhh.dancerush.song;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/songlist")
@CrossOrigin
public class SongController {
    @Autowired
    private SongRepository songRepository;

    @GetMapping("/all-songs")
    public @ResponseBody Iterable<Song> getAllSongs() {
        // This returns a JSON or XML with the users
        return songRepository.findAll();
    }

    @GetMapping("/songs")
    public @ResponseBody List<Song> getSongByName(@RequestParam String song){
        return songRepository.findSongs(song);
    }

    @GetMapping("/advanced-search")
    public @ResponseBody List<Song> getAdvancedSearch(@RequestParam String song, @RequestParam String artist, @RequestParam List<String> genre, @RequestParam int[] bpm, @RequestParam int[] easy, @RequestParam int[] normal,
    @RequestParam boolean unlocked){
        return songRepository.findAdvanced(song, artist, genre, bpm, easy, normal, unlocked);
    }
}