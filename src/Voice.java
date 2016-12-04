import com.sun.speech.freetts.*;

public class Voice {
	
	private com.sun.speech.freetts.Voice voice;
	String name;
	
	public Voice(String name){
		
		this.name = name;
		this.voice = VoiceManager.getInstance().getVoice(this.name);
		this.voice.allocate();

	}
	
	public void say (String s){
		this.voice.speak(s);
	}
	
	public void stop(){
		this.voice.getAudioPlayer().close();
	}
	

}
