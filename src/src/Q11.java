import java.util.Scanner;

class Q11 {
    public String solution(String code) {
        String ret = "";
        int mode = 0;

       char[] arr = new char[code.length()];
        for(int i=0;i<code.length();i++){
            arr[i] = code.charAt(i);
        }

        for(int i=0;i<arr.length;i++) {
            if (mode == 0) {
                if (arr[i]=='1'){
                    mode=1;
                }else{
                    if(i%2==0){
                        ret += arr[i];
                    }
                }
            } else if (mode == 1) {
                if(arr[i]=='1'){
                    mode=0;
                }else{
                    if(i%2==1){
                        ret += arr[i];
                    }
                }
            }
        }

        if(ret.equals("")){
            ret = "EMPTY";
        }

        return ret;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        Q11 q12 = new Q11();
        System.out.print(q12.solution(code));
    }
}