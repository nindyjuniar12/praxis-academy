package latihan1;
class Base{
    public void display()
    {
        System.out.println("Base display()");
    }
}
    class Derived extends Base{

        @Override
        public void display(final int x) {
            System.out.println("Derived display(int)");
        }

        public static void main(final String args[]) {
            final Derived obj = new Derived();
            obj.display();
        }
    }
