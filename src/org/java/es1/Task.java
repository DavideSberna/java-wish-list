package org.java.es1;

public class Task {
	private String destinatario;
	private String regalo;
	
	public Task(String destinatario, String regalo) throws Exception {
		setDestinatario(destinatario);
		setRegalo(regalo);
		 
		
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		 
		this.destinatario = destinatario;
	}

	public String getRegalo() {
		return regalo;
	}

	public void setRegalo(String regalo) throws Exception {
		if(regalo.isBlank()) {
			throw new Exception("Regalo non può essere vuoto");
		}
		this.regalo = regalo;
	}
	
	@Override
	public String toString() {
		
		return "Regalo: " + getRegalo() + " destinato a: " + getDestinatario();
	}

}
