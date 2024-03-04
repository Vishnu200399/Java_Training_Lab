package DS;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        String str = "Programming";
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c->sb1.append((char)c));
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch,i+1);
            if(idx==-1)
            {
                sb2.append(ch);
            }
        }
        System.out.println(sb2);
    }
}
