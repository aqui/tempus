package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
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
@Table(name = "work_hour")
public class WorkHour extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
    private WorkHourTemplate workHourTemplate;
	@OneToMany(mappedBy = "workHour", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Shift> shifts = new ArrayList<>();
}
