import Task.Service.TestService;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        TestService testService = TestService.INSTANCE;
        testService.addQuestions("Кыргызстан");
        testService.addAnswers("Кыргызстан", "Париж", false);
        testService.addAnswers("Кыргызстан", "Бишкек", true);
        testService.addAnswers("Кыргызстан", "Москва", false);

        testService.addQuestions("Казахстан");
        testService.addAnswers("Казахстан", "Астана", true);
        testService.addAnswers("Казахстан", "Бишкек", false);
        testService.addAnswers("Казахстан", "Москва", false);

        testService.addQuestions("Россия");
        testService.addAnswers("Россия", "Париж", false);
        testService.addAnswers("Россия", "Бишкек", false);
        testService.addAnswers("Россия", "Москва", true);

        testService.addQuestions("Украина");
        testService.addAnswers("Украина", "Донбасс", false);
        testService.addAnswers("Украина", "Луганск", false);
        testService.addAnswers("Украина", "Киев", true);

        List<Map.Entry<String, Map<String, Boolean>>> questions = testService.getQuestions(3);

        int countAns = 0;

        for (Map.Entry<String, Map<String, Boolean>> item : questions) {
            System.out.println("Столица " + item.getKey());

            Map<String, Boolean> innerMap = item.getValue();
            int row = 1;
            for (Map.Entry<String, Boolean> innerItem : innerMap.entrySet()) {
                System.out.println(row + ". " + innerItem.getKey());
                row++;
            }
            System.out.print("Введите название столицы: ");
            String userAnswer = sc.next();

            Boolean value = innerMap.get(userAnswer);
            if (value != null) {
                String answerText = value ? "Верно" : "Неверно";
                if (answerText.equals("Верно")){
                    countAns++;
                }
                System.out.println(answerText);

            } else{
                System.out.println("Нет такого ответа");
            }

        }

        int percentage = (100 / questions.size()) * countAns;

        System.out.println(percentage);
    }
}