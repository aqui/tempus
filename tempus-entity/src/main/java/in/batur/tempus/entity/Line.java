package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
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
@Table(name = "line")
public class Line extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String lineCode;
	private String lineDescription;
	@ManyToOne(fetch = FetchType.LAZY)
    private Department department;
	@OneToMany(mappedBy = "line", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Station> stations = new ArrayList<>();
	@OneToOne
	private WorkHourTemplate workHourTemplate;
}
