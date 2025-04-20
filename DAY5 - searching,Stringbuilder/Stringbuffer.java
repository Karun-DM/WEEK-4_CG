public class Stringbuffer {
    public static void main(String[] args) {
        String[] words={"karun","is","ace"};
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            if(i!=words.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());


    }
   
}
