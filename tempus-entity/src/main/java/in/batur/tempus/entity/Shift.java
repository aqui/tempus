package in.batur.tempus.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "shift")
public class Shift extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String shiftDescription;
	private Time shiftStartHour;
	private Time shiftEndHour;
	@ManyToOne(fetch = FetchType.LAZY)
    private WorkHour workHour;
	@OneToOne
	private ShiftType shiftType;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "shift_work_type", joinColumns = @JoinColumn(name = "shift_id"), inverseJoinColumns = @JoinColumn(name = "work_type_id"))
	private Set<WorkType> workTypes = new HashSet<>();
}
