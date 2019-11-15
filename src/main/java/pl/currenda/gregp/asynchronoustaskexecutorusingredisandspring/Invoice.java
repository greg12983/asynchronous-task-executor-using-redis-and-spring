package pl.currenda.gregp.asynchronoustaskexecutorusingredisandspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
	private String id;
	private String type;
}
