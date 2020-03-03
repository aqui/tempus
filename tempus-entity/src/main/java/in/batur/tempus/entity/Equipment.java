package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "equipment")
public class Equipment extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String equipmentCode;
	private String equipmentDescription;
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Equipment parentEquipment;
    @OneToMany(mappedBy="parentEquipment", cascade = CascadeType.ALL)
	private Set<Equipment> childEquipment = new HashSet<Equipment>();
}
