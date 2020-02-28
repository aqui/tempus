package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "work_hour_template")
public class WorkHourTemplate extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Column(unique = true, nullable = false)
	private String workHourTemplateDescription;
	@Column(columnDefinition = "boolean default false") 
	private boolean active;
	@OneToMany(mappedBy = "workHourTemplate", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<WorkHour> shifts = new ArrayList<>();
}
