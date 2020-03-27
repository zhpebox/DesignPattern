package test.composite;

public class Client {
    public static void main(String[] args) {
        Component b1 = new Branch("һ�꼶");
        Component b2 = new Branch("���꼶");
        Component b3 = new Branch("���꼶");

        Component z1 = new Branch("һ��");

        b1.addChild(z1);


        Component c1 = new Leaf("һ��");
        Component c2 = new Leaf("����");
        Component c3 = new Leaf("����");

        z1.addChild(c1);
        z1.addChild(c2);
        b2.addChild(c3);

        Component school = new Branch("һ��ѧУ");
        school.addChild(b1);
        school.addChild(b2);
        school.addChild(b3);

        school.dispaly(1);

    }
}
