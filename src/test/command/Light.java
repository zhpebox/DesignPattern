package test.command;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2020/3/30
 */
public class Light  {
    int status = 0;
    public void openL(){
        this.status = 1;
        System.out.println("This light is open!");
    }


    public void closeL(){
        this.status = 0;
        System.out.println("This light is clase!");
    }

}
