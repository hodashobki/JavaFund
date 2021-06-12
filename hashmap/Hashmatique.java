import java.util.HashMap;
import java.util.Set;
public class Hashmatique{
    public void Lyrics(){
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("song1", "lyric1");
    trackList.put("song2", "lyric2");
    trackList.put("song3", "lyric3");
    trackList.put("song4", "lyric4");

    String song = trackList.get("song2");
    System.out.println(song);

    Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }

}
}