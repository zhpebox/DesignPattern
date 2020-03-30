package test.command;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2020/3/30
 */
public class OpenCommand implements Command {

    Light light ;

    public OpenCommand(Light light) {
        this.light = light;
    }

    @Override
    public void open() {
        this.light.openL();
    }

    @Override
    public void close() {
        this.light.closeL();
    }
}
