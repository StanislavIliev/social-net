package socialnet.models.servicies;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the base service model.")
public class BaseServiceModel {

	@ApiModelProperty(notes = "The id of the base service model.")
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
