package com.example.first_task.first_task;

import java.util.List;
import java.util.stream.Collectors;

public class Archivator {

    public String doArchiveStr(String inputString) {
        if (inputString.isEmpty()) {
            return "Недопустимое значение: Введенная строка пустая";
        }

        if (inputString.matches(".*[0-9].*|\\s*")) {
            return "недопустимое значение: Строка содержит цифры или пробел";
        }

        StringBuilder stringBuilder = new StringBuilder();
        List<Character> charsFromInputString = inputString.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());

        Character currentChar;
        int count = 0;
        for (int i = 0; i < charsFromInputString.size(); i++) {
            count++;
            currentChar = charsFromInputString.get(i);
            if ((i + 1) < charsFromInputString.size() && currentChar == charsFromInputString.get(i + 1)) {
                //если есть следующий элемент и если он раввен текущему
                continue;
            } else if (count == 1) {
                //если счетчик 1, добавляем просто символ, обнуляем count
                stringBuilder.append(currentChar);
                count = 0;
            } else {
                //иначе добавляем количество текущего символа и сам символ, обнуляем count
                stringBuilder.append(count);
                stringBuilder.append(currentChar);
                count = 0;
            }
        }
        return stringBuilder.toString();
    }

}
