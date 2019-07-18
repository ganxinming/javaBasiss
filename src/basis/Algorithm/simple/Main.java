package basis.Algorithm.simple;

import java.util.Scanner;

/**
 * @Author Badribbit
 * @create 2019/7/2 20:12
 * @Define
 * @Tutorials
 * @Opinion
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] by=new int[26];
        int [] da=new int[26];
        int [] sum=new int[52];
        int [] flag=new int[14];
        for (int i=0;i<26;i++){
            by[i]=in.nextInt();
        }
        for (int i=0;i<26;i++){
            da[i]=in.nextInt();
        }
        for (int i=0,j=0;i<26;i++){
            sum[j++]=by[i];
            if (flag[by[i]] == 1){

            }
            sum[j++]=da[i];
        }
    }
}
