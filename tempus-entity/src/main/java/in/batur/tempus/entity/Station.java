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
@Table(name = "station")
public class Station extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String stationName;
	private String stationDescription;
	@ManyToOne(fetch = FetchType.LAZY)
    private Line line;
	@OneToMany(mappedBy = "station", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Warehouse> warehouses = new ArrayList<>();
}
