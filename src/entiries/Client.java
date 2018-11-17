package entiries;

public class Client {
	
	private String name;
	private Integer cpf;
	
	public Client() {
		
	}

	public Client(String name, Integer cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	 @Override
	  public String toString() {
	    return name + " | " + cpf;
	  }

}
