package com.game.GUI;

import java.applet.Applet;
import java.awt.TextField;

@SuppressWarnings("removal")
public class GUI extends Applet {

//Instead of using a StringBuffer, use a TextField:
TextField field;

public void init() {
    //Create the text field and make it uneditable.
    field = new TextField();
    field.setEditable(false);

//Set the layout manager so that the text field will be
//as wide as possible.
    setLayout(new java.awt.GridLayout(1,0));

//Add the text field to the applet.
    add(field);
    validate();

    addItem("initializing... ");
}

void addItem(String newWord) {
    //This used to append the string to the StringBuffer;
    //now it appends it to the TextField.
    String t = field.getText();
    System.out.println(newWord);
    field.setText(t + newWord);
    repaint();
}
}



