package in.batur.tempus.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "operation_step")
public class OperationStep extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int operationStepOrderNumber;
	private String reference;
	private Warehouse warehouse;
	private Part part;
	private double numberOfPart;
	private WorkType workType;
	private String operationStepDescription;
	private String imagePath;
	private String videoPath;
	private double duration;
}
