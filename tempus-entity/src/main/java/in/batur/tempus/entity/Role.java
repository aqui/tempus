package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "role")
public class Role extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String roleName;
	@JsonIgnore
	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "role_authority", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "authority_id"))
	private Set<Authority> authorities = new HashSet<>();
}
