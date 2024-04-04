public class removeDuplicatesInaString {
    public static void removeDuplicates(String str, int index, StringBuilder sb, boolean[] map) {
        if(index == str.length()){
            System.out.println(sb.toString());
            return;
        }
        char currChar = str.charAt(index);

        if(currChar >= 'a' && currChar <= 'z') {
            if(!map[currChar - 'a']){
                map[currChar - 'a'] = true;
                sb.append(currChar);
            }
        } else {
            sb.append(currChar);
        }

        removeDuplicates(str, index + 1, sb, map);
    }
    
    public static void main(String[] args) {
        String str = "apnnnnnnaCollege";
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
