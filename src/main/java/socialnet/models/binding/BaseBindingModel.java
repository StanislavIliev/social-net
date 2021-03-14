package socialnet.models.binding;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@ApiModel(description = "Details about the base entity binding model.")
public class BaseBindingModel {

	@ApiModelProperty(notes = "The id of the base entity.")
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
