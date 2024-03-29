package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "department")
public class Department extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String departmentCode;
	private String departmentDescription;
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Line> lines = new ArrayList<>();
	@OneToOne
	private WorkHourTemplate workHourTemplate;
}
