package Exercise05;

/**
 * ClassName:StringPool
 * Package: Exercise05
 * Description:
 * n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 *
 * @Author Joan Jia
 * @Create 2024/3/21 17:18
 * @Version 1.0
 */
public class StringPool {
    public String linkString(char chars,String...str){
        String strs="";
        for(int i=0;i<str.length;i++){
            if(i==0){
                strs+=str[i];
            }else{
                strs+=chars+str[i];
            }
        }
        return strs;
    }
}
