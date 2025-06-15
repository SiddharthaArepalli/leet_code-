class Solution {
    public String generateTag(String caption){
        String words[] = caption.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        for(int j = 0;j<words.length;j++){
            String word = words[j];
            StringBuilder s = new StringBuilder(); 
             int wl = word.length();
             for(int i = 0 ;i<wl;i++){
                if(Character.isLetter(word.charAt(i))){
                    if(i == 0){
                        if(j == 0){
                            s.append(Character.toLowerCase(word.charAt(i)));
                        }else{
                            s.append(Character.toUpperCase(word.charAt(i)));
                        }
                    }else{
                        s.append(Character.toLowerCase(word.charAt(i)));
                    }
                }
             }
             sb.append(s);
        }
        if(sb.length()>100){
            return sb.substring(0,100).toString();
        }
        return sb.toString();
    }
}