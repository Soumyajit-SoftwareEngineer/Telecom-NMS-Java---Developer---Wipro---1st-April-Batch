package Java_AdvanceTraining_Day6_Wipro;

interface MediaPlayerl{

public void play (String audioType, String fileName); }

interface AdvancedMediaPlayer1{
	public void playVLC (String fileName); 
	public void playMp4 (String fileName); 
	}

//Step: 2
class VLCPlayerl implements AdvancedMediaPlayer1{
@Override
public void playVLC (String fileName) { 
	System.out.println("Playing VLC file name: "+fileName);

}
@Override
public void playMp4 (String fileName) {
//do nothing.
}
}

class MP4Player1 implements AdvancedMediaPlayer1 {
@Override
public void playVLC (String fileName) {
//do nothing..

}

@Override
public void playMp4 (String fileName) {
System.out.println("Playing MP4 for file name: "+fileName);

}
}

//Step: 3

class MediaAdapterl implements MediaPlayerl{
AdvancedMediaPlayer1 advanedMediaPlayer;
public MediaAdapterl (String audioType) {
if (audioType.equalsIgnoreCase ("vlc")) 
	advanedMediaPlayer = new VLCPlayerl();

else if (audioType.equalsIgnoreCase("mp4")) 
	advanedMediaPlayer = new MP4Player1();

}

@Override
public void play (String audioType, String fileName) {
if (audioType.equalsIgnoreCase ("mp4"))
advanedMediaPlayer.playMp4 (fileName); 
else if (audioType.equalsIgnoreCase("vlc")) 
	advanedMediaPlayer.playVLC(fileName);

}
}

//Step: 4
class AudioPlayerl implements MediaPlayerl {
	MediaAdapterl mediaAdapter;
@Override
public void play (String audioType, String fileName) {
if (audioType.equalsIgnoreCase("mp3"))
System.out.println("Playing Mp3 for the file name "+fileName);
else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
	mediaAdapter = new MediaAdapterl (audioType); //Runtime polymorphism is created.. 
	mediaAdapter.play(audioType, fileName); 
	} //Corresponding file is played..

else
System.out.println("Invalid Media...");
}
}

public class Adapter_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudioPlayerl audioPlayer = new AudioPlayerl();
		audioPlayer.play("mp3", "123 file..");
		audioPlayer.play("mp4", "23456 file..");
		audioPlayer.play("vlc", "vlc file..");
		audioPlayer.play("avi", "avi file");

	}

}
