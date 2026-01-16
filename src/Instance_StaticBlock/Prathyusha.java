package Instance_StaticBlock;

    class Prathyusha {
        int a = 10;//instance variables
        int b = 9;

        static {
            System.out.println("Static block");
        }

        public static void main(String[] args) { //static variable so we need to create object and access instance variable/
            Prathyusha newObj = new Prathyusha();
            System.out.println(newObj.b);
        }

        {
            System.out.println("Instance block:"+a);//instance area we can call directly.
        }
    }
