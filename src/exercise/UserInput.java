package exercise;

public class UserInput {
    public static StringBuilder value = new StringBuilder();
    public static class TextInput {

        public void add(char c){
            value.append(c);
        }


        public static String getValue() {
            return value.toString();
        }
    }

    public static class NumericInput extends TextInput{
        @Override
        public void add(char c){
            if(Character.isDigit(c)){
                value.append(c);
            }
        }

        public static String getValue() {
            return value.toString();
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}