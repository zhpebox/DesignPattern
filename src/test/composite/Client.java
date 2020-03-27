package test.composite;

public class Client {
    public static void main(String[] args) {
        Component b1 = new Branch("一年级");
        Component b2 = new Branch("二年级");
        Component b3 = new Branch("三年级");

        Component z1 = new Branch("一组");

        b1.addChild(z1);


        Component c1 = new Leaf("一班");
        Component c2 = new Leaf("二班");
        Component c3 = new Leaf("三班");

        z1.addChild(c1);
        z1.addChild(c2);
        b2.addChild(c3);

        Component school = new Branch("一号学校");
        school.addChild(b1);
        school.addChild(b2);
        school.addChild(b3);

        school.dispaly(1);

    }
}
