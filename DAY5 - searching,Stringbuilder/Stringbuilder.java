public class Stringbuilder {
    public static void main(String[] args) {
        String input="karuuuurrrrnnnnnaaaaaccceeee";
        StringBuilder sb=new StringBuilder();
        boolean[] seen = new boolean[256];
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);


            if(!seen[ch]){
                seen[ch]=true;
                sb.append(ch);
            }
        }
        System.out.println(sb);


    }
}
