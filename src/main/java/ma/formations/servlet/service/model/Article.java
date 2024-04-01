package ma.formations.servlet.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article { 
	private Integer id;
	private String description;
	private Double quantite;
	private Double price;
}
