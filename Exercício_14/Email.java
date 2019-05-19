package Exercício_14;


public class Email {

	private String email;

	//CONSTRUTORES

	public Email(String email) throws Exception {
		this.setEmail(email);
	}
	public Email() throws Exception {
		this("Sem email @");
	}

	//GETS

	public String getEmail() {
		return this.email;
	}

	//SETS

	public void setEmail(String email) throws Exception{
		try {
			if(email.contains("@")) {
				this.email = email; 
			}
		}
		catch(Exception e) {
			throw new Exception("ERROR");
		}
	}

	//EQUALS
	public boolean equals(Object objeto) {
		Email aux = (Email)objeto;
		if( this.getEmail() == aux.getEmail()) {
			return true;
		}
		return false;
	}

	//TOSTRING
	public String toString() {
		StringBuilder str = new StringBuilder();

		str.append(this.getEmail());

		return str.toString();
	}

}
