package com.bmcl.numbers;

import java.io.StringWriter;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {


        String text = drink.getText();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }else if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }
        drink.setText(sb.toString());

    }
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
