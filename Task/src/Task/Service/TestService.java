package Task.Service;

import java.util.*;

public interface TestService {
    TestService INSTANCE = new TestServiceImpl();

    boolean addQuestions(String question);

    boolean addAnswers(String question, String answer, Boolean isRight);

    List<Map.Entry<String, Map<String, Boolean>>> getQuestions(int countQuestions);

}