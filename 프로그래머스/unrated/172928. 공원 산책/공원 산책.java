class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j) == 'S'){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        for(int i=0;i<routes.length;i++){
            String direction = routes[i].split(" ")[0];
            int num = Integer.parseInt(routes[i].split(" ")[1]);
            boolean flag = true;
            int k=1;
            int temp = 0;
            while(flag && k <= num){
                switch(direction){
                    case "E" :
                        temp = answer[1] + k;
                        if(temp >= park[0].length())
                            flag = false;
                        else if(park[answer[0]].charAt(temp) == 'X')
                            flag = false;
                        break;
                    case "W" :
                        temp = answer[1] - k;
                        if(temp < 0)
                            flag = false;
                        else if(park[answer[0]].charAt(temp) == 'X')
                            flag = false;
                        break;
                    case "S" :
                        temp = answer[0] + k;
                        if(temp >= park.length)
                            flag = false;
                        else if(park[temp].charAt(answer[1]) == 'X')
                            flag = false;
                        break;
                    case "N" :
                        temp = answer[0] - k;
                        if(temp < 0)
                            flag = false;
                        else if(park[temp].charAt(answer[1]) == 'X')
                            flag = false;
                        break;   
                }
                if(!flag){
                    break;
                }
                k++;
            }
            if(flag){
                switch(direction){
                    case "E" :
                        answer[1] += num;
                        break;
                    case "W" :
                        answer[1] -= num;
                        break;
                    case "S" :
                        answer[0] += num;
                        break;
                    case "N" :
                        answer[0] -= num;
                        break;
                }
            }
        }
        return answer;
    }
}