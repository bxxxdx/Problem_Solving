class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        new_id = new_id.equals("") ? "a" : new_id;
        new_id = new_id.length() >= 16 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("[.]$", ""); 
        while(new_id.length() <= 2){
            String temp = new_id.substring(new_id.length()-1);
            new_id += temp;
        }
        
        return new_id;
    }
}