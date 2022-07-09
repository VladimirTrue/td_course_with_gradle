package com.example.first_task.first_task;

import java.util.*;

public class Validator {
    public boolean isClosedQuotes(String inputSring) {
        if (inputSring == null) return false;

        Map<Character, Character> quoteMap = new HashMap<>();
        quoteMap.put(')', '(');
        quoteMap.put('}', '{');
        quoteMap.put(']', '[');

        Stack<Character> charactersStack = new Stack<>();

        //перебираем по символам входящуюстроку
        //если это открывающая скобка, то добавляем в стэк
        //иначе, если это закрывающая скобка
        //то если стэк пустой или если первый
        //элемент стэк не являющийся открвающей такой же скобкой
        //возвращаем false
        for (Character ch : inputSring.toCharArray()) {
            if (quoteMap.containsValue(ch)) {
                charactersStack.push(ch);
            } else if (quoteMap.containsKey(ch)) {
                if (charactersStack.isEmpty() || charactersStack.pop() != quoteMap.get(ch)) {
                    return false;
                }
            }
        }
        return charactersStack.isEmpty();
    }

}
