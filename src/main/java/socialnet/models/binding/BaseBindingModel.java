package socialnet.models.binding;

public class BaseBindingModel {

	private String id;

	public BaseBindingModel() {
		super();
	}

	public BaseBindingModel(String id) {
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
