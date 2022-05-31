package td_curse_with_gradle;

import java.util.*;

public class Validator {

    public static void main(String[] args) {

        System.out.println(isClosedQuotes("}{"));
        System.out.println(isClosedQuotes("({))"));
        System.out.println(isClosedQuotes("()()"));
        System.out.println(isClosedQuotes("()"));
        System.out.println(isClosedQuotes("(()"));
        System.out.println(isClosedQuotes("(({}([)]))"));
        System.out.println(isClosedQuotes("(({}[()]))"));
    }

    public static boolean isClosedQuotes(String str) {
        if (str == null) return false;

        Map<Character, Character> quoteMap = new HashMap<>();
        quoteMap.put(')', '(');
        quoteMap.put('}', '{');
        quoteMap.put(']', '[');

        Stack<Character> charactersStack = new Stack<>();

        //перебираем по символам входящуюстроку
        for (Character ch : str.toCharArray()) {
            //если это открывающая скобка, то добавляем в стэк
            if (quoteMap.containsValue(ch)) {
                charactersStack.push(ch);
                //иначе, если это закрывающая скобка
            } else if (quoteMap.containsKey(ch)) {
                //то если стэк пустой или если первый
                //элемент стэк не являющийся открвающей такой же скобкой
                //возвращаем false
                if (charactersStack.isEmpty() || charactersStack.pop() != quoteMap.get(ch)) {
                    return false;
                }
            }
        }
        return charactersStack.isEmpty();
    }

}
