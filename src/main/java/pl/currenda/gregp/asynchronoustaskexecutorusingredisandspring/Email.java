package pl.currenda.gregp.asynchronoustaskexecutorusingredisandspring;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
	private String email;
	private String subject;
	private String content;
}
