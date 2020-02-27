package in.batur.tempus.entity;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	private String description;
	private Time startHour;
	private Time endHour;
	@ManyToOne(fetch = FetchType.LAZY)
    private WorkHour workHour;
	@OneToOne
	private ShiftType shiftType;
}
