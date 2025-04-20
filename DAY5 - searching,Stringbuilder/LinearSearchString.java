public class LinearSearchString {
    public static void main(String[] args) {
        String[] sentence={
            "java is programming lang","ui is java","ui is sss"
        };
        String word="ui";
        String result="not there";
        for(int i=0;i<sentence.length;i++){
            if(sentence[i].contains(word)){
                result=sentence[i];
                break;
            }
        }      System.out.println(result);
    }   
}
