package com.example.Random.Jokes.Model;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long todoId;
    private String todoName;
    private String todoAddress;
    private String todoCode;
}
