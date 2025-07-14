class Radio{
	
	static String frequencyModulation;
	static String frequencyDeviation;
	static String higherFidelity;
	static String frequencySpectrum;
	static String fmRadioBroadcasting;
	
	public static String frequencyModulation(){
		frequencyModulation	= "FM radio transmits audio signals by varying the frequency of a carrier wave. The amplitude of the carrier wave remains constant. ";
		return frequencyModulation;
	}
	public static String frequencyDeviation(){
		frequencyDeviation="The amount of frequency change (deviation) from the carrier frequency is directly proportional to the amplitude of the audio ";
		return frequencyDeviation;
	}
	public static String higherFidelity(){
		higherFidelity=" FM offers better audio quality with less distortion and a wider frequency response compared to AM. ";
		return higherFidelity;
	}
	public static String frequencySpectrum(){
		frequencySpectrum="FM broadcasting typically operates in the Very High Frequency (VHF) band, usually between 88 and 108 MHz.  ";
		return frequencySpectrum;
	}
	public static String fmRadioBroadcasting(){
		fmRadioBroadcasting="The most common application, offering high-quality audio for music and talk radio";
		return fmRadioBroadcasting;
	}

	
}