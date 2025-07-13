class RadioRunner{
	
	public static void main(String[]radio){
		
	String isfrequencyModulation	=Radio.frequencyModulation();
	System.out.println("the Radio has frequencyModulation "+isfrequencyModulation);
	
	String isfrequencyDeviation	=Radio.frequencyDeviation();
	System.out.println("the Radio has frequencyDeviation "+isfrequencyDeviation);
	
	String ishigherFidelity	=Radio.higherFidelity();
	System.out.println("the Radio has higherFidelity "+ishigherFidelity);
	
	String isfrequencySpectrum	=Radio.frequencySpectrum();
	System.out.println("the Radio has frequencySpectrum "+isfrequencySpectrum);
	
	String isfmRadioBroadcasting	=Radio.fmRadioBroadcasting();
	System.out.println("the Radio is fmRadioBroadcasting "+isfmRadioBroadcasting);
	
	

}
}