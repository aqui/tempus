package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "operation")
public class Operation extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String operationCode;
	private Date operationDate;
	private String operationOrderNumber;
	private String operationPageNumber;
	private String operationPartCode;
	private String operationDescription;
	private Station operationStation;
	private AnalysisType operationAnalysisType;
	private Date analysisDate;
	private int operatorCount;
	private boolean active;
	private User prepearedBy;
	private User confirmedBy;
	private Equipment equipment;
	private Protection protection;
	private String operationVideoPath;
	private String operationPicturePath;
}
