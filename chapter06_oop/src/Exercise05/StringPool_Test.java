package Exercise05;

/**
 * ClassName:StringPool_Test
 * Package: Exercise05
 * Description:
 *
 * @Author Joan Jia
 * @Create 2024/3/21 17:36
 * @Version 1.0
 */
public class StringPool_Test {
    public static void main(String[] args) {
        StringPool contact=new StringPool();
        System.out.println(contact.linkString('-'));
        System.out.println(contact.linkString('-',"Jqq","is","beautiful"));
    }
}
