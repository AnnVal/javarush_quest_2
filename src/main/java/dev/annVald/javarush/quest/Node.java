package dev.annVald.javarush.quest;

import java.util.Objects;

public class Node {
    private int id;
    private String text;
    private Option option1;
    private Option option2;

    private String picture;

    public Node (int id){
        this.id=id;
        option1 = new Option();
        option2 = new Option();
    }

    public int getId() {
        return id;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOption1Text() {
        return option1.getTextForChoice();
    }

    public String getOption2Text() {
        return option2.getTextForChoice();
    }

    public int getNextNodeIdForOption1(){
        return option1.getNextNodeId();
    }

    public int getNextNodeIdForOption2(){
        return option2.getNextNodeId();
    }

    public Option getOption1() {
        return option1;
    }

    public Option getOption2() {
        return option2;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return id == node.id && Objects.equals(text, node.text) && Objects.equals(option1, node.option1) && Objects.equals(option2, node.option2) && Objects.equals(picture, node.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, option1, option2, picture);
    }

    public class Option{
        String textForChoice;
        int nextNodeId;

        public String getTextForChoice() {
            return textForChoice;
        }

        public void setTextForChoice(String textForChoice) {
            this.textForChoice = textForChoice;
        }

        public int getNextNodeId() {
            return nextNodeId;
        }

        public void setNextNodeId(int nextNodeId) {
            this.nextNodeId = nextNodeId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Option option = (Option) o;
            return nextNodeId == option.nextNodeId && Objects.equals(textForChoice, option.textForChoice);
        }

        @Override
        public int hashCode() {
            return Objects.hash(textForChoice, nextNodeId);
        }
    }
}
