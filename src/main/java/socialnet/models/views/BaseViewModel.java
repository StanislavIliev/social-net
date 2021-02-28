package socialnet.models.views;

public class BaseViewModel {

	private String id;

	public BaseViewModel() {
		super();
	}

	public BaseViewModel(String id) {
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
