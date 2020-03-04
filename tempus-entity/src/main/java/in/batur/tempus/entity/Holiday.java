package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "holiday")
public class Holiday extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Date holidayDate;
	@OneToOne(fetch = FetchType.EAGER)
	private HolidayType holidayType;
}
