package hng_java_boilerplate.dtos.requests;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
@Setter
public class SubmitSecurityQuestionsRequest {

    private List<SecurityQuestionAnswer> answers;



}
