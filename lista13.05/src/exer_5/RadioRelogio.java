package exer_5;

public class RadioRelogio implements Radio, Relogio {

	public String horario;
	public String alarmeHorario;
	public boolean alarme;
	
	private String tipoEmissora;
	private Emissora emissora;
	
	private int volumeRelogio;
	private int volumeRadio;
	
	public RadioRelogio() {
		
		this.horario = "00:00";
		this.volumeRadio = 0;
		this.volumeRelogio = 0;
		
	}

	@Override
	public void setHorario(String horario) {
		
		this.horario = horario;

	}

	@Override
	public String getHorario() {
		return this.horario;
	}

	@Override
	public void setHorarioALarme(String horario) {
		this.alarmeHorario = horario;
	}

	@Override
	public void ligarAlarme() {
		this.alarme = true;

	}

	@Override
	public void desligarAlarme() {
		this.alarme = false;
	}

	@Override
	public void setVolumeRelogio(int volume) {
		this.volumeRelogio =  volume;

	}

	@Override
	public int getVolumeRelogio() {
		return this.volumeRelogio;
	}

	@Override
	public void setEmissora(Emissora emissora, String tipoEmissora) {
		this.emissora = emissora;
		this.tipoEmissora = tipoEmissora;
	}

	@Override
	public Emissora getEmissora() {
		return this.emissora;
	}

	@Override
	public String getTipoEMissora() {
		return this.tipoEmissora;
	}

	@Override
	public void setVolumeRadio(int volume) {
		this.volumeRadio = volume;
	}

	@Override
	public int getVolumeRadio() {
		return this.volumeRadio;
	}

}
