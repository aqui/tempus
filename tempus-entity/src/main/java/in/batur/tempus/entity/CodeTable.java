package in.batur.tempus.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
@Table(name = "code_table")
public class CodeTable extends BaseEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String codeTableCode;
	private String codeTableDescription;
	private boolean systemParameter;
	@OneToMany(mappedBy = "codeTable", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Code> codes = new ArrayList<>();
}
