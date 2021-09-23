public class Test
{
    public static void main(String[]args)
    {
        BasicLL<FractionNode> listF=new BasicLL<FractionNode>();
        FractionNode f1=new FractionNode(3,4);
        FractionNode f2=new FractionNode(2,9);
        FractionNode f3=new FractionNode(4,13);
        FractionNode f4=new FractionNode(3,22);
        FractionNode f5=new FractionNode(7,9);
        System.out.println(f1.toString());
        listF.addFirst(f1);
        listF.addAfter(f2,f1);
        listF.print();
    }
}
