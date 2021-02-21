package socialnet.models.servicies;

public class BaseServiceModel {

	private String id;

	public BaseServiceModel() {
		super();
	}

	public BaseServiceModel(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
