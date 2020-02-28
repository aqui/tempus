package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "authority")
public class Authority extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	@ManyToMany(mappedBy = "authorities")
	private Set<Role> roles = new HashSet<>();
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Authority parentAuthority;
    @OneToMany(mappedBy="parentAuthority", cascade = CascadeType.ALL)
	private Set<Authority> childAuthority = new HashSet<Authority>();
}
