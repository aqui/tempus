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
@Table(name = "shift_type")
public class ShiftType extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String shiftTypeCode;
	private String shiftTypeDescription;
}
