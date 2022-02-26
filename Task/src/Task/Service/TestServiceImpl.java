package Task.Service;

import java.util.*;

public class TestServiceImpl implements TestService {

    Map<String, Map<String, Boolean>> questions = new LinkedHashMap<>();

    @Override
    public boolean addQuestions(String question) {
        if (questions.containsKey(question)){
            return false;
        }
        questions.put(question, null);
        return true;
    }

    @Override
    public boolean addAnswers(String question, String answer, Boolean isRight) {

        Map<String, Boolean> values = questions.get(question);
        if (values == null){
            values = new LinkedHashMap<>();
        }
        values.put(answer, isRight);
        questions.put(question, values);
        return true;
    }

    @Override
    public List<Map.Entry<String, Map<String, Boolean>>> getQuestions(int countQuestions) {

        Set<Map.Entry<String, Map<String, Boolean>>> questionSet =  questions.entrySet();

        List<Map.Entry<String, Map<String, Boolean>>> questionList = new ArrayList<>(questionSet);

        Collections.shuffle(questionList);

        return questionList.subList(0, countQuestions);
    }
}